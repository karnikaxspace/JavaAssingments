// Q4. Addition of time (hours, minutes, seconds)
class Time {
    int h, m, s;

    Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    void add(Time t) {
        int sec = this.s + t.s;
        int min = this.m + t.m + sec / 60;
        sec = sec % 60;

        int hr = this.h + t.h + min / 60;
        min = min % 60;

        System.out.println("Total Time = " + hr + " : " + min + " : " + sec);
    }
}

public class Q4_Main {
    public static void main(String[] args) {
        Time t1 = new Time(2, 45, 50);
        Time t2 = new Time(3, 20, 30);

        t1.add(t2);
    }
}
