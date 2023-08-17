import java.util.*;
class markIfElse {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the Mark");
        int mark=sc.nextInt();

        if (mark>100 || mark<0)
            System.out.println("Invalid Mark");
        else if(mark>=80)
            System.out.println("O grade");
        else if(mark>=60)
            System.out.println("A grade");
        else if(mark>=40)
            System.out.println("B grade");
        else
            System.out.println("C grade");
    }
}
