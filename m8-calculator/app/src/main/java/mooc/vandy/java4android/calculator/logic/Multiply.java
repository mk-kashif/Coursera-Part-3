package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply implements MathOperationInterface {

    /**
     * Perform multiplication on the two arguments.
     */
    @Override
    public int performOperation(int argumentOne, int argumentTwo) {
        return argumentOne * argumentTwo;
    }
}
