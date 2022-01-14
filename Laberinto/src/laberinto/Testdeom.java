/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laberinto;

/**
 *
 * @author Usuario
 */
public class Testdeom {
    public static  void main(String []args){
        Maze  m=new Maze(4,4);
        m.initEveryMazeNode();
                 System.out.println ("Ingrese con éxito, comience a caminar por el laberinto");
        m.adjustWayState();
        m.goMaze();
        m.show();
    }
 
}
