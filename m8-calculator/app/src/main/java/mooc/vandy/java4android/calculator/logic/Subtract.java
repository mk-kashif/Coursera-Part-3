package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract implements MathOperationInterface {

    /**
     * Perform subtraction on the two arguments.
     */
    @Override
    public int performOperation(int argumentOne, int argumentTwo) {
        return argumentOne - argumentTwo;
    }
}
