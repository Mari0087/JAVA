import java.util.*;
class markIfElse {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the Mark");
        int mark=sc.nextInt();

        if(mark>=80 && mark<=100)
            System.out.println("O grade");
        if(mark>=60 && mark<=79)
            System.out.println("A grade");
        if(mark>=40 && mark<=59)
            System.out.println("B grade");
        if(mark<40)
            System.out.println("C grade");
    }
}
