import java.util.Scanner;
import java.util.Arrays;
public class swap{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int arr[]=new int[size];
    for(int i=0;i<size;i++){
      arr[i]=sc.nextInt();

    }
    int i=0;
    int j=size-1;
    while(i<j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
    }
System.out.println("reversed "+ Arrays.toString(arr));
    }
}

/*
 5
1 2 3 4 5
reversed [5, 4, 3, 2, 1]
 */