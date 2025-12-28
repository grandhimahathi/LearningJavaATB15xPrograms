package Task;

public class dec30_Gradecal {
    public static void main(String[] args){

        int Marks= 60;
        if(Marks>=90 && Marks<=100){
            System.out.println("A");
        }
        else if(Marks>=80 && Marks<=89){
            System.out.println("B");
        }
        else if (Marks>=70 && Marks<=79) {
            System.out.println("C");
        }
        else if (Marks>=60 && Marks<=69) {
            System.out.println("D");
        }
        else {
            System.out.println("Fail");
        }
    }
}
