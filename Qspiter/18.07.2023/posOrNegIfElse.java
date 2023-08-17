import java.util.*;
class posOrNegIfElse {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("ENter the integer Number");
        int number=sc.nextInt();
        if(number>=0)
        {
            System.out.println(number + " is Positive Number");
        }else
        {
            System.out.println(number + " is Negative Number");
        }
    }
}
