/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_entrada_salida;

import java.util.Scanner;

/**
 *
 * @author Legion
 */
public class EVA1_5_ENTRADA_SALIDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Declaración de variables
        String Nombre;
        String Apellidos;
        String NumControl;
        String Carrera;
        int Semestre;
        Scanner Capturador = new Scanner(System.in);
        // ; Fin de instruccion en Java
        System.out.println("Introduce tus Apellidos: ");
        Nombre = Capturador.nextLine();
        System.out.println("Introduce tus Nombres: ");
        Apellidos = Capturador.nextLine();
        System.out.println("Introduce tu NumControl: ");
        NumControl = Capturador.nextLine();
        System.out.println("Introduce tu carrera: ");
        Carrera = Capturador.nextLine();
        System.out.println("Introduce tu semestre: ");
        Semestre = Capturador.nextInt();
        /* Java es sensible a mayusculas y minusculas
        Es decir no es lo mismo System que system 
        3.- Mostrar los datos capturados */
        System.out.println(Nombre);
        System.out.println(Apellidos);
        System.out.println(NumControl);
        System.out.println(Carrera);
        System.out.println(Semestre);
    }
    
}
