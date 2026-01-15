package ExceptionHandling;

class DivisionByZeroException extends Exception {
    DivisionByZeroException(String msg) {
        super(msg);
    }
}

public class ExpZero {
    static void check(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("b cannot be zero");
        }

        else {
            System.out.println(a / b);
        }
    }

    public static void main(String[] args) {
        try {
            check(1, 0);

        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally executed");
        }
    }
}
