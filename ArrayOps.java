// Q7. 1D Array operations (input, output1, output2, reverse)
class ArrayOps {
    int arr[] = new int[5];

    void input() {
        for (int i = 0; i < 5; i++)
            arr[i] = i + 1;
    }

    void output1() {
        System.out.println("Output using for loop:");
        for (int i = 0; i < 5; i++)
            System.out.print(arr[i] + " ");
    }

    void output2() {
        System.out.println("\nOutput using for-each:");
        for (int x : arr)
            System.out.print(x + " ");
    }

    void reverse() {
        System.out.println("\nReverse array:");
        for (int i = 4; i >= 0; i--)
            System.out.print(arr[i] + " ");
    }
}

public class Q7_Main {
    public static void main(String[] args) {
        ArrayOps obj = new ArrayOps();
        obj.input();
        obj.output1();
        obj.output2();
        obj.reverse();
    }
}
