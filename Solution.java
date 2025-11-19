import java.util.Scanner;
import java.lang.String;
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i =   scan.nextInt();
        Double d =scan.nextDouble();
            String s = scan.nextLine();
             scan.nextLine(); 
        String[] words = s.split(" ");

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
/*3
6.8
hi
String: 
Double: 6.8
Int: 3 */