package impl.types.alkList;

import impl.exceptions.AlkException;
import impl.types.AlkIterableValue;
import impl.types.AlkValue;
import impl.types.alkIterator.AlkIterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import static impl.exceptions.AlkException.ERR_LIST_EMPTY;

public class AlkList extends AlkIterableValue {

    private LinkedList<AlkValue> list;

    public AlkList() {
        type = "List";
        isDataStructure = true;
        isIterable = true;
        list = new LinkedList<>();;
    }

    public AlkValue at(AlkValue operand) throws AlkException {
        FunctionListHelper help = new FunctionListHelper(list);
        return help.at(operand);
    }

    public AlkIterator first() {
        ListIterator it = (ListIterator) this.iterator();
        return new AlkIterator(it, this);
    }

    public AlkIterator end()
    {
        return new AlkIterator(list.listIterator(list.size()), this); // TODO de optimizat
    }

    public AlkValue insert(AlkValue position, AlkValue value) throws AlkException {
        FunctionListHelper help = new FunctionListHelper(list);
        help.insert(position, value);
        return this;
    }

    public AlkValue popBack() throws AlkException {
        FunctionListHelper help = new FunctionListHelper(list);
        help.popBack();
        return this;
    }

    public AlkValue popFront() throws AlkException {
        FunctionListHelper help = new FunctionListHelper(list);
        help.popFront();
        return this;
    }

    public AlkValue pushBack(AlkValue value) throws AlkException {
        FunctionListHelper help = new FunctionListHelper(list);
        help.pushBack(value);
        return this;
    }

    public AlkValue pushFront(AlkValue value) throws AlkException {
        FunctionListHelper help = new FunctionListHelper(list);
        help.pushFront(value);
        return this;
    }

    public AlkValue removeAllEqTo(AlkValue value) throws AlkException {
        FunctionListHelper help = new FunctionListHelper(list);
        help.removeAllEqTo(value);
        return this;
    }

    public AlkValue removeAt(AlkValue position) throws AlkException {
        FunctionListHelper help = new FunctionListHelper(list);
        help.removeAt(position);
        return this;
    }

    public AlkValue size() throws AlkException {
        FunctionListHelper help = new FunctionListHelper(list);
        return help.size();
    }

    public AlkValue topBack() throws AlkException {
        FunctionListHelper help = new FunctionListHelper(list);
        return help.topBack();
    }

    public AlkValue topFront() throws AlkException {
        FunctionListHelper help = new FunctionListHelper(list);
        return help.topFront();
    }

    public AlkValue update(AlkValue position, AlkValue value) throws AlkException {
        FunctionListHelper help = new FunctionListHelper(list);
        help.update(position, value);
        return this;
    }



    @Override
    public AlkValue clone() {
        AlkList copy = new AlkList();
        copy.list = (LinkedList) list.clone();
        return copy;
    }

    @Override
    public String toString() {
        return list.toString();
    }

    @Override
    public Iterator<AlkValue> iterator() {
        return list.iterator();
    }

    public void push_back(AlkValue value) {
        list.addLast(value);
    } //TODO de modioficat in functia default


}