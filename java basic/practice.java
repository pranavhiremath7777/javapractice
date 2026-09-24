import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        System.out.print("total sum is: ");
        int a=10;
        int b=20;
        int c=30;
        int sum=a+b+c;
        System.out.println(sum);

        double thirdtsem=7.22;
        double fourthsem=8.22;
        double cgpa=(thirdtsem+fourthsem)/2;
        System.out.println("CGPA is: "+cgpa);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("name is: "+name);
        


    }
}
