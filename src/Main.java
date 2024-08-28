import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create the operation factory
        OperationFactory operationFactory = new OperationFactory();

        // Create the calculator with the operation factory
        Calculator calculator = new Calculator(operationFactory);

        // Perform a simple calculation with subtraction
        Number subtractionResult = calculator.calculate(Operation.SUBTRACT, 10, 5);
        System.out.println("10 - 5 = " + subtractionResult);

        // Perform a simple calculation with multiplication
        Number multiplicationResult = calculator.calculate(Operation.MULTIPLY, 10, 5);
        System.out.println("10 * 5 = " + multiplicationResult);

        // Perform a simple calculation with division
        Number divisionResult = calculator.calculate(Operation.DIVIDE, 10, 5);
        System.out.println("10 / 5 = " + divisionResult);

        // Perform a chained operation: (10 + 5) * 2 - 3 / 2
        List<Map.Entry<Operation, Number>> operations = new ArrayList<>();
        operations.add(new SimpleEntry<>(Operation.ADD, 5));        // + 5
        operations.add(new SimpleEntry<>(Operation.MULTIPLY, 2));   // * 2
        operations.add(new SimpleEntry<>(Operation.SUBTRACT, 3));   // - 3
        operations.add(new SimpleEntry<>(Operation.DIVIDE, 2));     // / 2

        Number chainedResult = calculator.chain(10, operations);
        System.out.println("(10 + 5) * 2 - 3 / 2 = " + chainedResult);
    }
}
