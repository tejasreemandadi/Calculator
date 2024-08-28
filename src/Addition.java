public class Addition implements BinaryOperation {
    @Override
    public Number execute(Number num1, Number num2) {
        return num1.doubleValue() + num2.doubleValue();
    }
}

// Implement Subtraction, Multiplication, Division similarly
