import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejerciciopares {	
	
	public static void main(String [] args) {
		//Especificamos los numeros que le entran
	    int segundoNumero=0;
	    int primerNumero=0;
	     
	    try {//lo encerramos en un try para captar error de introducir letra en numero
	    	cambiarNumeros(primerNumero, segundoNumero);
	    }catch(InputMismatchException e) {
	    	//En caso de que salga mal viene aqui
	    	System.out.println("Has introducido una letra en vez de un numero");
	    	cambiarNumeros(primerNumero, segundoNumero);
	    }
	}//Fin main
	
	public static void cambiarNumeros(int primerNumero, int segundoNumero) {
		Scanner escaner = new Scanner(System.in);  // Creamos un escaner para leer cosas por teclado
		
		System.out.println("Introduce el primer numero"); //vamos a pedir el primer numero
	    primerNumero = escaner.nextInt();
	    System.out.println("Introduce el segundo numero"); //vamos a pedir el primer numero
	    segundoNumero = escaner.nextInt();	
	     
	    if(segundoNumero<primerNumero) {//Para el caso de que el primero sea el mayor
	    	System.out.print("Numeros de "+primerNumero+" hasta "+segundoNumero+" son: \n");
	    	mostrarNumeros(primerNumero, segundoNumero);
	    }else { //Para el caso de que el segundos sea el mayor
	    	System.out.print("Numeros de "+segundoNumero+" hasta "+primerNumero+" son: \n");
	    	mostrarNumerosCreciente(primerNumero, segundoNumero); //Ejecutamos el mismo metodo cambiando el orden
			
	    }
	}//Final del metodo cambiarNumeros

	//Con este metodo nos ahorramos escribir el mismo codigo dos veces
	public static void mostrarNumeros(int primerNumero, int segundoNumero) { 
		int aux=0; //Esta variable nos sirve como ayuda para el segundo bucle
		
		for (int i = primerNumero; i >= segundoNumero; i--) {
    		aux=i;//Guardamos i para la segunda ejecucion en el for, esto se hace para dejar mas claro cada cosa
    		if (i % 2 == 0) { //Si el resto de la division es 0, entonces es par, % da el resto
				System.out.print("  Numero par");
				for (int j = aux; j >= 0; j--) {
		 			   //Si j%2 == 0 significa que el resto de la division es 0, es decir, que es par
		 			   if (j % 2 == 0) {
		 				System.out.print("  "+j + " ");
		 			   }
		 			}//Fin segundo for
			   }else { //si no es 0 el resto, es impar
				   System.out.print("  Numero impar");
				   for (int j = aux; j >= 0; j--) {
		 			   //Si j%2 == 0 significa que el resto de la division es 0, es decir, que es par
		 			   if (j % 2 != 0) { //Aqui decimos que si el resto es diferente de 0(impar) imprima por pantalla el numero
		 				  System.out.print("  "+j + " ");
		 			   }
		 			}//Fin segundo for
			   }
    		System.out.println();
    	}//Fin primer for
	}//Fin metodo mostrarNumeros
	
	//Con este metodo nos ahorramos escribir el mismo codigo dos veces
		public static void mostrarNumerosCreciente(int primerNumero, int segundoNumero) { 
			int aux=0; //Esta variable nos sirve como ayuda para el segundo bucle
			
			for (int i = primerNumero; i <= segundoNumero; i++) {
	    		aux=i;//Guardamos i para la segunda ejecucion en el for, esto se hace para dejar mas claro cada cosa
	    		if (i % 2 == 0) { //Si el resto de la division es 0, entonces es par, % da el resto
					System.out.print("  Numero par");
					for (int j = aux; j >= 0; j--) {
			 			   //Si j%2 == 0 significa que el resto de la division es 0, es decir, que es par
			 			   if (j % 2 == 0) {
			 				System.out.print("  "+j + " ");
			 			   }
			 			}//Fin segundo for
				   }else { //si no es 0 el resto, es impar
					   System.out.print("  Numero impar");
					   for (int j = aux; j >= 0; j--) {
			 			   //Si j%2 == 0 significa que el resto de la division es 0, es decir, que es par
			 			   if (j % 2 != 0) { //Aqui decimos que si el resto es diferente de 0(impar) imprima por pantalla el numero
			 				  System.out.print("  "+j + " ");
			 			   }
			 			}//Fin segundo for
				   }
	    		System.out.println();
	    	}//Fin primer for
		}//Fin metodo mostrarNumeros
	
	
}//Final de la clase
