/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosA;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class Leer {
    public static void main(String [] arg) {
File archivo = null;
FileReader fr = null;
try {
archivo = new File ("C:\\Users\\Usuario\\Desktop\\escribir\\prueba.txt");
String linea;
fr = new FileReader (archivo);
BufferedReader br = new BufferedReader(fr);
while((linea=br.readLine())!=null)
System.out.println(linea);
}
catch(IOException e){
System.out.println(e);
}finally{
try{
if( fr != null){
fr.close();
}
}catch (IOException e){
System.out.println(e);
}
}
}
}