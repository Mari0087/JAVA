import java.util.*;
class EvenNumberCount 
{
	static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number");
		int num = sc.nextInt();
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
}
