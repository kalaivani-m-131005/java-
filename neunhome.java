
import java.util.Scanner;
public class neunhome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc .nextInt();
        int temp=num;  //num will be store in temp
        int step=0;
        int sum=0;
        int ko=0;
        while(num>0){  //(9>0) contion true so loop run
            num=num/10;//num=9/10 =>0(loop stop)
            step++;//step =1
        }
        int div=(int)Math.pow(10, step-1);//method to find the power
        while(div>0){//(1>0)loop start
            int dig =(temp/div)%10;//(9/1)%10 =>9
           int pow=dig*dig;//pow=9*9 =>81
           sum=sum+pow;//sum=0+81 => 81
           int val=sum/10;//first value in power (81/10)=>8
           int co= sum%10;//last value in power (81%10)=>1
           ko=val+co;//8+1 =>81
             System.out.println(ko);//81
               div=div/10;  //div=1/10=0 so loop stop
        }
       

        if(ko ==temp){ System.out.println("it is  neun number");}
        else {System.out.println("this is not neun number");}
        
         
    }
}

/*
 9
9
it is  neun number

6
9
this is not neun number
 */
