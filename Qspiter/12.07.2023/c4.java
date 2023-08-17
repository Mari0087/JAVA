import java.util.*;
class c4 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Odd or Even");
        System.out.println("Enter The Number: ");
        int number =sc.nextInt();
        String res=(number%2==0)? "Given number is Even" : "Given number is Odd";
        System.out.println(res);
    }
}