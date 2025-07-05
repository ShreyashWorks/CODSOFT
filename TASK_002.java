import java.util.Scanner;

public class TASK_002 {
    public static void main(String[] args) {
        double x1,x2,x3,x4,x5;
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the Subject1 Marks: ");
        x1=sc1.nextInt();
        Scanner sc2=new Scanner(System.in);
        System.out.println("Enter the Subject2 Marks: ");
        x2=sc2.nextInt();
        Scanner sc3=new Scanner(System.in);
        System.out.println("Enter the Subject3 Marks: ");
        x3=sc3.nextInt();
        Scanner sc4=new Scanner(System.in);
        System.out.println("Enter the Subject4 Marks: ");
        x4=sc4.nextInt();
        Scanner sc5=new Scanner(System.in);
        System.out.println("Enter the Subject5 Marks: ");
        x5=sc5.nextInt();

        double percentage= (x1+x2+x3+x4+x5)/5;
        System.out.println("Percentage is :  "+percentage);

        if(percentage>90)
        {
            System.out.println("Excellent...");
        } else if (percentage>80) {
            System.out.println("very good..");

        } else if (percentage>70) {
            System.out.println("good...");

        } else if (percentage>60) {
            System.out.println("can do better..");
        } else if (percentage>50) {
            System.out.println("Average..");

        } else if (percentage>40) {
            System.out.println("Below Average...");

        }
        else {
            System.out.println("Fail......");
        }
    }
}
