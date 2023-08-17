import java.util.*;
class remote {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)throws Exception {
        System.out.println("Select Any button");
        System.out.println("1.On\n2.Off\n3.Valume-up\n4.Valume-down\n5.Mute");
        int user_input = sc.nextInt();

        System.out.println("Processing...");
        Thread.sleep(3000);

        if (user_input==1){
            System.out.println("Power button On");
        }else if(user_input==2){
            System.out.println("Power button Off");
        }else if(user_input==3){
            System.out.println("Valume Up");
        }else if(user_input==4){
            System.out.println("Valume Down");
        }else if(user_input==5){
            System.out.println("Valume Mute");
        }else{
            System.out.println("Sorry, Enter Valide Inputs");
        }
    }
}
