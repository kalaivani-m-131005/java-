import java.util.Scanner;
public class Home {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc .nextInt();
        int temp=num;
        int step=0;
        int sum=0;
        while(num>0){
            num=num/10;
            step++;
        }
        int div=(int)Math.pow(10, step-1);
        while(div>0){
            int dig =(temp/div)%10;
           int pow=dig*dig*dig;
           sum=sum+pow;
               div=div/10;
        }
         System.out.println(sum);

        if(sum==temp){ System.out.println("it is  amstrong number");}
        else {System.out.println("this is not amstrong");}
        
         
    }
}
/*
 153
153
it is  amstrong number

132
36
this is not amstrong
 */
