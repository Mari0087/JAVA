import java.util.*;
class primeOrNot{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter the number");
        int num=sc.nextInt();
        String res=prime(num);

        System.out.println(num+" is a "+res);
    }

    public static String prime(int num) {
        for(int i=2;i<num;i++){
            if (num%i==0){
                return "Composite";
            }
        }
        return "Prime";
    }
}
