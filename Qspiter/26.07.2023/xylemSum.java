import java.util.*;
class xylemSum {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int last = num%10;
        num/=10;
        int m_sum=0;
        int f_l_sum=0;
        int sumOfAll=0;
        while (num>9) {
            m_sum+=num%10;
            num/=10;
        }
        f_l_sum=last+num;
        if(f_l_sum==m_sum){
            System.out.println("Xylem Number");
        }else
        {
            System.out.println("Not Xylem Number");
        }
        int sum=0;
        sumOfAll=f_l_sum+m_sum;
        while(sumOfAll>0){
            sum+=sumOfAll%10;
            sumOfAll/=10;
        }
        System.out.println("Sum:"+sum);
    }
}
