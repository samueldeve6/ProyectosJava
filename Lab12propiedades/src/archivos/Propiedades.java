/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Usuario
 */
public class Propiedades {
	
	public void prop() throws IOException{

	FileReader archivo = null; 	//declaramos un atributo tipo FileReader para lectura de textos
	Properties p = new Properties(); //se instancia la clase Properties

	/*Tomamos  de la misma clase (getClass) la ruta del archivo donde guardamos las propiedades 
	el cual llamamos propiedades */
	String ruta = this.getClass().getResource("/propiedades.txt").getFile();

		archivo = new FileReader(ruta);
		p.load(archivo); //metodo de la clase Properties que carga el archivo
	
		//el método getProperty retorna la propiedad según el parámetro
		System.out.println(p.getProperty("propiedad1"));
		System.out.println(p.getProperty("propiedad2"));
		System.out.println(p.getProperty("propiedad3"));
		System.out.println(p.getProperty("propiedad4"));
	}
}

