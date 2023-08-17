import java.util.*;
class c1{
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("\t\t\t Check a number is Positive or negative");
        System.out.println("Enter the number:");
        int user_number=sc.nextInt();
        String res=(user_number>=0)? "Given Number is Postive" : "Given Number is Negative";
        System.out.println(res);
    }
}