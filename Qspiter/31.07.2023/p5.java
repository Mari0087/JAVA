class p5{
    public static void main(String[] args)throws Exception{
        int n=5;
        for(int i=0; i < n; i++){
            for(int j=0 ;j<n ;j++){
                Thread.sleep(500);
                if(i%2==0){
                    System.out.print("0 ");
                }else
                {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}