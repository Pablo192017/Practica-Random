/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicarandom;
import java.util.Random;
import java.util.Scanner;

public class Dado {
    
    static int lanzamientos = 0;
    static int max_caras_guardadas = 10;
    static int[] caras = new int[max_caras_guardadas];
    
    static void LanzarDado(){
        Scanner sc = new Scanner(System.in);
        
        int opcion;
        do {            
            System.out.println("1. Lanzar dado");
            System.out.println("2. Historial de lanzamientos");
            System.out.println("3. Salir");
            System.out.print("Ingresa una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch (opcion) {
                case 1:
                    lanzar(sc);
                    break;
                case 2:
                    historial();
                    break;
                case 3:
                    System.out.println("Finalizado.");
                    break;
                    
                default:
                    System.out.println("Error");
            }
            
        } while (opcion != 3);
        
    }
    
    static void lanzar(Scanner sc){
        if (lanzamientos < max_caras_guardadas) {
            Random rd = new Random();
            int caraNum = rd.nextInt(6) + 1;
            caras[lanzamientos] = caraNum;
            lanzamientos++;
            System.out.println("Salio el numero: "+ caraNum);
        }else{
            System.out.println("Ya se alcanzo el limite de lanzamientos");
        }
    }
    
    static void historial(){
        System.out.println("Historial lanzamientos");
        for(int i = 0; i < lanzamientos; i++){
            System.out.println("lanzamiento: "+ (i + 1)+ ":"+ caras[i]);
        }
    }
    
}
