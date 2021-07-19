import java.util.*;

class Student1marks {
    String name;
    int lang2, eng2, cpp, dsa, cpplab, dsalab, maths2, total_marks;

    void total() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        name = scn.nextLine();
        System.out.println("Enter your marks for Subjects below:");
        System.out.println("**************************************************");
        System.out.println("Enter your Language marks for Subject: ");
        lang2 = scn.nextInt();
        System.out.println("Enter your English marks for Subject: ");
        eng2 = scn.nextInt();
        System.out.println("Enter your C++ marks for Subject: ");
        cpp = scn.nextInt();
        System.out.println("Enter your DSA marks for Subject: ");
        dsa = scn.nextInt();
        System.out.println("Enter your CPP Lab marks for Subject: ");
        cpplab = scn.nextInt();
        System.out.println("Enter your DSA Lab marks for Subject: ");
        dsalab = scn.nextInt();
        System.out.println("Enter your Maths-II marks for Subject: ");
        maths2 = scn.nextInt();
        total_marks = lang2 + eng2 + cpp + dsa + cpplab + dsalab + maths2;
        System.out.println(" The Total Marks of " + name + " is : " + total_marks);

    }
}

class Student2marks {
    String frnd;
    int lang2, eng2, cpp, dsa, cpplab, dsalab, maths2, total_marks;

    void total() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your Friend name: ");
        frnd = scn.next();
        System.out.println("Enter " + frnd + "'s marks for Subjects below:");
        System.out.println("**************************************************");
        System.out.println("Enter " + frnd + "'s Language marks for Subject: ");
        lang2 = scn.nextInt();
        System.out.println("Enter " + frnd + "'s English marks for Subject: ");
        eng2 = scn.nextInt();
        System.out.println("Enter " + frnd + "'s C++ marks for Subject: ");
        cpp = scn.nextInt();
        System.out.println("Enter " + frnd + "'s DSA marks for Subject: ");
        dsa = scn.nextInt();
        System.out.println("Enter " + frnd + "'s C++ Lab marks for Subject: ");
        cpplab = scn.nextInt();
        System.out.println("Enter " + frnd + "'s DSA Lab marks for Subject: ");
        dsalab = scn.nextInt();
        System.out.println("Enter " + frnd + "'s Maths2 marks for Subject: ");
        maths2 = scn.nextInt();
        total_marks = lang2 + eng2 + cpp + dsa + cpplab + dsalab + maths2;
        System.out.println("The Total Marks of " + frnd + " is : " + total_marks);
    }
}

public class marksheet {
    public static void main(String args[])

    {
        Student1marks obj = new Student1marks();
        obj.total();
        Student2marks obj1 = new Student2marks();
        obj1.total();
    }

}
