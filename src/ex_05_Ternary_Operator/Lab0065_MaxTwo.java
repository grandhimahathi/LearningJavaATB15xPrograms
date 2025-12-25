package ex_05_Ternary_Operator;

public class Lab0065_MaxTwo {
    public static  void main( String[] args) {
        int a = 10;
        int b = 20;
        int max = a > b ? a : b;
        int min = a > b ? b : a;
        System.out.println(max);
        System.out.println(min);
    }
}
