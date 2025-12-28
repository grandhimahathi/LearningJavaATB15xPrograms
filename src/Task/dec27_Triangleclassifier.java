package Task;

import java.util.Scanner;

public class dec27_Triangleclassifier {
    public static void  main(String[] args){

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the s1");
        int s1 = scanner.nextInt();
        System.out.println("Enter the s2");
        int s2 = scanner.nextInt();
        System.out.println("Enter the s3");
        int s3 = scanner.nextInt();
        if(s1==s2 && s2==s3){
            System.out.println("Equilateral Triangle ");
        }
        else if (s1==s2 ||s1==s3 ||s2==s3) {
            System.out.println("Isosceles Triangle ");
        }
        else  {
            System.out.println("Scalene Triangle ");

        }
    }

}
