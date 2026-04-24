// Q5. Addition of time (hours and minutes)
class TimeHM {
    int h, m;

    TimeHM(int h, int m) {
        this.h = h;
        this.m = m;
    }

    void add(TimeHM t) {
        int min = this.m + t.m;
        int hr = this.h + t.h + min / 60;
        min = min % 60;

        System.out.println("Total Time = " + hr + " hours " + min + " minutes");
    }
}

public class Q5_Main {
    public static void main(String[] args) {
        TimeHM t1 = new TimeHM(2, 50);
        TimeHM t2 = new TimeHM(3, 30);

        t1.add(t2);
    }
}
