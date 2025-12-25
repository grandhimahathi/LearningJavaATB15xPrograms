package ex_05_Ternary_Operator;

public class Lab067_To_Three_Max {
    public static  void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = -5;
        int maxno = (a>b)? a : (b>c) ? b:c ;


        System.out.printf("maxno is %d" , maxno);

    }
}
