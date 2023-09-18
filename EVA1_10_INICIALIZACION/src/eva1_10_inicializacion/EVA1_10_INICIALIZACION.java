/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_inicializacion;

/**
 *
 * @author Legion
 */
public class EVA1_10_INICIALIZACION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int valor = 296; // Inicializando la variable
        System.out.println(valor);

        int precio;// Declarar
        precio = 100; // inicializar

        double salario = 100, precioMayoreo = 323, iva = 568.33, subtotal = 33.2, total = 3325.25; // tenemos 5 variables, TODAS, de tipo double
        // Cada todas las variables se pueden declarar e inicializar  en una misma linea de codigo, siempre y cuando sean del mismo tipo(ejemplo double) y se separa por comas
        // constantes
        // final-------> TE PERMITE ASIGNAR UN VALOR SOLO UNA VEZ
        final int conteo;
        conteo = 100;
        System.out.println(conteo);

        final double MI_VALOR_PI = 3.1416;
        final String ECUELA = "Instituto Tecnlógico de Chihuahua II";
        final int CALIFA_PASAR = 70;
        
        
        
        /* 
        varias lienas de comentarios
        cuando quieren tirar mucho rollo
        esta es la mejor opcion
        */
        System.out.println("Esto esta antes de la linea y si lo lee");   // Comentario de una sola línea ignorara lo que este despues de la doble liena, pero si leera lo que este antes 
    }

}
