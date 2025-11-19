
import java.util.Scanner;
public class St {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String input= sc.nextLine();
        int vow=0;
        String vowels="AEIOUaeiou";
        for(int i=0;i<input.length();i++){
            if(vowels.contains(input.charAt(i)+""))
            vow++;
        }
       System.out.println(vow); 
       
    }
}
/*apple
2 */

