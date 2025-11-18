import  java.util.Scanner;
public class Arraysear{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size =sc.nextInt();
        int arr[]=new int[size];
         int i;
        boolean found=false;
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt(); }
            int a =sc.nextInt();
        
for( i=0;i<size;i++){
    if(a==arr[i]){
        found=true;
        break;
    }
}
    if(found==true){System.out.println(i);}
    else{System.out.println("-1");}
}
    }

        