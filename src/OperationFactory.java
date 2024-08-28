import java.util.HashMap;
import java.util.Map;

public class OperationFactory {
    private final Map<Operation, BinaryOperation> operations = new HashMap<>();

    public OperationFactory() {
        // Register operations
        operations.put(Operation.ADD, new Addition());
        operations.put(Operation.SUBTRACT, new Subtraction());
        operations.put(Operation.MULTIPLY, new Multiplication());
        operations.put(Operation.DIVIDE, new Division());
    }

    public BinaryOperation getOperation(Operation op) {
        if (!operations.containsKey(op)) {
            throw new UnsupportedOperationException("Operation not supported: " + op);
        }
        return operations.get(op);
    }
}
