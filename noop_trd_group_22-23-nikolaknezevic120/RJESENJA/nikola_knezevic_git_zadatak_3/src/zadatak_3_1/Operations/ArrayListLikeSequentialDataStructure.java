package zadatak_3_1.Operations;

import java.util.ArrayList;

public class ArrayListLikeSequentialDataStructure<E> implements SeqDataStructureOperations<E> {

    private final ArrayList<E> list;

    public ArrayListLikeSequentialDataStructure(ArrayList<E> list) {
        this.list = list;
    }

    @Override
    public void deleteAllElements() {
        this.list.clear();
    }

    @Override
    public boolean containElement(E element) {
        return this.list.contains(element);
    }

    @Override
    public boolean structureIsEmpty() {
        return this.list.isEmpty();
    }

    @Override
    public E getElementFromPosition(int position) {
        return this.list.get(position);
    }

    @Override
    public int sizeOfStructure() {
        return this.list.size();
    }

    @Override
    public E removeFromPosition(int position) {
        return this.list.remove(position);
    }

    @Override
    public String toString() {
        return "ArrayListLikeSequentialDataStructure{" +
                "list=" + list +
                '}';
    }
}