// Q2 & Q3. Addition of two distances (m, cm, mm)
class Distance {
    int m, cm, mm;

    Distance(int m, int cm, int mm) {
        this.m = m;
        this.cm = cm;
        this.mm = mm;
    }

    void add(Distance d) {
        int total_mm = this.mm + d.mm;
        int total_cm = this.cm + d.cm + total_mm / 10;
        total_mm = total_mm % 10;

        int total_m = this.m + d.m + total_cm / 100;
        total_cm = total_cm % 100;

        System.out.println("Total Distance = " + total_m + " m " + total_cm + " cm " + total_mm + " mm");
    }
}

public class Q2_Main {
    public static void main(String[] args) {
        Distance d1 = new Distance(2, 50, 5);
        Distance d2 = new Distance(3, 70, 8);

        d1.add(d2);
    }
}
