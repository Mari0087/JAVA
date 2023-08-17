import java.util.*;
class marriageElig {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("\t\tCheck Eligible for Marriage or Not");
        System.out.println("Enter Your Genter(Male or Female or Others)");
        String Genter = sc.nextLine();        System.out.println("Enter Your Age");
        int age = sc.nextInt();
        System.out.println("Processing....");
        Thread.sleep(3000);
        if(Genter.equals("Male")||Genter.equals("male"))
        {
            if(age>=22)
            {
                System.out.println("Yes, Eligible for Marriage");
            }else
            {
                System.out.println("No, Not Eligible for Marriage");
            }
        }else{
            if(age>=18)
            {
                System.out.println("Yes, Eligible for Marriage");
            }else
            {
                System.out.println("No, Not Eligible for Marriage");
            }
        }
    }
}
