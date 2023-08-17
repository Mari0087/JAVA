import java.util.*;
class App
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String []args) throws Exception
	{
		System.out.println("\t\t\tWelcome to My Application");
		System.out.println("1.Student Id's\n2.Laptop Details\n3.Exit\n");
		int input=sc.nextInt();
		System.out.println("Processing....");
		Thread.sleep(2000);
		
		switch(input)
		{
			case 1:{
				//Student Id's
				System.out.println("\t\t\tSelect The id's");
				System.out.println("1.Id-36\n2.Id-248\n3.Id-486\n");
				int user_input=sc.nextInt();
				System.out.println("Processing....");
				Thread.sleep(2000);
				
				switch(user_input)
				{
					case 1:{
						System.out.println("Name : Dingi");
						System.out.println("Mark : 442");
						System.out.println("YOP : 2023")
						break;
				}
					case 2:{
						System.out.println("Name : Dinga");
						System.out.println("Mark : 482");
						System.out.println("YOP : 2022")
						break;
				}
					case 3:{
						System.out.println("Name : Mongo");
						System.out.println("Mark : 342");
						System.out.println("YOP : 2020")
						break;
				}
				default:{
					System.out.println("Invalid Input");
					break;
				}
				break;
			}
			case 2:{
				//Student Id's
				System.out.println("\t\t\tSelect The id's");
				System.out.println("1.Dell\n2.Aues\n3.Hp\n");
				int user_input=sc.nextInt();
				System.out.println("Processing....");
				Thread.sleep(2000);
				
				switch(user_input)
				{
					case 1:{
						System.out.println("Storage : Dingi");
						System.out.println("Mark : 442");
						System.out.println("YOP : 2023")
						break;
				}
					case 2:{
						System.out.println("Name : Dinga");
						System.out.println("Mark : 482");
						System.out.println("YOP : 2022")
						break;
				}
					case 3:{
						System.out.println("Name : Mongo");
						System.out.println("Mark : 342");
						System.out.println("YOP : 2020")
						break;
				}
				default:{
					System.out.println("Invalid Input");
					break;
				}
				break;
			}
			case 1:{
				//Exit
				break;
			}
			default:{
				System.out.println("Invalid Input");
				break;
		}
	}
}