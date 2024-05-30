package com.example.ArraysDemo;

import java.util.Iterator;

/**
 * Hello world!
 *
 */
public class App 
{
	private static int ARRAY_SIZE;
	private static String nombre;
	
    public static void main( String[] args )
    {
    	//Las variables que se declaran dentro de metodos son locales 
    	// y no se inicializan a un valor por defecto de forma implicita
    	String otroNombre = null;
    	/*Manejo de los argumentos que recibe el metodo main, es decri, la App cuando se ejecuta.
    	 * Porque la App cuando se ejecuta recibe como parametro un array de argumentos tipo
    	 * String(String[] args).
    	 * Donde se especifia los argumentos que reciba la App en el IDE eclipse
    	 * RTA. En la configuracion de las opciones de ejecucion*/
    	
    	// Pirmero hay que comprobar si la App esta recibiendo los argumentos esperados
    	if(args.length == 0) {
    	System.out.println("No se han recibido los argumentos esperados");
    	} else if (args.length != 3) {
    		System.out.println("No se han recibido 3 argumentos");
    	} else {
    		// mostrar o manejar los argumentos recibidos
    		System.out.println("Se han recibido los siguientes argumentos");
    		for(String argumento : args)
    			System.out.println(argumento);
    		ARRAY_SIZE = Integer.parseInt(args[1]); //"20"
    		
    		System.out.println("El tamaño del array es : " + ARRAY_SIZE);
    	}
    	
    }
}
