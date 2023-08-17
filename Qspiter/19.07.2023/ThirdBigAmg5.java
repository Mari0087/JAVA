import java.util.*;
class ThirdBigAmg5
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String []args)
    {
        System.out.println("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();
        System.out.println("Enter the value of c : ");
        int c = sc.nextInt();
        System.out.println("Enter the value of d : ");
        int d = sc.nextInt();
        System.out.println("Enter the value of e : ");
        int e = sc.nextInt();


        if(a>b && a>c && a>d && a>e)
        {
            if(b>c && b>d && b>e)
            {
                if(c>d && c>e){
                    System.out.println(c+" is Third Biggest number Among 5 Number");
                }else if(d>e)
                {
                   System.out.println(d+" is Third Biggest number Among 5 Number"); 
                }else
                {
                    System.out.println(e+" is Third Biggest number Among 5 Number");
                }
            }else if(c>d && c>e)
            {
                if(b>d && b>e)
                {
                    System.out.println(b+" is Third Biggest number Among 5 Number");
                }else if(d>e)
                {
                   System.out.println(d+" is Third Biggest number Among 5 Number"); 
                }else
                {
                    System.out.println(e+" is Third Biggest number Among 5 Number");
                }
            }else if(d>e)
            {
                if(b>c && b>e)
                {
                    System.out.println(b+" is Third Biggest number Among 5 Number");
                }else if(c>e)
                {
                    System.out.println(c+" is Third Biggest number Among 5 Number");
                }else
                {
                    System.out.println(e+" is Third Biggest number Among 5 Number");
                }
            }else
            {
                if(b>c && b>d){
                    System.out.println(b+" is Third Biggest number Among 5 Number");
                }else if(c>d){
                    System.out.println(c+" is Third Biggest number Among 5 Number");
                }else
                {
                    System.out.println(d+" is Third Biggest number Among 5 Number");
                }
            }
        }else if(b>c && b>d && b>e)
        {
            if(a>c && a>d && a>e)
            {
                if(c>d && c>e){
                    System.out.println(c+" is Third Biggest number Among 5 Number");
                }else if(d>e)
                {
                   System.out.println(d+" is Third Biggest number Among 5 Number"); 
                }else
                {
                    System.out.println(e+" is Third Biggest number Among 5 Number");
                }
            }else if(c>d && c>e)
            {
                if(a>d && a>e)
                {
                    System.out.println(a+" is Third Biggest number Among 5 Number");
                }else if(d>e)
                {
                    System.out.println(d+" is Third Biggest number Among 5 Number");
                }else
                {
                    System.out.println(e+" is Third Biggest number Among 5 Number");
                }
            }else if(d>e)
            {
                if(a>c && a>e)
                {
                    System.out.println(a+" is Third Biggest number Among 5 Number");
                }else if(c>e)
                {
                    System.out.println(c+" is Third Biggest number Among 5 Number");
                }else
                {
                    System.out.println(e+" is Third Biggest number Among 5 Number");
                }
            }else
            {
                if(a>c && a>d)
                {
                    System.out.println(a+" is Third Biggest number Among 5 Number");
                }else if(c>d)
                {
                    System.out.println(c+" is Third Biggest number Among 5 Number");
                }else
                {
                    System.out.println(d+" is Third Biggest number Among 5 Number");
                }
            }
        }else if(c>d && c>e)
        {
            if(a>b && a>d && a>e)
            {
                if(b>d && b>e)
                {
                    System.out.println(b+" is Third Biggest number Among 5 Number");
                }else if(d>e)
                {
                   System.out.println(d+" is Third Biggest number Among 5 Number"); 
                }else
                {
                    System.out.println(e+" is Third Biggest number Among 5 Number");
                }
            }else if(b>d && b>e)
            {
                if(a>d && a>e)
                {
                    System.out.println(a+" is Third Biggest number Among 5 Number");
                }else if(d>e)
                {
                    System.out.println(d+" is Third Biggest number Among 5 Number");
                }else
                {
                    System.out.println(e+" is Third Biggest number Among 5 Number");
                }
            }else if(d>e)
            {
                if(a>b && a>e)
                {
                    System.out.println(a+" is Third Biggest number Among 5 Number");
                }else if(b>e)
                {
                    System.out.println(b+" is Third Biggest number Among 5 Number");
                }else
                {
                    System.out.println(e+" is Third Biggest number Among 5 Number");
                }
            }else
            {
                if(a>d && a>b)
                {
                    System.out.println(a+" is Third Biggest number Among 5 Number");
                }else if(d>b)
                {
                    System.out.println(d+" is Third Biggest number Among 5 Number");
                }else
                {
                    System.out.println(b+" is Third Biggest number Among 5 Number");
                }
            }
        }else if(d>e)
        {
            if(a>b && a>c && a>e)
            {
                if(b>c && b>e)
                {
                    System.out.println(b+" is Third Biggest number Among 5 Number");
                }else if(c>e)
                {
                   System.out.println(c+" is Third Biggest number Among 5 Number"); 
                }else
                {
                    System.out.println(e+" is Third Biggest number Among 5 Number");
                }
            }else if(b>c && b>e)
            {
                if(a>c && a>e)
                {
                    System.out.println(a+" is Third Biggest number Among 5 Number");
                }else if(c>e)
                {
                    System.out.println(c+" is Third Biggest number Among 5 Number");
                }else
                {
                    System.out.println(e+" is Third Biggest number Among 5 Number");
                }
            }else if(c>e)
            {
                if(a>b && a>e)
                {
                    System.out.println(a+" is Third Biggest number Among 5 Number");
                }else if(b>e)
                {
                    System.out.println(b+" is Third Biggest number Among 5 Number");
                }else
                {
                    System.out.println(e+" is Third Biggest number Among 5 Number");
                }
            }else
            {
                if(a>d && a>b)
                {
                    System.out.println(a+" is Third Biggest number Among 5 Number");
                }else if(c>b)
                {
                    System.out.println(c+" is Third Biggest number Among 5 Number");
                }else
                {
                    System.out.println(b+" is Third Biggest number Among 5 Number");
                }
            }
        }else
        {
            if(a>b && a>d && a>c)
            {
                if(b>d && b>c)
                {
                    System.out.println(b+" is Third Biggest number Among 5 Number");
                }else if(d>c)
                {
                   System.out.println(d+" is Third Biggest number Among 5 Number"); 
                }else
                {
                    System.out.println(c+" is Third Biggest number Among 5 Number");
                }
            }else if(b>d && b>c)
            {
                if(a>d && a>c)
                {
                    System.out.println(a+" is Third Biggest number Among 5 Number");
                }else if(d>c)
                {
                    System.out.println(d+" is Third Biggest number Among 5 Number");
                }else
                {
                    System.out.println(c+" is Third Biggest number Among 5 Number");
                }
            }else if(d>c)
            {
                if(a>b && a>c)
                {
                    System.out.println(a+" is Third Biggest number Among 5 Number");
                }else if(b>c)
                {
                    System.out.println(b+" is Third Biggest number Among 5 Number");
                }else
                {
                    System.out.println(c+" is Third Biggest number Among 5 Number");
                }
            }else
            {
                if(a>d && a>b)
                {
                    System.out.println(a+" is Third Biggest number Among 5 Number");
                }else if(d>b)
                {
                    System.out.println(d+" is Third Biggest number Among 5 Number");
                }else
                {
                    System.out.println(b+" is Third Biggest number Among 5 Number");
                }
            }
        }
    }
}