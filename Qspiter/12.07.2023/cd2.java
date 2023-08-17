import java.util.*;
class cd2 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("\t\t\tMaximum of 4 number");
        System.out.print("Enter the first number: ");
        int first_num=sc.nextInt();
        System.out.print("Enter the Scoend number: ");
        int sco_num=sc.nextInt();
        System.out.print("Enter the Third number: ");
        int third_num=sc.nextInt();
        System.out.print("Enter the fourth number: ");
        int four_num=sc.nextInt();
        System.out.println("The Biggest number is");
        int big_num=(first_num>sco_num && first_num>third_num && first_num>four_num)? first_num:(sco_num>third_num && sco_num>four_num)? sco_num:(third_num>four_num)? third_num:four_num;
        System.out.println(big_num);
    }
}
