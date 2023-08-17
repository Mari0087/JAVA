import java.util.Scanner;

class hotel
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)throws Exception {
        boolean repeat=true;
        do{
        System.out.println("\t\t\tWelcome to Hotel App");
        System.out.println("Select a Hotel");
        System.out.println("1.A2B\n2.Buhari\n3.Exit");
        int input = sc.nextInt();
        System.out.println("Processing...");
        Thread.sleep(3000);
            switch(input)
        {
            case 1 :{
                boolean repeat1=true;
                do {
                    System.out.println("\t\t\tWelecom to A2B");
                    System.out.println("Select the input");
                    System.out.println("1.Briyani\n2.Porada\n3.Exit");
                    int dese=sc.nextInt();
                    System.out.println("Processing...");
                    Thread.sleep(3000);
                    switch (dese) {
                        case 1:{
                            System.out.println("\nYou Have Selected Briyani\n");
                            break;
                        }
                        case 2:{
                            System.out.println("\nYou Have Selected Porada\n");
                            break;
                        }
                        case 3:{
                            repeat1=false;
                            break;
                        }
                        default:{
                            System.out.println("\nInvalaid Input\n");
                            break;
                        }
                    }
                } while (repeat1);
                break;
            }
            case 2 :{
                boolean repeat1=true;
                do {
                    System.out.println("\t\t\tWelecom to Buhari");
                    System.out.println("Select the input");
                    System.out.println("1.Shawarma\n2.BBQ\n3.Exit");
                    int dese=sc.nextInt();
                    System.out.println("Processing...");
                    Thread.sleep(3000);
                    switch (dese) {
                        case 1:{
                            System.out.println("\nYou Have Selected Shawarma\n");
                            break;
                        }
                        case 2:{
                            System.out.println("\nYou Have Selected BBQ\n");
                            break;
                        }
                        case 3:{
                            repeat1=false;
                            break;
                        }
                        default:{
                            System.out.println("\nInvalaid Input\n");
                            break;
                        }
                    }
                } while (repeat1);
                break;
            }
            case 3 :{
                repeat=false;
                break;
            }
            default:{
                System.out.println("\nInvalaid Input\n");
            }
        }
        }while(repeat);
        System.out.println("******Thank You*******");
    }
}