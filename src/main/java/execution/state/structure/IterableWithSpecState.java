package execution.state.structure;

import execution.state.ExecutionState;
import execution.state.SingleState;
import execution.types.AlkValue;
import org.antlr.v4.runtime.tree.ParseTree;
import execution.types.AlkIterableValue;
import execution.types.alkArray.AlkArray;
import parser.exceptions.AlkException;
import parser.visitors.structure.DataStructureVisitor;
import util.Payload;
import util.exception.InternalException;
import util.types.Value;

public class IterableWithSpecState extends SingleState<AlkIterableValue, AlkArray> {

    private final Class<? extends AlkIterableValue> clazz;

    public IterableWithSpecState(ParseTree tree,
                                 Payload payload,
                                 ParseTree spec,
                                 Class<? extends AlkIterableValue> clazz)
    {
        super(tree, payload, spec, DataStructureVisitor.class);
        this.clazz = clazz;
    }

    @Override
    protected AlkIterableValue interpretResult(Value value) {
        if (!(value.toRValue() instanceof AlkArray))
            throw new AlkException(AlkException.ERR_SPEC_ITERABLE_REQUIRED);

        AlkArray rightValue = (AlkArray) value.toRValue();
        try {
            AlkIterableValue iterableValue = clazz.newInstance();
            iterableValue.addAll(rightValue.toArray(generator));
            return iterableValue;
        } catch (InstantiationException | IllegalAccessException e) {
            throw new InternalException(e);
        }
    }

    @Override
    public ExecutionState clone(Payload payload) {
        IterableWithSpecState copy = new IterableWithSpecState(tree, payload, null, clazz);

        return super.decorate(copy);
    }
}
