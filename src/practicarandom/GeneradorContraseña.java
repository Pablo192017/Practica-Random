/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicarandom;
import java.util.Random;
import java.util.Scanner;

public class GeneradorContraseña {
    
    static void Generador(){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                          + "abcdefghijklmnopqrstuvwxyz"
                          + "0123456789"
                          + "!@#$%^&*()_+-=[]{}|;:,.<>?";
        
        System.out.print("Ingresa el tamaño de la contraseña: ");
        int tamaño = sc.nextInt();
        sc.nextLine();
        
        StringBuilder contraseña = new StringBuilder();
        
        for (int i = 0; i < tamaño; i++) {
            int indice = rd.nextInt(caracteres.length());
            char caracterAleatorio = caracteres.charAt(indice);
            contraseña.append(caracterAleatorio);
        }
        
        System.out.println("Contraseña generada: "+ contraseña.toString());
        
    }
    
}
