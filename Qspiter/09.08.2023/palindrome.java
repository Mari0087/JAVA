public class palindrome {
    static int pali=0,num=111,dup_num=num;
    public static void main(String[] args) {
        boolean res=checkPali(num);
        if (res)
            System.out.println(dup_num+" : is palindrome");
        else
            System.out.println(dup_num+" : is not palindrome");
    }

    public static boolean checkPali(int num) {
        if (num>0){
            int last=num%10;
            pali*=10;
            pali+=last;
            num/=10;
            checkPali(num);
        }
        return pali==dup_num;
    }
}
