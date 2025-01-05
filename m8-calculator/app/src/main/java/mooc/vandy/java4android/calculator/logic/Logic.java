package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;
    }

    /**
     * Perform the operation on argumentOne and argumentTwo.
     */
    public void process(int argumentOne, int argumentTwo, int operation) {
        MathOperationInterface mathOperation;

        // Select the operation based on the provided operation code
        switch (operation) {
            case 0: // Add
                mathOperation = new Add();
                break;
            case 1: // Subtract
                mathOperation = new Subtract();
                break;
            case 2: // Multiply
                mathOperation = new Multiply();
                break;
            case 3: // Divide
                mathOperation = new Divide();
                break;
            default:
                // Invalid operation
                mOut.print("Invalid operation selected");
                return;
        }

        // Perform the operation and print the result
        int result = mathOperation.performOperation(argumentOne, argumentTwo);
        mOut.print("Result: " + result);
    }
}
