import java.util.Scanner; // Importamos la librería java.util

public class Codigo5 {
    public static void main(String[] args) {
        // Creamos el Scanner
        Scanner s = new Scanner(System.in);
        
        // Damos contexto al usuario
        System.out.print("Introduzca un número: ");
        
        // Leemos el número 
        int ni = s.nextInt();
        int c = ni; // Guardamos el número
        
        // Inicializamos las variables afo y noAfo
        int afo = 0;
        int noAfo = 0;
        
        // Procesamos cada dígito del número
        while (ni > 0) {
            int digito = ni % 10; // Extraemos el último dígito
            if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
                afo++; // Contamos los afortunados
            } else {
                noAfo++; // Contamos los no afortunados
            }
            ni /= 10; // Eliminamos el último dígito
        }
        
        // Mostramos los resultados si el número es afortunado
        if (afo > noAfo) {
            System.out.println("El " + c + " es un número afortunado.");
        } else {
            System.out.println("El " + c + " no es un número afortunado.");
        }
        
        // Cerramos el Scanner 
        s.close();
    }
}
