import java.util.Scanner;

public class ConversaoParaString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");

        for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                String x1=Integer.toString(x);
                String s2=String.format("%-15s",s1);
                String x2=String.format("%3s",x1).replace(" ","0");
                System.out.println(s2+""+x2); 
        }
        System.out.println("================================");
    }
}
