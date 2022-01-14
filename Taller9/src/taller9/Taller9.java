/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller9;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Taller9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       incremento();
    }
    public static void incremento(){
        Scanner entrada = new Scanner(System.in);
          System.out.println("Generar multiplos del numero: ");
          int num1= entrada.nextInt();
          int n=0;
           switch(num1){
                case 1: n=10;break;
                case 2: n=20;break;
                case 3: n=30;break;
                case 4: n=40;break;
                case 5: n=50;break;
                case 6: n=60;break;
                case 7: n=70;break;
                case 8: n=80;break;
                case 9: n=90;break;
            }
          for(int x=1;x<=n;x++){     
            int residuo=x%num1;
            if(residuo==0){
                 int multiplos=x;
                 System.out.println(multiplos);    
            }
          }
    }   
}
