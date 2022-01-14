
package decimalahexadecimal;
import java.util.Scanner;
public class DecimalAHexadecimal {
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        Hexadecimal h=new Hexadecimal();
        int residuo,decimal;
        String num;
        
        System.out.print("Digite un numero decimal: ");
        num = entrada.nextLine();
        decimal = Integer.parseInt(num);
        System.out.print("En base 16 es: ");
        
        while(decimal !=0){
        residuo = (decimal%16);
        hexadecimal
        decimal = decimal/16;
        h.Hxdecimal(residuo);
    }
    
}
} 
    