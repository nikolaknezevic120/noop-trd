package zadatak_3_1.Operations;

public class OperationCLS<E> {

    private SeqDataStructureOperations<E> operations;

    public void setOperations(SeqDataStructureOperations<E> operations) {
        this.operations = operations;
    }

    public void performClearAllOperation() {
        stopProcessIfOperationsEmpty();
        System.out.println("Performing clear all operation");
        System.out.println("State before deletion => " + operations.toString());
        operations.deleteAllElements();
        System.out.println("State after deletion => " + operations.toString());
    }

    public void elementInStructure(E element) {
        stopProcessIfOperationsEmpty();

        System.out.println("Contains element " + element + " => " + operations.containElement(element));
    }

    public void getElementFromPosition(int indxPos) {
        stopProcessIfOperationsEmpty();
        if (operations.structureIsEmpty()) {
            System.out.println("Empty structure");
        }

        System.out.println("Element at position " + indxPos + " => " + operations.getElementFromPosition(indxPos));
        ;
    }

    public void getSize() {
        stopProcessIfOperationsEmpty();
        System.out.println("Size of structure is => " + operations.sizeOfStructure());
    }

    public void removeElement(int indxPos) {
        stopProcessIfOperationsEmpty();
        System.out.println("Calling removing element at position => " + indxPos + ", Element being removed is => " + operations.removeFromPosition(indxPos));
    }

    private void stopProcessIfOperationsEmpty() {
        if (operationsIsEmpty()) {
            throw new RuntimeException("Operation must be set");
        }
    }

    private boolean operationsIsEmpty() {
        return operations == null;
    }
}
