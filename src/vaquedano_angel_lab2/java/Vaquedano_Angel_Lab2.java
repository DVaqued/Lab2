/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vaquedano_angel_lab2.java;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Vaquedano_Angel_Lab2{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int ejer=0;
        while (ejer!=4){
        
        Scanner lea=new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("---Menú---");
        System.out.println("Ingrese 1 si quiere ir al ejercicio CADENA");
        System.out.println("Ingrese 2 si quiere ir al ejercicio NOTAS");
        System.out.println("Ingrese 3 si quiere ir al ejercicio CLASES");
        System.out.println("Ingrese 4 si quiere salir.");
        
        System.out.println("Favor ingrese el número del ejercicio que desea realizar: ");
        ejer=lea.nextInt();
        
        
        if (ejer==1){
        System.out.println("Favor ingrese la linea de caracteres: ");
        String linea=lea.next().toLowerCase();

        int cantidadveces=0;
        char letrarepetida=' ';

        int cont=0;
        while (cont<linea.length()) {
            char caracterActual=linea.charAt(cont);
            int frecuenciaActual=0;

            int contador=0;
            while (contador<linea.length()) {
                if (linea.charAt(contador)==caracterActual) {
                    frecuenciaActual++;
                }
                contador++;
            }

            if (frecuenciaActual>cantidadveces) {
                cantidadveces=frecuenciaActual;
                letrarepetida=caracterActual;
            }
            cont++;
        }

        System.out.println("El caracter que mas se repite es "+letrarepetida+
                "\n y el número de veces que se repite es "+cantidadveces);
        
    }
        
        else if (ejer==2){
            int contador=1;
            double nota=0;
            int cantidadnotas=0;
            double sumatotal=0;
            double promedio=0;
            double notamayor=0;
            double notamenor=100;
            
           
                
            System.out.println("Favor ingrese la cantidad de notas: ");
            cantidadnotas=lea.nextInt();
            while (cantidadnotas>1){
            while (cantidadnotas>=contador){
                System.out.println("Favor ingrese la nota "+contador+": ");
                nota=lea.nextDouble();
                
                
                if (nota>=0 && nota<=100){
                   contador+=1;
                   sumatotal+=nota;
                   
                   while(nota>notamayor){
                       notamayor=nota;
                       
                   }
                   while(nota<notamenor){
                       notamenor=nota;
                   }
                   promedio=sumatotal/contador;
                }
            }      
            }
            
            System.out.println("---Resultados---"+
                    "\n Su promedio es: "+promedio+
                    "\n Su nota mayor fue: "+notamayor+
                    "\n Su nota menor fue: "+notamenor);
        }
        
        else if(ejer==3){
            
        }
  
         else if(ejer==4){
                break;
        }
      
                }
        
    }
}