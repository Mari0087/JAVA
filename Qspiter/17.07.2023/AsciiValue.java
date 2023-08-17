import java.util.*;
class AsciiValue {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the Characters");
        char ch = sc.next().charAt(0);
        System.out.println(ch+" : Ascii Value is "+(int)ch);
    }
}
