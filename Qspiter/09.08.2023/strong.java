class strong {
    static int fact=0,num=4058,dup_num=num;
    static int check=1;
    
    public static void main(String[] args) {
        boolean res = checkStrong(num);
        if(res)
            System.out.println(dup_num+" : is Strong Number");
        else
            System.out.println(dup_num+" : Not Strong Number");

    }

    public static boolean checkStrong(int num) {
        if (num>0){
            fact+=findFact(num%10);
            check=1;
            num/=10;
            checkStrong(num);
        }
        return fact==dup_num;
    }

    public static int findFact(int n) {
        
        if (n>0){
            check*=n;
            n--;
            findFact(n);
        }
        return check;
    }

}
