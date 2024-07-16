import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class ConversaoSegundos {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in); 
        
        int n;

        System.out.println("Informe o valor em segundos: ");
        n = in.nextInt();

        int  h = n/3600, m = (n%3600)/60, seg = (n%3600)%60 ;

        System.out.println(""+h+":"+m+":"+seg);
        // if(seg%3600 == 0){
        //     m = 0;
        //     restseg = 0;
        //     System.out.println(""+ h +":"+ m +":"+restseg);
        // }else if (seg%3600 != 0) {

        //     if(h == 0){
        //         if(seg%60 == 0){
        //             restseg = 0;    
        //             System.out.println(""+ h +":"+ m +":"+restseg);
        //         }else{
        //             restseg = seg%60;
        //             System.out.println(""+ h +":"+ m +":"+restseg);
        //          } 
        //     }else{
        //         m = (h%3600)/60;
        //         restseg = (h%3600)%60;
        //         System.out.println(""+ h +":"+ m +":"+restseg);
        //     }           
        // } 
    }
}