/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laberinto;

import static javax.management.Query.value;



public class MazeNode {
    private int value; // valor
    private int i;//x
    private int j;//y
    private boolean [] wayState; // Estado
    public MazeNode(int value,int i,int j) {
         this.value=value;
         this.i=i;
         this.j=j;
         wayState=new boolean[Contant.INITSIZE];
    }
    public int getValue() {
        return value;
    }
 
    public void setValue(int value) {
        this.value = value;
    }
 
    public void setI(int i) {
        this.i = i;
    }
 
    public void setJ(int j) {
        this.j = j;
    }
    public int getI() {
        return i;
    }
    public int getJ() {
        return j;
    }
    public boolean getWayState(int direction) {
        return wayState[direction];
    }
    public void setWayState(int direction,boolean isAble) {
        wayState[direction] = isAble;
    }
 
}