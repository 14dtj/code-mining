public class ${enclosing_type} extends Exception {

    /**
     * Constructs with the given throwable
     * @param t the throwable to throw
     */
    public ${enclosing_type}(Throwable t) {
        super(t);
    }

    /**
     * Constructs with the given message
     * @param message the message of the exception
     */
    public ${enclosing_type}(String message) {
        super(message);
    }

    /**
     * Constructs with the given message and the original throwable cause
     * @param message the message of the exception
     * @param t the original throwable
     */
    public ${enclosing_type}(String message, Throwable t) {
        super(message, t);
    }
}

try {
    ${cursor}
} catch (${Exception} ${exception_variable_name}) {

}

class Compensation { 
    public void compensate(){};
}
compensations = new Stack<Compensation>();                                     
try {
    ${cursor}

} finally {
    while( !compensations.empty() )
        compensations.pop().compensate();
}
