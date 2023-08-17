class NumberPrograms {
    public static void main(String[] args) {
        System.out.println("main");
    }

	public static void prime() 
	{
		System.out.println("Enter the number");
		int number = student.sc.nextInt();
		String res="prime";
		for(int i=2;i<number;i++){
			if(number%i==0){
				res="composite";
				break;
			}
			else
				res="prime";
		}
		System.out.println(number+" is " +res);
	}

    public static void EvenNumberCount() 
	{
		System.out.println("Enter the Number");
		int num = student.sc.nextInt();
		int count = 0;
		int last =0;
		while(true){
			if(num==0)
				break;
			last=num%10;
			num/=10;
			if(last%2==0){
				count++;
			}
			
		}
		System.out.println("Even Number Count is "+count);

	}

    public static void NumberCount () 
	{
		System.out.println("Enter the Number");
		int num = student.sc.nextInt();
		int count = 0;

		while(true){
			if(num==0)
				break;
			num/=10;
			count++;
		}
		System.out.println("Count is "+count);

		if(count%2==0){
		System.out.println("Count is even number");
		}else{
		System.out.println("Count is odd number");			
		}
	}

    public static void SumOfDigit() 
	{
		System.out.println("Enter the Number");
		int num = student.sc.nextInt();
		int sum = 0;
		int last=0;
		while (true){
			if(num==0)
				break;
			last=num%10;
			sum+=last;
			num/=10;
		}
		System.out.println(sum);

	}

    public static void xylemSum() {
        System.out.println("Enter the number");
        int num = student.sc.nextInt();
        int last = num%10;
        num/=10;
        int m_sum=0;
        int f_l_sum=0;
        while (num>9) {
            m_sum+=num%10;
            num/=10;
        }
        f_l_sum=last+num;
        if(f_l_sum==m_sum){
            System.out.println("Xylem Number");
        }else
        {
            System.out.println("Not Xylem Number");
        }
        
    }
}

class PatternProgram{
	public static void main(String[] args) {
		System.out.println("main");
	}

	public static void pattern1(){
        int n=5;
        for(int i=0; i < n; i++){
            for(int j=0 ;j<n ;j++){
                if(j%2==0){
                    System.out.print("0 ");
                }else
                {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }

	public static void Pattern2(){
        int n=5;
        for(int i=0; i < n; i++){
            for(int j=0 ;j<n ;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

	public static void pattern3(){
        int n=5;
        for(int i=0; i < n; i++){
            char ch='A';
            for(int j=0 ;j<n ;j++){
                    System.out.print(ch++ +" ");
            }
            System.out.println();
        }
    }

	public static void pattern4(){
        int n=5;
        int count=1;
        for(int i=0; i < n; i++){
            for(int j=0 ;j<n ;j++){
                System.out.print(count++ +" ");
            }
            System.out.println();
        }
    }

	public static void pattern5(){
        int n=5;
        for(int i=0; i < n; i++){
            for(int j=0 ;j<n ;j++){
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

	public static void pattern6(){
        int n=5;
        for(int i=0; i < n; i++){
            int count=5;
            for(int j=0 ;j<n ;j++){
                System.out.print(count-- +" ");
            }
            System.out.println();
        }
    }

	public static void pattern7(){
        int n=5;
        for(int i=0; i < n; i++){
            int count=1;
            for(int j=0 ;j<n ;j++){
                System.out.print(count++ +" ");
            }
            System.out.println();
        }
    }
}
