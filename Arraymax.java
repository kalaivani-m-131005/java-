import  java.util.Scanner;
public class Arraymax{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size =sc.nextInt();
        int max=Integer.MIN_VALUE;
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
            if(max<arr[i])
            max=arr[i];
        }
        
System.out.println(max);
    
}
}
