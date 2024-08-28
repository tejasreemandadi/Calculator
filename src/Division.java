public class Division implements BinaryOperation {
    @Override
    public Number execute(Number num1, Number num2) {
        if (num2.doubleValue() == 0) {
            throw new UnsupportedOperationException("Division by zero is not allowed");
        }
        return num1.doubleValue() / num2.doubleValue();
    }
}