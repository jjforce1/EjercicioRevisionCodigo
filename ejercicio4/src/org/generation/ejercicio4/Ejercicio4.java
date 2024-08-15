package org.generation.ejercicio4;
import java.util.Scanner; //Se importa Scanner

public class Ejercicio4 {
	public static void main (String[] args) { //Se agrega main
Scanner s = new Scanner(System.in); //Se agrega System.in
    
    System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    //s1 = new Scanner(); //Se agrega el s1
    String j1 = s.next();
    
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    //Scanner s2 = new Scanner();
    String j2 = s.next();
    
    if (j1.equals (j2)) { //Se quita el paréntesis extra
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2.equals ("tijeras")) {//Se cambia == por .equals
            g = 1;
          } 
         case "papel":
          if (j2.equals ("piedra")) {//Se cierra corchete
            g = 1;
            }

         case "tijeras": //Se modifica error ortográfico "tijera" a "tijeras"
          if (j2.equals("papel")) {
            g = 1;
          } 
            
          break;
        default:
      }
      System.out.println("Gana el jugador " + g);
    }
  
	}
}

