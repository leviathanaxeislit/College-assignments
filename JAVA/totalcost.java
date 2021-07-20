import java.util.*;

class costofitems {
    int tc, note, pen, pencil, recharge;

    void calc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of notes : ");
        note = sc.nextInt();
        System.out.println("Enter the number of pens : ");
        pen = sc.nextInt();
        System.out.println("Enter the number of pencils : ");
        pencil = sc.nextInt();
        System.out.println("Enter the number of recharge : ");
        recharge = sc.nextInt();
        tc = (((note * 50) + (pen * 10) + (pencil * 5) + (recharge * 299)) * 3);
        System.out.println("The Total Expense is Rs." + tc);
    }

}

public class totalcost {
    public static void main(String[] args) {
        costofitems c = new costofitems();
        c.calc();
    }
}