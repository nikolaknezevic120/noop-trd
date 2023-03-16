package zadatak_3_1.Operations;

public interface SeqDataStructureOperations<E> {

    void deleteAllElements();
    boolean containElement(E element);
    boolean structureIsEmpty();
    E getElementFromPosition(int position);
    int sizeOfStructure();
    E removeFromPosition(int position);
}
