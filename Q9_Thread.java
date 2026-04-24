// Q9. With threads (extends Thread)
class T1 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++)
            System.out.println("T1: " + i);
    }
}

class T2 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++)
            System.out.println("T2: " + i);
    }
}

class T3 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++)
            System.out.println("T3: " + i);
    }
}

class Q9_Thread {
    public static void main(String[] args) {
        new T1().start();
        new T2().start();
        new T3().start();
    }
}
