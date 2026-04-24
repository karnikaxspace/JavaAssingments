// Q9. Using Runnable
class R1 implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i++)
            System.out.println("R1: " + i);
    }
}

class Q9_Runnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new R1());
        Thread t2 = new Thread(new R1());
        Thread t3 = new Thread(new R1());

        t1.start();
        t2.start();
        t3.start();
    }
}
