/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosA;
import java.io.*;
/**
 *
 * @author Usuario
 */
public class Escribir {
    /**
     * @param args the command line arguments
     */
public static void main(String[] args){
try{
FileWriter Archivo = new FileWriter("C:\\Users\\Usuario\\Desktop\\escribir\\prueba.txt");
    try (PrintWriter pw = new PrintWriter(Archivo)) {
        pw.println("Prueba de escritura de archivos de texto en java ");
    }
} catch (Exception e){
e.printStackTrace();
}

}
}
