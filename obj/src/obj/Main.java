/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obj;

/**
 *
 * @author Usuario
 */
public class Main {
    Base b;
    public Main() {
        
    }
     
    public static void main(String[] args) {
      //autoreferenciar la clase
      //hacer un objeto = instacia de una clase
        Main n = new Main();
        n.ejecutarFunc();
        
    }
    public void ejecutarFunc() {
        b=new Base();
        b.num=5;
        System.out.println(""+b.funcion(5));
    }
}
