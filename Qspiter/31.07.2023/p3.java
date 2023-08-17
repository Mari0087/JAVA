class p3{
    public static void main(String[] args)throws Exception{
        int n=5;
        for(int i=0; i < n; i++){
            Thread.sleep(1000);
            char ch='A';
            for(int j=0 ;j<n ;j++){
                    System.out.print(ch++ +" ");
            }
            System.out.println();
        }
    }
}