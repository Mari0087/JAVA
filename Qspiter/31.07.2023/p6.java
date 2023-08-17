class p6{
    public static void main(String[] args)throws Exception{
        int n=5;
        for(int i=0; i < n; i++){
            int count=5;
            for(int j=0 ;j<n ;j++){
                Thread.sleep(100);
                System.out.print(count-- +" ");
            }
            System.out.println();
        }
    }
}