/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasees;

import java.util.Scanner;

/**
 *
 * @author Semipresencial
 */
public class ES {
    
    
    
    public ES(){
        
    }
    public static int leerEntero (){
        
        Scanner sc=new Scanner(System.in); //Entrada de teclado
        boolean correcto= true; //variable que comprueba que la entrada sea correcta
        int num=0;
        
        do{System.out.println("Introduzca un nº entero");//se muestra en pantalla
            try{
                num=Integer.parseInt(sc.nextLine());//metodo que convierte la entrada de texto en un nº entero
                correcto=true;
            }catch(Exception e){ 
                correcto=false;//mientras  la entrada no sea correcta se repetira el bucle
                System.out.println("Tienes que introducir un numero entero");
            }
            
        }while (correcto==false);
   
        return num;
    }
    public static int leerEntero (String mensaje){ //igual pero introduciendo por parametro el mensaje que queramos
        
        Scanner sc=new Scanner(System.in);
        boolean correcto= true;
        int num=0;
        
        do{System.out.println(mensaje);//Muestra en pantalla el mensaje introducido
            try{
                num=Integer.parseInt(sc.nextLine());
                correcto=true;
            }catch(Exception e){
                System.out.println("Tienes que introducir un numero entero");
                correcto=false;
            }
            
        }while (correcto==false);
        
        return num;
    }
    
    public static int leerEntero (String mensaje,int min){//le indicamos que el nº a introducir tiene que ser mayor de min
        
        Scanner sc=new Scanner(System.in);
        int num=0;
        boolean correcto=true;
        
        do {
            System.out.println(mensaje);//Muestra en pantalla el mensaje introducido
            try{
                num= Integer.parseInt(sc.nextLine());
            }catch(Exception e){
                System.out.println("Tienes que introducir un numero");
                correcto=false;
            }
            if (num >=min ) {//Estructura condicional que comprueba el nº introducido
                correcto= true;
            }else{
                System.out.println("Tiene que ser mayor ó igual de "+min);
                correcto=false;
            }
        }while(correcto==false);
        
        return num;
    }
    
    public static int leerEntero (int _min,int _max,String mensaje){//el nºintroducido tiene que estar comprendido entre min y max
        Scanner sc=new Scanner(System.in);
        int num=0;
        int min=_min;
        int max=_max;
        boolean correcto=true;
        
        if (min>max) {//condiconal que comprueba el orden de los numeros introducidos. 
            min=_max;
            max=_min;
        }
        do {
            System.out.println(mensaje);//Muestra en pantalla el mensaje introducido
            try{
                num= Integer.parseInt(sc.nextLine());
            }catch(Exception e){
                System.out.println("Tienes que introducir un nº entero");
                correcto=false;
            }
            if (num >=min && num<=max) {
                correcto= true;
            }else{
                System.out.println("Entre "+min+" y "+max);
                correcto=false;
            }
        
        }while(correcto==false);

        return num;
    }
    
    public static long leerEnteroLargo(){//igual que leerEntero pero acepta enteros de hasta 19 dígitos
        
        Scanner sc=new Scanner(System.in);
        boolean correcto= true;
        long num=0;
        do{System.out.println("Introduzca un nº entero");
        try{
            num=Long.parseLong(sc.nextLine());
            correcto=true;
        }catch(Exception e){
            System.out.println("Tienes que introducir un numero entero");
            correcto=false;
        }
            
        }while (correcto==false);

        return num;
    }
       
    
    
    public static long leerEnteroLargo(String mensaje){

        Scanner sc=new Scanner(System.in);
        boolean correcto= true;
        long num=0;
        do{System.out.println(mensaje);
        try{
            num=Long.parseLong(sc.nextLine());
            correcto=true;
            
        }catch(Exception e){
            
            System.out.println("Tienes que introducir un nº entero");
            correcto=false;
        }
            
        }while (correcto==false);
      
        return num;
    }
    
    public static float leerReal (){//igual que leerEntero pero acepta nºs en coma flotante de precision simple
        Scanner sc=new Scanner(System.in);
        boolean correcto= true;
        float num=0;
        do{
            System.out.println("Introduzca un número real");
            try{
                num=Float.parseFloat(sc.nextLine());
                correcto=true;
            }catch(Exception e){
                System.out.println("Tienes que introducir un nº ");
                correcto=false;
        }
            
        }while (correcto==false);
   
        return num;
    }
    
    
    public static float leerReal (String mensaje){
        
        Scanner sc=new Scanner(System.in);
        boolean correcto= true;
        float num=0;
        
        do{System.out.println(mensaje);
            try{
                num=Float.parseFloat(sc.nextLine());
                correcto=true;
            }catch(Exception e){
                System.out.println("Tienes que introducir un nº ");
            correcto=false;
            }
            
        }while (correcto==false);
   
        return num;
    
    }
    public static float leerReal (String mensaje,int min){
        
        Scanner sc=new Scanner(System.in);
        float num=0;
        boolean correcto=true;
    
        do {
            System.out.println(mensaje);
            try{
                num=Float.parseFloat(sc.nextLine());
            }catch(Exception e){
                System.out.println("Tiene que ser un nº y mayor de: "+min);
                correcto=false;
            }
            if (num >=min ) {
                correcto= true;
            }else{
                System.out.println("Tiene que ser mayor de: "+min);
                correcto=false;
            }
        
        }while(correcto==false);
                
        return num;
    }
    
