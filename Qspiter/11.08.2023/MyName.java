class MyName 
{
	public static void main(String[] args) throws Exception
	{
		int n=5;
		int sleep_time=50;
		System.out.println("\n\n\n");

		for (int i=0; i<n; i++ )
		{
			//MMMMMMM
			for(int j=0; j<n; j++){
				if(j==0 || i==j && i<=n/2 || i+j==n-1 && i<=n/2 || j==n-1){
					Thread.sleep(sleep_time);
					System.out.print("* ");
				}else
				{
					System.out.print("  ");
				}
			}

			System.out.print("  ");
			//AAAAAAA

			for(int j=0; j<n; j++){
				if(i==0 || j==0 || j==n-1 || i==n/2){
					Thread.sleep(sleep_time);
					System.out.print("* ");
				}else
				{
					System.out.print("  ");
				}
			}

			System.out.print("  ");
			//RRRRRR

			for(int j=0; j<n; j++){
				if(i==0 || j==0 || j==n-1 && i<=n/2|| i==n/2 || i==j && i>=n/2){
					Thread.sleep(sleep_time);
					System.out.print("* ");
				}else
				{
					System.out.print("  ");
				}
			}
			System.out.print("  ");

			//EEEE

			for(int j=0; j<n; j++){
				if(i==0 || j==0 || i==n-1 || i==n/2){
					Thread.sleep(sleep_time);
					System.out.print("* ");
				}else
				{
					System.out.print("  ");
				}
			}

			System.out.print("  ");

			//EEEE

			for(int j=0; j<n; j++){
				if(i==0 || j==0 || i==n-1 || i==n/2){
					Thread.sleep(sleep_time);
					System.out.print("* ");
				}else
				{
					System.out.print("  ");
				}
			}

			System.out.print("  ");

			//SSSSS

			for(int j=0; j<n; j++){
				if(i==0  || j==0 && i<=n/2 || i==n-1 || i==n/2 || j==n-1 && i>=n/2 ){
					Thread.sleep(sleep_time);
					System.out.print("* ");
				}else
				{
					System.out.print("  ");
				}
			}

			System.out.print("  ");

			//WWWW

			for(int j=0; j<n; j++){
				if(j==0 || i==j && i>=n/2 || i+j==n-1 && i>=n/2 || j==n-1){
					Thread.sleep(sleep_time);
					System.out.print("* ");
				}else
				{
					System.out.print("  ");
				}
			}

			System.out.print("  ");
			//AAAAAAA

			for(int j=0; j<n; j++){
				if(i==0 || j==0 || j==n-1 || i==n/2){
					Thread.sleep(sleep_time);
					System.out.print("* ");
				}else
				{
					System.out.print("  ");
				}
			}

			System.out.print("  ");
			//RRRRRR

			for(int j=0; j<n; j++){
				if(i==0 || j==0 || j==n-1 && i<=n/2|| i==n/2 || i==j && i>=n/2){
					Thread.sleep(sleep_time);
					System.out.print("* ");
				}else
				{
					System.out.print("  ");
				}
			}

			System.out.print("  ");
			//AAAAAAA

			for(int j=0; j<n; j++){
				if(i==0 || j==0 || j==n-1 || i==n/2){
					Thread.sleep(sleep_time);
					System.out.print("* ");
				}else
				{
					System.out.print("  ");
				}
			}

			System.out.print("  ");
			//NNNNNNNN

			for(int j=0; j<n; j++){
				if(j==0 || j==i|| j==n-1){
					Thread.sleep(sleep_time);
					System.out.print("* ");
				}else
				{
					System.out.print("  ");
				}
			}

			System.out.print("");
			//......

			for(int j=0; j<n; j++){
				if(i==n-1 && j==n/2){
					Thread.sleep(sleep_time);
					System.out.print("* ");
				}else
				{
					System.out.print("  ");
				}
			}

			System.out.print("");
			//GGGGGGGG

			for(int j=0; j<n; j++){
				if(i==0 && j<=n/2 || j==0 || i==n-1 && j<=n/2 || j==n/2 && i>=n/2 || i==n/2 && j>=n/2 || j==n-1 && i>=n/2){
					Thread.sleep(sleep_time);
					System.out.print("* ");
				}else
				{
					System.out.print("  ");
				}
			}

			System.out.println();
		}
		System.out.println("\n\n\n");

	}
}
