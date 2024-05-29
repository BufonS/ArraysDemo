package com.example.ArraysDemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// Variante dos 
    	//Como se declara una Array ?
    	int[] numeros = {
    		0,1,2,3,4,5,6,7,8,9,10,11,12,13,14	
    	};
    	// Un array de nombre seria 
    	String[] nombres = {
    			"Tamara","Jessy","Carlos","Adrián","Maria Lopez","Pablo","Maria Jose","Rosa"
    	};
    	
    	// Para mostrar por consola los elementos del arrays de nombres
    	// VARIANTE#1 utilizando una funcion pritnln, mostrar cada elemento del array
    	System.out.println(nombres[0]);
    	System.out.println(nombres[1]);
    	// ... Y, como podran apreciar, la variante #1 NO SIRVE para nada
    	
    	// VARIANTE#2 Implica utilizar una setencia de control de flujo para recorder la array y 
    	// lo veremos en la rama "setenciasdecontroldeflujo"
    	
    }
}
