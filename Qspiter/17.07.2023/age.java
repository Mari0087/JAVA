import java.util.*;
class age {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter your Age --(11-13)");
        int age = sc.nextInt();
        if (age<=13 && age>=11)
        {
            if(age==11)
            {
                System.out.println("Your age is Eleven");
            }else if(age==12)
            {
                System.out.println("Your age is Twelve");
            }else if(age==13)
            {
                System.out.println("Your age is Thirteen");
            }
        }else
        {
            System.out.println("Please, Enter Your age between 11 to 13");
        }
    }
}
