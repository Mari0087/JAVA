import java.util.*;
class m {
    static Scanner sc=new Scanner(System.in);
    public static void Qspiter()throws Exception{
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
                        break;
                    }
                    case 2:{
                        System.out.println("SQL...");
                        break;
                    }
                    case 3:{
                        System.out.println("Web-Tech...");
                        break;
                    }
                    case 4:{
                        System.out.println("Testing...");
                        break;
                    }
                    default:
                    {
                        System.out.println("Invalid Input");
                        break;
                    }
                }
    }
    public static void Remote()throws Exception{
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
                        break;
                    }
                    case 2:{
                        System.out.println("Power Off...");
                        break;
                    }
                    case 3:{
                        System.out.println("Valume Up...");
                        break;
                    }
                    case 4:{
                        System.out.println("Valume Down...");
                        break;
                    }
                    case 5:{
                        System.out.println("Mute...");
                        break;
                    }
                    default:
                    {
                        System.out.println("Invalid Input");
                        break;
                    }
                }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("\t\t\t Select Your Application");
        System.out.println("\n1.Jspiter Skills\n2.Remote\n3.Exit\n");
        int input=sc.nextInt();
        System.out.println("Processing...");
        Thread.sleep(3000);
        if(input==1){
            Qspiter();
        }else if(input==2){
            Remote();
        }else if(input==3){
            System.out.println("Tata, Bye Bye,See you,Katham,Goodu Bye");
        }else{
            System.out.println("Invalid Input");
        }
    }
}
