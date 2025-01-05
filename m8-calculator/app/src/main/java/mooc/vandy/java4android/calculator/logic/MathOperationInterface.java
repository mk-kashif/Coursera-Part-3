package mooc.vandy.java4android.calculator.logic;

/**
 * Interface for math operations (Add, Subtract, Multiply, Divide).
 */
public interface MathOperationInterface {

    /**
     * Perform the operation on the two arguments.
     *
     * @param argumentOne First operand
     * @param argumentTwo Second operand
     * @return The result of the operation
     */
    int performOperation(int argumentOne, int argumentTwo);
}
