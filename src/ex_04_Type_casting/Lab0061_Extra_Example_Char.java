package ex_04_Type_casting;

public class Lab0061_Extra_Example_Char {
    public  static  void  main(String[] args) {
        char ch = 'A';
        int ascii = ch;    // widening

        int num = 68;    //narrow
        char letter = (char) num;

    }
}
