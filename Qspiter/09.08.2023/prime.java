class prime {
    static String res="Composite";
    static int count = 2;
    public static void main(String[] args) {
        res=checkPrime(25);
        System.out.println("given number is : "+res);
    }

    public static String checkPrime(int num){
        if (num==0 || num==1){
            return "either Composite nor Prime";
        }else if (num%count==0 && num!=count){
            res = "Composite";
            return res;
        }else{
            if(count==num){
                res="prime";
                return res;
            }
            count++;
            res=checkPrime(num);
            return res;
        }
        
    }
}
