import java.lang.Math;
class SignUp {
    public static void main(String[] args) {
        System.out.println("hi");
    }
    public static void getSignUp(){
        if (student.sign_up_key){
            System.out.println("\t\t\tSign-Up");
            student.sc.nextLine();
            System.out.println("Enter Your User Name:");
            student.user_name=student.sc.nextLine();
            System.out.println("Enter Your Contect:");
            student.contect=student.sc.nextLong();
            student.sc.nextLine();
            System.out.println("Enter The Password");
            student.pwt=student.sc.nextLine();
            System.err.println("\t\t\tSuccessfully SigUp...");
            student.sign_up_key=false;
        }else
        {
            System.err.println("\t\t\tAccount Already Exist. \n\t\t\t Please Login....");
        }
    }

     public static void getLogin(){
         if(!student.sign_up_key){
             System.out.println("\t\t\tLogin...");
             student.sc.nextLine();
             System.out.println("Enter User Name:");
             String logUser_name=student.sc.nextLine();
             System.out.println("Enter The Password:");
             String logPwt=student.sc.nextLine();
             if(student.user_name.equals(logUser_name) && student.pwt.equals(logPwt)){
                System.out.println("\t\tLogin SuccessFully Completed");
                boolean programCheck=true;
                while(programCheck){
                    System.out.println("\t\t\tWelcome To Work Place");
                    System.out.println("\n1.Numbers Programs\n2.Pattern Programs\n3.Exit");
                    System.out.println("\nSelect Input:");
                    int prog_user_input=student.sc.nextInt();
                    boolean number_check=true;
                    switch(prog_user_input){
                        case 1:{
                            while(number_check){
                                System.out.println("\n\t\t\tWelcome To Number Program\n");
                                System.out.println("1.primeOrNot\n2.EvenNumberCount\n3.NumberCount\n4.SumOfDigit\n5.xylemSum\n6.Exit");
                                System.out.println("Enter Input:");
                                int num_user_input=student.sc.nextInt();
                                switch (num_user_input) {
                                    case 1:{
                                        System.out.println("\n\t\t\tPrime Or Not\n");
                                        NumberPrograms.prime();
                                        break;
                                    }
                                    case 2:{
                                        System.out.println("\n\t\t\tEven Number Count\n");
                                        NumberPrograms.EvenNumberCount();
                                        break;
                                    }
                                    case 3:{
                                        System.out.println("\n\t\t\tNumber Count\n");
                                        NumberPrograms.NumberCount();
                                        break;
                                    }
                                    case 4:{
                                        System.out.println("\n\t\t\tSum Of Digit\n");
                                        NumberPrograms.SumOfDigit();
                                        break;
                                    }
                                    case 5:{
                                        System.out.println("\n\t\t\txylemSum\n");
                                        NumberPrograms.xylemSum();
                                        break;
                                    }
                                    case 6:{
                                        number_check=false;
                                        break;
                                    }
                                    default:{
                                        System.out.println("Please,Enter Valid Input");
                                        break;
                                    }
                                }
                            }
                            break;
                        }
                        case 2:{
                           while(number_check){
                             System.out.println("\n\t\t\tWelcome To Pattern Number\n");
                                System.out.println("1.Pattern-1\n2.Pattern-2\n3.Pattern-3\n4.Pattern-4\n5.Pattern-5\n6.Pattern-6\n7.Pattern-7\n8.Exit\n");
                                System.out.println("Enter Input:");
                                int patt_user_input=student.sc.nextInt();
                                switch(patt_user_input){
                                    case 1:{
                                       System.out.println("\t\t\tPattern-1");
                                       PatternProgram.pattern1();
                                        break;
                                    }
                                    case 2:{
                                       System.out.println("\t\t\tPattern-2");
                                       PatternProgram.Pattern2();
                                        break;
                                    }
                                    case 3:{
                                       System.out.println("\t\t\tPattern-3");
                                       PatternProgram.pattern3();
                                        break;
                                    }
                                    case 4:{
                                       System.out.println("\t\t\tPattern-4");
                                       PatternProgram.pattern4();
                                        break;
                                    }
                                    case 5:{
                                       System.out.println("\t\t\tPattern-5");
                                       PatternProgram.pattern5();
                                        break;
                                    }
                                    case 6:{
                                       System.out.println("\t\t\tPattern-6");
                                       PatternProgram.pattern6();
                                        break;
                                    }
                                    case 7:{
                                       System.out.println("\t\t\tPattern-7");
                                       PatternProgram.pattern7();
                                        break;
                                    }
                                    case 8:{
                                       number_check=false;
                                        break;
                                    }
                                }
                           }
                            break;
                        }
                        case 3:{
                            programCheck=false;
                            break;
                        }
                        default:{
                            System.out.println("\t\t\tInvalid Input");
                            break;
                        }
                    }
                }

             }else{
                 System.out.println("\t\t\tWrong Inputs..");
             }
         }else
         {
             System.out.println("\t\t\tPlease Sign-Up.....");
         }
     }

     public static void Forgetter() {
        if(!student.sign_up_key){
        System.out.println("\t\t\tForgetter Credumtied");
        student.sc.nextLine();
        System.out.println("Enter The User Name");
        String forUserName=student.sc.nextLine();
        if(forUserName.equals(student.user_name)){
            boolean forgetcheck=true;
            while(forgetcheck){   
                int user_otp=(int)(Math.random()*9999+9999);
                System.out.println("OTP:\t"+user_otp);
                if(user_otp==student.sc.nextInt()){
                    student.sc.nextLine();
                    System.out.println("Enter New Password:");
                    student.pwt=student.sc.nextLine();
                    forgetcheck=false;
                }
                else{
                    System.out.println("\t\t\tInvalid OTP\n\t\t\tEnter Correct OTP");
                }
            }
        }else{
            System.out.println("Invalid User Name");
        }
        }else
         {
             System.out.println("\t\t\tPlease Sign-Up.....");
         }
     }
}
