package zadatak_3_1;

import java.util.ArrayList;
import java.util.Arrays;

import zadatak_3_1.Operations.*;

public class App {

    public static void main(String[] args) {
        Integer[] array = {-10, 0, 23, 230, -44, 40, 76, 1000};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(array));

        System.out.println("Start Client array contains => " + arrayList);

        OperationCLS<Integer> operationCLS = new OperationCLS<>();

        operationCLS.setOperations(new ArrayListLikeSequentialDataStructure<>(arrayList));

        operationCLS.getSize();
        operationCLS.elementInStructure(10);
        operationCLS.elementInStructure(230);
        operationCLS.getElementFromPosition(5);
        operationCLS.removeElement(1);
        operationCLS.getSize();
        operationCLS.performClearAllOperation();

        System.out.println("\n//////////////////////////////////////////////////////////////////////\n");

        operationCLS.setOperations(new ArrayLikeSequentialDataStructure<>(array));

        operationCLS.getSize();
        operationCLS.elementInStructure(10);
        operationCLS.elementInStructure(230);
        operationCLS.getElementFromPosition(5);
        operationCLS.removeElement(1);
        operationCLS.getSize();
        operationCLS.performClearAllOperation();
    }
}
