

public class brecon {
    public static void main(String[] args) {
        System.out.println("For loop with break & continue statement");


        for (int i = 0; i <= 10; i++) {
    if(i==9){
        continue;
    }
    System.out.println(i);{
        
    for(int j=0;j<=i;j++){
        if(j==5){
            break;
        }
        System.out.println(j);
    }
    }

    }

    
}
}