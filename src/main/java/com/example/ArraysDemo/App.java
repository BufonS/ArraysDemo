package com.example.ArraysDemo;

import java.util.Iterator;

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
    	
    	// PRIMERO Con setencia for de toda la vida, o clasica 
    	for(int i = 0; i < nombres.length; i++ ){
    		System.out.println(nombres[i]);
    	}	
    	/*Ejercicio1 Solamente mostrar los nombres del array de nombres que tienen
    	 * mas de 4 caracteres*/
    	for(int i = 0; i < nombres.length; i++) {
    		if (nombres[i].length() > 4) {
    			
    		System.out.println(nombres[i]);
    		}
    	}
    	/*Que diferencia hay en utilizar el operador de autoincremento, o 
    	 * autodecremnto antes o despues
    	 * 
    	 * PAra solucionar este problema, clasico d cuando empieza con un lenguaje de programacion 
    	 * utilizaremos JSHELL, que es como un Shell, que es un shell de python
    	 * que antes java no tenia
    	 * 
    	 * RTA. El operador de autoinccremento o autodecremento si esta solo en una sentencia,
    	 * da igual que vaya antes o despues, es decir, i++; o ++i; SON EXACTAMENTE LO MISMO,
    	 * sin embarg, i + ++j no es lo mismo que i + j++
    	 * 
    	 * NOTA MUY IMPORTANTE!!!! Cuando se utiliza el for clasico?
    	 * Cuando nos interesa el indice. 
    	 *  EJERCICIO#2 Por ejemplo, si queremos recorrer del array de numeros
    	 *  y solamente mostrar los elementos que son indices */
    	for(int i= 0; i < numeros.length; i++) {
    	if (i % 2 == 0)
    		System.out.println("el elemneto de indice " + i + ", es par");
    	}
    	
    	//SEGUNDO con un for mejorado, en ocasiones MAL llamado for each (por cada)
    	// y digo mal llamado porque la setencia forEach existe, como veran posteriormente
    	
    }
}
