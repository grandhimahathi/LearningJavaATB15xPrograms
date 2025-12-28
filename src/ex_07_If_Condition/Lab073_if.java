package ex_07_If_Condition;

public class Lab073_if {
    public static  void main(String[] args){
        System.out.println("Enter the age via CLI \n");
        int age = Integer.parseInt(args[0]);

        if(age>18) {
            System.out.println("can vote");
        }else {
            System.out.println("cant vote");
            }

    }
}
