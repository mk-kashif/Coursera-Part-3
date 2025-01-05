package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add implements MathOperationInterface {

    /**
     * Perform addition on the two arguments.
     */
    @Override
    public int performOperation(int argumentOne, int argumentTwo) {
        return argumentOne + argumentTwo;
    }
}
