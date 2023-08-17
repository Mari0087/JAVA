import java.util.*;
class oddOrEven {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("ENter the integer Number");
        int number=sc.nextInt();
        if(number%2==0)
        {
            System.out.println(number + " is Even Number");
        }else
        {
            System.out.println(number + " is Odd Number");
        }
    }
}
