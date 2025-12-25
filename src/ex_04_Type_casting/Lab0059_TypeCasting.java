package ex_04_Type_casting;

public class Lab0059_TypeCasting {
    public static void main(String[] args) {
        long phone = 987654321l;
//        short s = phone; // Narrowing - implicit.
        short s1 = (short) phone; // Narrowing - Explicit.
    }
}