    public static double leerRealLargo (){//igual que leerReal pero acepta nºs en coma flotante de precision doble
        Scanner sc=new Scanner(System.in);
        boolean correcto= true;
        double num=0;
        do{System.out.println("Introduzca un nº real");
        try{
            num=Double.parseDouble(sc.nextLine());
            correcto=true;
            
        }catch(Exception e){
            System.out.println("Tienes que introducir un nº ");
            correcto=false;
        }
            
        }while (correcto==false);
   
        return num;
    }
    public static double leerRealLargo (String mensaje){
        
        Scanner sc=new Scanner(System.in);
        boolean correcto= true;
        double num=0;
        
        do{
            System.out.println(mensaje);
            try{
                num=Double.parseDouble(sc.nextLine());
                correcto=true;
            }catch(Exception e){
                System.out.println("Tienes que introducir un nº ");
                correcto=false;
        }
            
        }while (correcto==false);
    
        return num;
    }
    public static String leerCadena (){//metodo para introducir texto por teclado
        
        Scanner sc=new Scanner(System.in);
        String cadena;
        
        System.out.println("Introduzca una cadena de texto");
        cadena=sc.nextLine();
             
        return cadena;
    }
    public static String leerCadena (String mensaje){//igual pero podemos escoger el mensaje inicial que pide la entrada de texto
        
        
        String cadena=mensaje;
       
        return cadena;
    }
    public static char leerCaracter (){//metodo que nos pide un caracter (y sólo 1) por teclado
        
        Scanner sc=new Scanner(System.in);
        char caracter=' ';
        String cadena;
        
        do //hacer mientras el metodo cadena.length nos devuelva más de 1
        {
            System.out.println("Introduzca un caracter");
        
            cadena=sc.nextLine();
        
            if (cadena.length()>1) {//condicional que comprueba si se ha introducido más de un caracter por teclado
            
                System.out.println("Introduce un solo caracter");
                
            }else{ 
            
                caracter=cadena.charAt(0);
            }
        }while(cadena.length()>1);
        
        return caracter;
        
        
       
    }
    public static char leerCaracter (String mensaje){ //igual al anterior pero podemos cambiar el mensaje que pide la entrada de teclado
        
        Scanner sc=new Scanner(System.in);
        char caracter=' ';
        String cadena;
        
        do{
            System.out.println(mensaje);
        
            cadena=sc.nextLine();
        
            if (cadena.length()>1) {
            
                System.out.println("Introduce un solo caracter");
                
            }else{ 
            
                caracter=cadena.charAt(0);
            }
        }while(cadena.length()>1);
        
        return caracter;
        
        
        
    }
    public static boolean leerBooleano (){ //metodo  que nos permite escoger verdadero o falso mediante un caracter
        
        Scanner sc=new Scanner(System.in);
        
        boolean devuelve=false;//variable tru ó false que nos devuelve el método
        boolean opciones=false;//variable para comprobar que no se introduce otro caracter distinto a los escogidos
        char opcion=' ';
        
        do {
            
        opcion=ES.leerCaracter("Introduce si(S) ó no(N)");
        
            if (opcion=='S'||opcion=='s') {
                devuelve=true;
                opciones=true;
            }else if(opcion=='N'||opcion=='n'){
                devuelve=false;
                opciones=true;
            }else{
  
            System.out.println("tiene que introducir S ó N");
            }
        }while (opciones==false);
        
        return devuelve;
    }
    public static boolean leerBooleano (String mensaje){//igual al anterior pero podemos cambiar el mensaje que pide la entrada de teclado
        
         Scanner sc=new Scanner(System.in);
        
        boolean devuelve=false;
        boolean opciones=false;
        char opcion=' ';
        
        do {
            
        opcion=ES.leerCaracter("Introduce si(S) ó no(N)");
        
            if (opcion=='S'||opcion=='s') {
                devuelve=true;
                opciones=true;
            }else if(opcion=='N'||opcion=='n'){
                devuelve=false;
                opciones=true;
            }else{
  
            System.out.println("tiene que introducir S ó N");
            }
        }while (opciones==false);
        
        return devuelve;
        
    }
    public static void escribir (String mensaje){//metodo para mostrar el texto pasado por parametros en pantalla sin salto de linea
        
        System.out.print(mensaje);
        
    }
    public static void escribirLn (String mensaje){//metodo para mostrar el texto pasado por parametros en pantalla con salto de linea
        
        System.out.println(mensaje);
    }
}
