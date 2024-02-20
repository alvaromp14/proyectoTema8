/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatema8despliegue;

/**
 * Clase que proporciona métodos para operaciones matemáticas simples.
 * @author Julio y Alvaro
 * @version V1
 */
public class MiniCalculadoraEjemplo {

    /**
     * Calcula el valor absoluto de un número dado.
     *
     * @param numero Número del que se desea calcular el valor absoluto.
     * @return El valor absoluto del número dado.
     */
    public static double valorAbsoluto(double numero) {
        return Math.abs(numero);
    }

    /**
     * Calcula la raíz cuadrada de un número dado.
     *
     * @param numero Número del que se desea calcular la raíz cuadrada.
     * @return La raíz cuadrada del número dado.
     */
    public static double raizCuadrada(double numero) {
        return Math.sqrt(numero);
    }

    /**
     * Método principal para probar la funcionalidad de la clase MiniCalculadoraEjemplo.
     *
     * @param args Argumentos de línea de comandos (no utilizados en este ejemplo).
     */
    public static void main(String[] args) {
        double numero = -25.0;

        // Calcula y muestra el valor absoluto del número dado
        double valorAbsoluto = valorAbsoluto(numero);
        System.out.println("El valor absoluto de " + numero + " es: " + valorAbsoluto);

        // Calcula y muestra la raíz cuadrada del número dado
        double raiz = raizCuadrada(numero);
        System.out.println("La raíz cuadrada de " + numero + " es: " + raiz);
    }
}
