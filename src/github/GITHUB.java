
package github;

import java.util.Scanner;


public class GITHUB {

    
    public static void main(String[] args) {
         Scanner n = new Scanner (System.in);
        String nomb;
        
        System.out.println("¿Cómo te llamas?");
        nomb = n.nextLine();
        SepararIniciales(nomb);
        System.out.println("Nombre completo: " +nomb);
        
    }
    public static void SepararIniciales (String name){
        String [] Iniciales = name.split (" ");
        System.out.println("Tus Iniciales son: ");
        for (int x = 0; x<Iniciales.length; x++) {
            System.out.println(Iniciales[x].charAt(0)+" ");
        }
        System.out.println("");
    }
}
