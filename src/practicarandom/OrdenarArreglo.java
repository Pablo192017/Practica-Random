/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicarandom;
import java.util.Scanner;
import java.util.Random;

public class OrdenarArreglo {
    
    static int max_valores = 10;
    static String tipo;
    static int[] numeros = new int[max_valores];
    static String[] texto = new String[max_valores];
    static int valoresIg = 0;
    
    static void Ordenar(){
        Scanner sc = new Scanner(System.in);
        
        int opcion;
        do {            
            System.out.println("1. Tipo de arreglo");
            System.out.println("2. Agregar datos a el arreglo");
            System.out.println("3. Mostrar arreglo");
            System.out.println("4. Ordenar aleatoriamente el arreglo");
            System.out.println("5. Salir");
            System.out.print("Ingresa una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch (opcion) {
                case 1:
                    tipo(sc);
                    break;
                case 2:
                    agregar(sc);
                    break;
                case 3:
                    mostrar();
                    break;
                case 4:
                    ordenar();
                    break;
                case 5:
                    System.out.println("Finalizado.");
                    break;
                    
                default:
                    System.out.println("Error");
            }
            
        } while (opcion != 5);
        
    }
    
    static void tipo(Scanner sc){
        System.out.println("Tipo de arreglo (Numero n Texto t)");
        System.out.print("Ingresa el tipo de arreglo: ");
        tipo = sc.nextLine().toLowerCase();
        valoresIg = 0;
    }
    
    static void agregar(Scanner sc){
        if (valoresIg >= max_valores) {
            System.out.println("Arreglo lleno");
            return;
        }
        
        if (tipo.equals("n")) {
            System.out.print("Ingresa un numero: ");
            int numIg = sc.nextInt();
            sc.nextLine();
            numeros[valoresIg] = numIg;
            valoresIg++;
        } else if (tipo.equals("t")){
            System.out.print("Ingresa un texto: ");
            String text = sc.nextLine();
            sc.nextLine();
            texto[valoresIg] = text;
            valoresIg++;
        }else{
            System.out.println("Tipo de arreglo no definido");
        }
        
    }
    
    static void mostrar(){
        if (valoresIg == 0) {
            System.out.println("No hay datos en el arreglo");
            return;
        }
        
        System.out.println("Datos del arreglo; ");
        for (int i = 0; i < valoresIg; i++) {
            if (tipo.equals("n")) {
                System.out.println((i + 1)+ "Numero: "+ numeros[i]);
            } else if (tipo.equals("t")){
                System.out.println((i + 1)+ "Texto: "+ texto[i]);
            }
        }
        
    }
    
    static void ordenar(){
        if(valoresIg == 0){
            System.out.println("No hay datos para ordenar");
            return;
        }
        
        for (int i = valoresIg - 1;i > 0; i--) {
            Random rd = new Random();
            int j = rd.nextInt(i + 1);
            if (tipo.equals("n")) {
                int temp = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = temp;
            } else if (tipo.equals("t")){
                String temp = texto[i];
                texto[i] = texto[j];
                texto[j] = temp;
            }
        }
        
        System.out.println("Se ha ordenado aleatoriamente");
        
    }
    
}
