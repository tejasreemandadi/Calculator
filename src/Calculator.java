import java.util.List;
import java.util.Map;

public class Calculator {
    private final OperationFactory operationFactory;

    public Calculator(OperationFactory operationFactory) {
        this.operationFactory = operationFactory;
    }

    public Number calculate(Operation op, Number num1, Number num2) {
        BinaryOperation operation = operationFactory.getOperation(op);
        return operation.execute(num1, num2);
    }

    public Number chain(Number initialValue, List<Map.Entry<Operation, Number>> operations) {
        Number result = initialValue;
        for (Map.Entry<Operation, Number> entry : operations) {
            result = calculate(entry.getKey(), result, entry.getValue());
        }
        return result;
    }
}