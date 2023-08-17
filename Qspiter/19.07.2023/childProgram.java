import java.util.*;
class childProgram {
    static Scanner sc = new Scanner(System.in);
    public static void main(String []args)throws Exception
    {
        System.out.println("\t\t\t Select Your Application");
        System.out.println("\n1.Jspiter Skills\n2.Remote\n3.Exit\n");
        int input=sc.nextInt();
        System.out.println("Processing...");
        Thread.sleep(3000);

        switch (input)
        {
            case 1:{
                System.out.println("Welcome to QJSpiter");
                System.out.println("Select Any Skill");
                System.out.println("\n1.Java\n2.SQL\n3.Web_tech\n4.Testing\n");
                int user_input = sc.nextInt();

                System.out.println("Processing...");
                Thread.sleep(3000);

                switch(user_input)
                {
                    case 1:{
                        System.out.println("Java...");
                    }
                    case 2:{
                        System.out.println("SQL...");
                    }
                    case 3:{
                        System.out.println("Web-Tech...");
                    }
                    case 4:{
                        System.out.println("Testing...");
                    }
                    default:
                    {
                        System.out.println("Invalid Input");
                    }
                }
                break;
            }
            case 2:{
                System.out.println("Welcome to Sony Remote");
                System.out.println("Select Any button");
                System.out.println("\n1.On\n2.Off\n3.Valume-up\n4.Valume-down\n5.Mute\n");
                int user_input = sc.nextInt();

                System.out.println("Processing...");
                Thread.sleep(3000);

                switch(user_input)
                {
                    case 1:{
                        System.out.println("Power On...");
                    }
                    case 2:{
                        System.out.println("Power Off...");
                    }
                    case 3:{
                        System.out.println("Valume Up...");
                    }
                    case 4:{
                        System.out.println("Valume Down...");
                    }
                    case 5:{
                        System.out.println("Mute...");
                    }
                    default:
                    {
                        System.out.println("Invalid Input");
                    }
                }
                break;
            }
            case 3:{
                //Exit
                System.out.println("Tata, Bye Bye,See you,Katham,Goodu Bye");
                break;
            }
            default :
            {
                System.out.println("Invalid Input");
            }
        }
    }
}
