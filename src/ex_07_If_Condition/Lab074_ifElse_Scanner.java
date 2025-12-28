package ex_07_If_Condition;

import java.util.Scanner;

public class Lab074_ifElse_Scanner {
    public  static  void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the Age");
        int age= scanner.nextInt();
        System.out.println(age);
    if (age>19) {
        System.out.println("can vote");
    }else{
        System.out.println("cant vote");
    }
    }
}
