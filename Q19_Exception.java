// Q19. Exception handling
public class Q19_Exception {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[10] = 50;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }

        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero not allowed");
        }
    }
}
