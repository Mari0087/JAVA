import java.util.*;
class divisibleBy4and6
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number");
        int number=sc.nextInt();
        if(number%4==0 && number%6==0)
        {
            System.out.println("Mareeswaran G");
        }else
        {
            System.out.println("Java");
        }
    }
}