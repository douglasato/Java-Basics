import java.util.*;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        double n = le.nextDouble();
        
        for(int i=1;i<=n;i++){
            if(i%3 != 0 && i%5 != 0){
                System.out.println(""+i);
            }else{
                if(i%3 == 0 && i%5 == 0){
                    System.out.println("FizzBuzz");
                }
                else if(i%3 == 0 && i%5 != 0){
                    System.out.println("Fizz");
                }
                else if(i%3 != 0 && i%5 == 0){
                    System.out.println("Buzz");
                }                     
            }        
        }   
        le.close();   
    }      
}
