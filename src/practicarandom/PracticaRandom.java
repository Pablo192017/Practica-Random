/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicarandom;
import java.util.Scanner;

public class PracticaRandom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int opcion;
        do{
            System.out.println("--MENU PRINCIPAL--");
            System.out.println("1. Generar numeros aleatorios");
            System.out.println("2. Adivinar el numero");
            System.out.println("3. Generacion de passwords");
            System.out.println("4. Simular el lanzamiento de un dado");
            System.out.println("5. Ordenar un arreglo aleatoriamente");
            System.out.println("6. Cerrar programa");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch (opcion) {
                case 1:
                    GeneradorDeNumeros.Generador();
                    break;
                case 2:
                    AdivinarNumero.Adivinar();
                    break;
                case 3:
                    GeneradorContraseña.Generador();
                    break;
                case 4:
                    Dado.LanzarDado();
                    break;
                case 5:
                    OrdenarArreglo.Ordenar();
                    break;
                case 6:
                    System.out.println("Finalizado.");
                    break;
                    
                default:
                    System.out.println("Error");
            }
            
        }while(opcion != 6);
        
    }
    
}
