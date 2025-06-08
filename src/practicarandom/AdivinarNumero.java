/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicarandom;
import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {
    
    static int intentos;
    static int numGenerado;
    
    static void Adivinar(){
        Scanner sc = new Scanner(System.in);
        
        int opcion;
        do{
            System.out.println("1. Numeros de intentos");
            System.out.println("2. Adivinar el numero");
            System.out.println("3. Cerrar programa");
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch (opcion) {
                case 1:
                    intentos();
                    break;
                case 2:
                    adivinarNumero(sc);
                    break;
                case 3:
                    System.out.println("Finalizado.");
                    break;
                    
                default:
                    System.out.println("Error");
            }
        }while(opcion != 3);
    }
    
    static void intentos(){
        System.out.println("Numeros de intentos: "+ intentos);
    }
    
    static void adivinarNumero(Scanner sc){
        
        while(true){
            Random rd = new Random();
            numGenerado = rd.nextInt(100) + 1;
            intentos = 0;
            
            while(true){
            int numIg;
            System.out.print("Adivina el numero de (1-100): ");
            numIg = sc.nextInt();
            intentos++;
            
            if(numIg < numGenerado){
                System.out.println("El numero es mayor");
            }else if(numIg > numGenerado){
                System.out.println("El numero es menor");
            }else{
                System.out.println("Adivinaste,  el numero era: "+ numGenerado+ "Intentos: "+ intentos);
                break;
                 }
            }
            
            System.out.println("Quieres volver a jugar? (s/n)");
            sc.nextLine();
            String respuesta = sc.nextLine();
            if (!respuesta.equalsIgnoreCase("s")) {
                break;
            }
            
        }
    }
    
}
