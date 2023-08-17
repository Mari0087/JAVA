class calculeter {
    static int c;
    public static void main(String[] args) {
        System.out.println("Welcom to calculater");
        System.out.println("Addition");
        add(5,7);
        add(7,3,9);
        System.out.println("subtraction");
        sub(6, 5);
        sub(6, 5, 7);
        System.out.println("Multipication");
        multip(6, 3);
        multip(6, 3, 2);
        System.out.println("Divistion");
        division(6, 3);
        division(6, 3,2);
        System.out.println("Motulo");
        modulo(6, 4);
    }

    public static void add(int a ,int b) {
        c=a+b;
        System.out.println(c);
    }

    public static void add(int a,int b,int c) {
        c=a+b+c;
        System.out.println(c);
    }

    public static void sub(int a ,int b){
        c=a-b;
        System.out.println(c);
    }

    public static void sub(int a ,int b,int c){
        c=a-b-c;
        System.out.println(c);
    }

    public static void multip(int a ,int b){
        c=a*b;
        System.out.println(c);   
    }

    public static void multip(int a ,int b,int c){
        c=a*b*c;
        System.out.println(c);   
    }

    public static void division(int a,int b) {
        c=a/b;
        System.out.println(c);   
    }
    
    public static void division(int a,int b,int c) {
        c=(a/b)/c;
        System.out.println(c);
    }

    public static void modulo(int a ,int b){
        c=a%b;
        System.out.println(c);
    }
}
