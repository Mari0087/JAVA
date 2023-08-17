class test 
{	
	static int count=1;
	public static void main(String[] args) 
	{
		System.out.println("Hi from main");
		m1();
		System.out.println("Bye from main");
	}

	public static void m1(){
		if (count!=5)
		{
		System.out.println(count);
		count++;
		m1();
		}
	}
}
