/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasees;

/**
 *
 * @author Semipresencial
 */
public class ClaseES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int entero=ES.leerEntero();
        
        System.out.println("El numero devuelto es "+entero);
        
        entero=ES.leerEntero("Introduce un nº entero");
        
        System.out.println("El numero devuelto es "+entero);
        
        entero=ES.leerEntero("Introduce un nº entero ",10);
        
        System.out.println("El nº devuelto es: "+entero);
        
        entero=ES.leerEntero(10,20,"Introduce un nº entero ");
        
        System.out.println("El nº devuelto es: "+entero);
        
        long numLargo=ES.leerEnteroLargo();
        
        System.out.println("El numero devuelto es "+numLargo);
        
        numLargo=ES.leerEnteroLargo("Introduzca un nº entero");
        
        System.out.println("El numero devuelto es "+numLargo);
        
        float numReal=ES.leerReal();
        
        System.out.println("El nº devuelto es: "+numReal);
        
        numReal=ES.leerReal("Introduce un número real");
        
        System.out.println("El nº devuelto es: "+numReal);
        
        numReal=ES.leerReal("Introduce un número real",15);
        
        System.out.println("El nº devuelto es: "+numReal);
        
        double numRealLargo=ES.leerRealLargo();
        
        System.out.println("El nº devuelto es: "+numRealLargo);
        
        numRealLargo=ES.leerRealLargo("Introduce un número real");
        
        System.out.println("El nº devuelto es: "+numRealLargo);
        
        String cadena=ES.leerCadena();

        System.out.println("La cadena devuelta es: "+cadena);
        
        cadena=ES.leerCadena("La casa de la pradera");
        
        System.out.println("La cadena devuelta es: "+cadena);
        
        char caracter=ES.leerCaracter();
        
        System.out.println("El caracter devuelto es: "+caracter);
        
        caracter=ES.leerCaracter("Seleccione un caracter");
        
        System.out.println("El caracter devuelto es: "+caracter);
        
        boolean salida=ES.leerBooleano();
        
        System.out.println(salida);
        
        salida=ES.leerBooleano("Escoja si(S) ó no(N)");
        
        System.out.println(salida);
        
        ES.escribir("La casa de Bernarda");
        ES.escribir("Alba \n");
        
        
        ES.escribirLn("La casa de Bernarda");
        ES.escribirLn("Alba");
        
       
    }
    
}
