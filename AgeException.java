// Q20. Custom exception
class AgeException extends Exception {
    AgeException(String msg) {
        super(msg);
    }
}

public class Q20_Main {
    static void checkAge(int age) throws AgeException {
        if (age < 18)
            throw new AgeException("Invalid age");
        else
            System.out.println("Valid age");
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
