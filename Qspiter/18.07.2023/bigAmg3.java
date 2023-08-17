import java.util.*;
class bigAmg3 {
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("Enter number a: ");
        int a=sc.nextInt();
        System.out.println("Enter number b: ");
        int b=sc.nextInt();
        System.out.println("Enter number c: ");
        int c=sc.nextInt();
        int res;
        
        if(a>b && a>c)
        {
            if(b>c)
            {
                res=b;
            }else
            {
                res=c;
            }
        }else if(b>c)
        {
            if(a>c)
            {
                res=a;
            }else
            {
                res=c;
            }
        }else
        {
            if(a>b)
            {
                res=a;
            }else
            {
                res=b;
            }
        }

        System.out.println("Second biggest number  is "+res);

    }
}
