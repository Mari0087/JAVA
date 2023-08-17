class Q {
    public static void main(String[] args) throws Exception {
        int n=7;
        for (int i=0;i<n;i++){
            for(int j=0; j<n; j++){
				if(i==0 && j<=n/2 || j==0 && i<=n/2 || i==n/2 && j<=n/2 || j==n/2 && i<=n/2 || i==j && i>n/4 && i<3*n/4){
					Thread.sleep(100);
					System.out.print("* ");
				}else
				{
					System.out.print("  ");
				}
			}
            System.out.println();
        }
    }
}
