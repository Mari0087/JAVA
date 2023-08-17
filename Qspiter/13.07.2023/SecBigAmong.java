import java.util.*;
class SecBigAmong {
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("Enter number a: ");
        int a=sc.nextInt();
        System.out.println("Enter number b: ");
        int b=sc.nextInt();
        System.out.println("Enter number c: ");
        int c=sc.nextInt();
        int res=(a>b && a>c)?((b>c)?b:c):(b>c)?((a>c)?a:c):((a>b)?a:b);

        System.out.println("Second biggest number  is "+res);

    }
}
