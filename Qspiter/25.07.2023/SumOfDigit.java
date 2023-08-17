import java.util.*;
class SumOfDigit 
{
	static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number");
		int num = sc.nextInt();
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
}