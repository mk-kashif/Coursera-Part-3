package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide implements MathOperationInterface {

    /**
     * Perform division on the two arguments.
     */
    @Override
    public int performOperation(int argumentOne, int argumentTwo) {
        // Check for division by zero
        if (argumentTwo == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return argumentOne / argumentTwo;
    }
}
