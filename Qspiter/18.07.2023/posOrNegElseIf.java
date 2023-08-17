import java.util.*;
class posOrNegElseIf {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("ENter the integer Number");
        int number=sc.nextInt();
        if(number>=0)
        {
            System.out.println(number + " is Positive Number");
        }else if(number<0)
        {
            System.out.println(number + " is Negative Number");
        }
    }
}
