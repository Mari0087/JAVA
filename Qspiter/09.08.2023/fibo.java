class fibo {
    static int serice=8,n1=0,n2=1;
    public static void main(String[] args) {
        System.out.print(n1+" "+n2+"");
        printFibo();
    }

    public static void printFibo(){
        if (serice>0){
            int n3=n1+n2;
            System.out.println(n3+" ");
            serice--;
            n1=n2;
            n2=n3;
            printFibo();
        }
    }
}
