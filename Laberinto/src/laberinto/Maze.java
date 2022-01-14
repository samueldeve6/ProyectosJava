/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laberinto;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author Usuario
 */

public class Maze {
    private MazeNode[][] mazeNodes;
    private int row;
    private int colum;
    private Stack<MazeNode> stack ;
 
    public Maze(int row,int colum){
        this.row = row;
        this.colum = colum;
        mazeNodes = new MazeNode[row][colum];
        stack = new Stack<>();
    }
    /**
     * Obtenga el valor del teclado, usado para inicializar cada nodo
     */
    public void initEveryMazeNode(){
        Scanner scanner = new Scanner(System.in);
                 System.out.println ("Ingrese la ruta del laberinto");
        for (int i=0;i<row;i++){
            for(int j=0;j<colum;j++){
                int a=scanner.nextInt();
                mazeNodes[i][j] = new MazeNode(a,i,j);
            }
        }
    }
    /**
           * Ajustar el estado de la ruta
     */
    public void adjustWayState(){
        for(int i=0;i<row;i++){
            for(int j=0;j<colum;j++){
                                 // este
                if(j<colum-1 && mazeNodes[i][j+1].getValue() == 0){
                    mazeNodes[i][j].setWayState(Contant.WAY_EAST,Contant.WAY_ABLE);
                }
                                 // oeste
                if(j>0 && mazeNodes[i][j-1].getValue() == 0){
                    mazeNodes[i][j].setWayState(Contant.WAY_WEST,Contant.WAY_ABLE);
                }
                                 // sur
               if(i<row-1&&mazeNodes[i+1][j].getValue()==0){
                    mazeNodes[i][j].setWayState(Contant.WAY_SOUTH,Contant.WAY_ABLE);
               }
                                 // norte
                if(i>0&&mazeNodes[i-1][j].getValue()==0){
                    mazeNodes[i][j].setWayState(Contant.WAY_NORTH,Contant.WAY_ABLE);
                }
            }
        }
    }
 
    /**
           * Caminando por el laberinto:
     */
    public void goMaze(){
        if(mazeNodes[0][0].getValue() != 0){
                         System.out.println ("Sin ruta del laberinto");
            return;
        }
        stack.push(mazeNodes[0][0]);
        while(!stack.isEmpty()){
                         MazeNode top = stack.peek (); // Obtener el elemento superior de la pila
                         int i = top.getI (); // esquina de línea
                         int j = top.getJ (); // Subíndice de columna
            if(i == row-1 && j == colum-1){
                                 System.out.println ("buscar ruta");
                break;
            }
                         // este
            if(top.getWayState(Contant.WAY_EAST) == Contant.WAY_ABLE){
                                 stack.push (mazeNodes [i] [j + 1]); // En el nodo este
                                 // Establece la dirección oeste del nodo este en un estado no transitable
                mazeNodes[i][j].setWayState(Contant.WAY_EAST,Contant.WAY_DISABLE);
                mazeNodes[i][j+1].setWayState(Contant.WAY_WEST,Contant.WAY_DISABLE);
                continue;
            }
                         // sur
          if(top.getWayState(Contant.WAY_SOUTH)==Contant.WAY_ABLE){
                stack.push(mazeNodes[i+1][j]);
                mazeNodes[i][j].setWayState(Contant.WAY_SOUTH,Contant.WAY_DISABLE);
                mazeNodes[i+1][j].setWayState(Contant.WAY_NORTH,Contant.WAY_DISABLE);
                continue;
          }
                         // oeste
            if(top.getWayState(Contant.WAY_WEST) == Contant.WAY_ABLE){
                                 stack.push (mazeNodes [i] [j-1]); // En el nodo oeste
                                 // Establecer la dirección este del nodo oeste para que no sea transitable
                mazeNodes[i][j].setWayState(Contant.WAY_WEST,Contant.WAY_DISABLE);
                mazeNodes[i][j-1].setWayState(Contant.WAY_EAST,Contant.WAY_DISABLE);
                continue;
            }
                         // norte
            if(top.getWayState(Contant.WAY_NORTH)==Contant.WAY_ABLE){
                stack.push(mazeNodes[i-1][j]);
                                 // Establece la dirección sur del nodo norte en un estado no transitable
                mazeNodes[i][j].setWayState(Contant.WAY_NORTH,Contant.WAY_DISABLE);
                mazeNodes[i-1][j].setWayState(Contant.WAY_SOUTH,Contant.WAY_DISABLE);
                continue;
            }
           if(top.getWayState(Contant.WAY_EAST) == false&&top.getWayState(Contant.WAY_WEST) == false&&top.getWayState(Contant.WAY_SOUTH) == false&&top.getWayState(Contant.WAY_NORTH) == false){
                MazeNode mazeNode = stack.pop();
           }
        }
    }
 
    public void show(){
        if(stack.isEmpty()){
                         System.out.println ("Sin ruta del laberinto");
            return;
        }
        while(!stack.isEmpty()){
                         // Ver el elemento superior de la pila
            MazeNode top =  stack.peek();
                         // Cambiar valor
                top.setValue(6);
                                 // Obtenga el valor superior de la pila, luego elimine
                stack.pop();
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<colum;j++) {
                System.out.print(mazeNodes[i][j].getValue()+"  ");
            }
            System.out.println();
        }
    }
 
 
}