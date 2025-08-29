/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author Usuario
 */

import java.util.Scanner;
public class Lab1_ejercicios {
    

public class Lab1_ejercicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ejercicio 1
        System.out.println("Ejercicio 1");
        System.out.print("Digite un numero: ");
        int n1 = sc.nextInt();
        if (n1 % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }

        // Ejercicio 2
        System.out.println("\nEjercicio 2");
        System.out.print("Digite un numero: ");
        int n2 = sc.nextInt();
        if (n2 < 0) {
            n2 = -n2;
        }
        System.out.println("Valor absoluto: " + n2);

        // Ejercicio 3
        System.out.println("\nEjercicio 3");
        int suma = 0;
        for (int i = 3; i <= 99; i += 3) {
            System.out.print(i + " ");
            suma += i;
        }
        System.out.println("\nSuma = " + suma);

        // Ejercicio 4: 
        System.out.println("\nEjercicio 4");
        System.out.print("Digite el primer numero: ");
        int a = sc.nextInt();
        System.out.print("Digite el segundo numero: ");
        int b = sc.nextInt();
        System.out.print("Digite el tercer numero: ");
        int c = sc.nextInt();

        if (a > b) { int temp = a; a = b; b = temp; }
        if (a > c) { int temp = a; a = c; c = temp; }
        if (b > c) { int temp = b; b = c; c = temp; }
        System.out.println("Orden ascendente: " + a + ", " + b + ", " + c);

        // Ejercicio 5
        System.out.println("\nEjercicio 5");
        System.out.print("Digite el primer numero: ");
        int e5a = sc.nextInt();
        System.out.print("Digite el segundo numero: ");
        int e5b = sc.nextInt();
        if (e5a == e5b) {
            System.out.println("Multiplicacion = " + (e5a * e5b));
        } else if (e5a > e5b) {
            System.out.println("Resta = " + (e5a - e5b));
        } else {
            System.out.println("Suma = " + (e5a + e5b));
        }

        // Ejercicio 6
        System.out.println("\nEjercicio 6");
        boolean huboDiez = false;
        int nota;
        do {
            System.out.print("Digite una nota (o -1 para salir): ");
            nota = sc.nextInt();
            if (nota == 10) {
                huboDiez = true;
            }
        } while (nota != -1);
        if (huboDiez) {
            System.out.println("Si hubo nota 10");
        } else {
            System.out.println("No hubo nota 10");
        }

        // Ejercicio 7
        System.out.println("\nEjercicio 7");
        System.out.print("Digite sexo (F/M): ");
        char sexo = sc.next().charAt(0);
        System.out.print("Digite edad: ");
        int edad = sc.nextInt();
        double puls;
        if (sexo == 'F' || sexo == 'f') {
            puls = (220 - edad) / 10.0;
        } else {
            puls = (210 - edad) / 10.0;
        }
        System.out.println("Pulsaciones: " + puls);

        // Ejercicio 8
        System.out.println("\nEjercicio 8");
        System.out.print("Digite salario mensual: ");
        double salario = sc.nextDouble();
        System.out.print("Digite años de servicio: ");
        double años = sc.nextDouble();
        double porcentaje;
        if (años < 1) porcentaje = 0.05;
        else if (años < 2) porcentaje = 0.07;
        else if (años < 5) porcentaje = 0.10;
        else if (años < 10) porcentaje = 0.15;
        else porcentaje = 0.20;
        double utilidad = salario * porcentaje;
        System.out.println("Utilidad: " + utilidad);

        // Ejercicio 9
        System.out.println("\nEjercicio 9");
        System.out.print("Digite un numero: ");
        int num9 = sc.nextInt();
        boolean primo = true;
        if (num9 <= 1) primo = false;
        for (int i = 2; i <= Math.sqrt(num9); i++) {
            if (num9 % i == 0) primo = false;
        }
        if (primo) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }

        // Ejercicio 10
        System.out.println("\nEjercicio 10");
        System.out.print("Cantidad de computadoras: ");
        int cant = sc.nextInt();
        double precio = cant * 11000;
        double desc;
        if (cant < 5) desc = 0.10;
        else if (cant < 10) desc = 0.20;
        else desc = 0.40;
        double total = precio - (precio * desc);
        System.out.println("Total a pagar: " + total);

        // Ejercicio 11
        System.out.println("\nEjercicio 11");
        System.out.print("Digite un numero N: ");
        int N = sc.nextInt();
        System.out.println("Primos entre 2 y " + N + ":");
        for (int i = 2; i <= N; i++) {
            boolean esPrimo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break; 
                }
            }
            if (esPrimo) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Ejercicio 12
        System.out.println("\nEjercicio 12");
        System.out.print("Digite base: ");
        double base = sc.nextDouble();
        System.out.print("Digite altura: ");
        double altura = sc.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("Area del triangulo = " + area);

        sc.close();
    }
}
}
