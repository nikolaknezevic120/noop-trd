package zadatak_3_1.Operations;

import java.util.Arrays;

public class ArrayLikeSequentialDataStructure<E> implements SeqDataStructureOperations<E> {

    private final E[] array;

    public ArrayLikeSequentialDataStructure(E[] array) {
        this.array = array;
    }

    @Override
    public void deleteAllElements() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
    }

    @Override
    public boolean containElement(E element) {
        for (E e : array) {
            if (e.equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean structureIsEmpty() {
        return array.length == 0;
    }

    @Override
    public E getElementFromPosition(int position) {
        throwErrorIfOutOfBounds(position);
        return array[position];
    }

    @Override
    public int sizeOfStructure() {
        return array.length;
    }

    @Override
    public E removeFromPosition(int position) {
        throwErrorIfOutOfBounds(position);
        E field = array[position];
        array[position] = null;
        return field;
    }

    private void throwErrorIfOutOfBounds(int position){
        if(isOutOfBounds(position)){
            throw new RuntimeException("Out of bounds!");
        }
    }

    private boolean isOutOfBounds(int position) {
        return position < 0 || position > array.length;
    }

    @Override
    public String toString() {
        return "ArrayLikeSequentialDataStructure{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
