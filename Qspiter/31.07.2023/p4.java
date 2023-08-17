class p4{
    public static void main(String[] args)throws Exception{
        int n=5;
        int count=1;
        for(int i=0; i < n; i++){
            for(int j=0 ;j<n ;j++){
                Thread.sleep(1000);
                System.out.print(count++ +" ");
            }
            System.out.println();
        }
    }
}