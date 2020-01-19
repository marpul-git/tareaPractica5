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
        boolean correcto= true;
        int num=0;
        
        do{System.out.println("Introduzca un nº entero");
            try{
                num=Integer.parseInt(sc.nextLine());
                correcto=true;
            }catch(Exception e){
                correcto=false;
                System.out.println("Tienes que introducir un numero entero");
            }
            
        }while (correcto==false);
   
        return num;
    }
    public static int leerEntero (String mensaje){
        
        Scanner sc=new Scanner(System.in);
        boolean correcto= true;
        int num=0;
        
        do{System.out.println(mensaje);
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
    
    public static int leerEntero (String mensaje,int min){
        
        Scanner sc=new Scanner(System.in);
        int num=0;
        boolean correcto=true;
        
        do {
            System.out.println(mensaje);
            try{
                num= Integer.parseInt(sc.nextLine());
            }catch(Exception e){
                System.out.println("Tienes que introducir un numero entero");
                correcto=false;
            }
            if (num >=min ) {
                correcto= true;
            }else{
                System.out.println("Tienes que introducir un numero entero mayor ó igual de "+min);
                correcto=false;
            }
        }while(correcto==false);
        
        return num;
    }
    
    public static int leerEntero (int _min,int _max,String mensaje){
        Scanner sc=new Scanner(System.in);
        int num=0;
        int min=_min;
        int max=_max;
        boolean correcto=true;
        
        if (min>max) {
            min=_max;
            max=_min;
        }
        do {
            System.out.println(mensaje);
            try{
                num= Integer.parseInt(sc.nextLine());
            }catch(Exception e){
                correcto=false;
            }
            if (num >=min && num<=max) {
                correcto= true;
            }else{
                System.out.println("Elige un nº entre "+min+" y "+max);
                correcto=false;
            }
        
        }while(correcto==false);

        return num;
    }
    
    public static long leerEnteroLargo(){
        
        Scanner sc=new Scanner(System.in);
        boolean correcto= true;
        long num=0;
        do{System.out.println("Introduzca un nº entero");
        try{
            num=Long.parseLong(sc.nextLine());
            correcto=true;
        }catch(Exception e){
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
            correcto=false;
        }
            
        }while (correcto==false);
      
        return num;
    }
    
    public static float leerReal (){
        Scanner sc=new Scanner(System.in);
        boolean correcto= true;
        float num=0;
        do{
            System.out.println("Introduzca un número real");
            try{
                num=Float.parseFloat(sc.nextLine());
                correcto=true;
            }catch(Exception e){
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
    
    public static double leerRealLargo (){
        Scanner sc=new Scanner(System.in);
        boolean correcto= true;
        double num=0;
        do{System.out.println("Introduzca un nº real");
        try{
            num=Double.parseDouble(sc.nextLine());
            correcto=true;
            
        }catch(Exception e){
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
            correcto=false;
        }
            
        }while (correcto==false);
    
        return num;
    }
    public static String leerCadena (){
        
        Scanner sc=new Scanner(System.in);
        String cadena;
        
        System.out.println("Introduzca una cadena de texto");
        cadena=sc.nextLine();
             
        return cadena;
    }
    public static String leerCadena (String mensaje){
        
        
        String cadena=mensaje;
        
        
        
        
        return cadena;
    }
    public static char leerCaracter (){
        
        Scanner sc=new Scanner(System.in);
        char caracter=' ';
        String cadena;
        
        do
        {
            System.out.println("Introduzca un caracter");
        
            cadena=sc.nextLine();
        
            if (cadena.length()>1) {
            
                System.out.println("Introduce un solo caracter");
                
            }else{ 
            
                caracter=cadena.charAt(0);
            }
        }while(cadena.length()>1);
        
        return caracter;
        
        
       
    }
    public static char leerCaracter (String mensaje){
        
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
    public static boolean leerBooleano (){
        
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
    public static boolean leerBooleano (String mensaje){
        
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
    public static void escribir (String mensaje){
        
        System.out.print(mensaje);
        
    }
    public static void escribirLn (String mensaje){
        
        System.out.println(mensaje);
    }
}
