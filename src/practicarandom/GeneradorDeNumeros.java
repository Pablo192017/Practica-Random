/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicarandom;
import java.util.Random;
import java.util.Scanner;

public class GeneradorDeNumeros {
    
    static void Generador(){
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        
        int max_val;
        
        System.out.print("Ingresa el valor maximo");
        max_val = sc.nextInt();
        int numero = rd.nextInt(max_val) + 1;
        
        System.out.println("Numero generado: "+ numero);
        
    }
    
}
