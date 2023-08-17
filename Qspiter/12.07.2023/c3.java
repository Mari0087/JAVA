import java.util.*;
class c3 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("\t\t Check given charecter is vowel or consonant");
        System.out.println("Enter the Character");
        char given_char=sc.next().charAt(0);
        String res=(given_char=='a' || given_char=='A' || given_char=='e' || given_char=='E' || given_char=='i' || given_char=='I' || given_char=='o' || given_char=='O' || given_char=='u' || given_char=='U')? "Given Charecter is Vowel": "Given Charecter is consonant";
        System.out.println(res);
    } 
}