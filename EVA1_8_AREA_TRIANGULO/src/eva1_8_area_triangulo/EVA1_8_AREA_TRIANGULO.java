/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_8_area_triangulo;

import java.util.Scanner;

/**
 *
 * @author Legion
 */
public class EVA1_8_AREA_TRIANGULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double Base;
        /* double se utiliza para numeros con parte decimal*/
        double Altura;
        double Area;
        Scanner Capt = new Scanner(System.in);
        System.out.println("¿Cuál es la base del triángulo?");
        Base = Capt.nextDouble();
        System.out.println("¿Cuál es la altura del triángulo?");
        Altura = Capt.nextDouble();
        Area = (Base*Altura) / 2;
        System.out.println("El área de tu triángulos es: ");
        System.out.println(Area);
    }
    
}
