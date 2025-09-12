/*Q9. Customer Grouping (Medium)
Customers are grouped according to age and gender.
Group 1: Males under 25 years old
Group 2: Females under 25 years old
Group 3: Males between 25 - 45 years old
Group 4: Females between 25 - 45 years old
Group 5: All people over 45 years old.
Note : Gender code for a male is 1 and for female is 2. Display Invalid if user enters other gender
codes.
Input format :
Age in first line
Gender code in second line
Output format :
Group number
Sample test cases :
Input :
23
1
Output :
Group 1
 */


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=src.nextInt();
        System.out.println("male:1");
        System.out.println("female:2");
        System.out.print("Enter your Gender Code: ");
        int gen=src.nextInt();
        if(gen==1){
            if(age>0 && age<25)
            System.out.print("group 1");
            else if(age>=25 && age<45)
            System.out.print("group 3");
            else 
            System.out.print("group 5");
        }
        else if(gen==2){
        if(age>0 && age<25)
            System.out.print("group 2");
            else if(age>=25 && age<45)
            System.out.print("group 4");
            else 
            System.out.print("group 5");
        }
        else
        System.out.print("invalid code.");
    }
}