class factorial
{
	static int fact=1;
	public static void main(String[] args) 
	{
		System.out.println("factorial is : "+findFactorial(4));
	}

	public static int findFactorial(int number){
		if (number>1){
			fact*=number;
			number--;
			findFactorial(number);
		}
		return fact;
	}
}
