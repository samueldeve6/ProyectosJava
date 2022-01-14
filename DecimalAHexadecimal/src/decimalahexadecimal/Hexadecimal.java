
package decimalahexadecimal;
public class Hexadecimal {
    public int Hxdecimal(int residuo){
        if(residuo==10){
            System.out.print("A");
        }
        else if(residuo==11){
            System.out.print("B");
        }
        else if(residuo==12){
            System.out.print("C");
        }
        else if(residuo==13){
            System.out.print("D");
        }
        else if(residuo==14){
            System.out.print("E");
        }
        else if(residuo==15){
            System.out.print("F");
        }
        else{
            System.out.print(residuo);
        }
        return residuo;
    }
}
