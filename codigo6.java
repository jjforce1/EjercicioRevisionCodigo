import java.util.Scanner;

public class codigo6 {
	  
	/* Se añadio el el metodo main*/ 
	public static void main(String[] args) {
	   int [] n = new int [20]; //Se añadio la palabra new

	    //El ciclo for añade 20 // Añadimos un signo +
	    for (int i = 0; i < 20; i++){
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.print(n[i] + " "); //Se añadio .out
	    }
	    
	    // Damos contexto al usuario.
	    System.out.println("\n¿Qué números quiere resaltar? ");
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	   
	    //Inicializamos el scanner.
	    Scanner s = new Scanner(System.in);
	   
	    int opcion = s.nextInt(); //Cambiamos el método de obtener informacion del teclado.
	    
	    //Nos asrguramos que el usuario ingrese solo el numero 1 o 2.
	    if (opcion != 1 && opcion != 2) {
	        System.out.println("Opción inválida. Debe ser 1 o 2.");
	        s.close();
	        return;
	    }

	    int multiplo = (opcion == 1) ? 5 : 7; // Cambiamos de posicion el signo de interrogacion

	    // Cambiamos el tipo de la variable e
	    for (int e : n) {
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	      }
	       else {
	        System.out.print(e + " ");
		    }
	    }
	    s.close();
	}
}
