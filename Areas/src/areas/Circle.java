/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areas;

/**
 *
 * @author Usuario
 */
public class Circle extends Shape {
    Circle(int width){
        this.width = width;
    }
    @Override
    public void area(){
        double pi = Math.PI;
        double areaDos;
        areaDos = pi*width*width;
        System.out.println(areaDos);
    }
}
