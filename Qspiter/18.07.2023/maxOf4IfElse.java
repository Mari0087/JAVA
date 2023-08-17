import java.util.*;
class maxOf4IfElse {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Enter number a");
        int a=sc.nextInt();
        System.out.println("Enter number b");
        int b=sc.nextInt();
        System.out.println("Enter number c");
        int c=sc.nextInt();
        System.out.println("Enter number d");
        int d=sc.nextInt();
        System.out.println("Processing...");
        Thread.sleep(3000);

        if(a>b && a>c && a>d)
            System.out.println("Biggest number is a : "+a);
        if(b>c && b>d && b>a)
            System.out.println("Biggest number is b : "+b);
        if(c>d && c>a && c>b)
            System.out.println("Biggest number is c : "+c);
        if(d>a && d>b && d>c)
            System.out.println("Biggest number is d : "+d);
    }
}
