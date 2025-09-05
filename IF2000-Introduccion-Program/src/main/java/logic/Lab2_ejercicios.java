/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Lab2_ejercicios {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENÚ EJERCICIOS (13 al 27) ===");
            System.out.println("13. Suma de pares entre 2 y 1000");
            System.out.println("14. Convertir °C a °F");
            System.out.println("15. Potencia X^N");
            System.out.println("16. Mes según número");
            System.out.println("17. Función F(x)");
            System.out.println("18. Área de triángulo (fórmula de Herón)");
            System.out.println("19. Intercambiar valores A y B");
            System.out.println("20. Ecuación de la recta y=mx+b");
            System.out.println("21. Suma de naturales menores que K");
            System.out.println("22. Media de números positivos");
            System.out.println("23. Pares, impares y sumas de 10 números");
            System.out.println("24. Suma pares e impares entre 1 y 200");
            System.out.println("25. Suma de cuadrados de 1 a 100");
            System.out.println("26. Factorial de un número");
            System.out.println("27. Máximo de 10 números");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 13 -> {
                    int suma = 0;
                    for (int i = 2; i <= 1000; i += 2) suma += i;
                    System.out.println("Suma = " + suma);
                }
                case 14 -> {
                    System.out.print("Ingrese °C: ");
                    double c = sc.nextDouble();
                    double f = (9.0 / 5) * c + 32;
                    System.out.println("Fahrenheit = " + f);
                }
                case 15 -> {
                    System.out.print("Ingrese X: ");
                    int x = sc.nextInt();
                    System.out.print("Ingrese N: ");
                    int n = sc.nextInt();
                    long pot = (long) Math.pow(x, n);
                    System.out.println("Resultado: " + pot);
                }
                case 16 -> {
                    System.out.print("Ingrese número (1-12): ");
                    int mes = sc.nextInt();
                    String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio",
                                      "Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
                    if (mes >= 1 && mes <= 12)
                        System.out.println("Mes: " + meses[mes-1]);
                    else
                        System.out.println("Número inválido.");
                }
                case 17 -> {
                    System.out.print("Ingrese x: ");
                    int x = sc.nextInt();
                    if (x > 0) System.out.println("F(x) = " + (x+5));
                    else if (x < 0) System.out.println("F(x) = " + (x*x));
                    else System.out.println("F(x) = 1");
                }
                case 18 -> {
                    System.out.print("Ingrese lado a: ");
                    double a = sc.nextDouble();
                    System.out.print("Ingrese lado b: ");
                    double b = sc.nextDouble();
                    System.out.print("Ingrese lado c: ");
                    double c = sc.nextDouble();
                    double p = (a+b+c)/2;
                    double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
                    System.out.println("Área = " + area);
                }
                case 19 -> {
                    System.out.print("Ingrese A: ");
                    int A = sc.nextInt();
                    System.out.print("Ingrese B: ");
                    int B = sc.nextInt();
                    int temp = A;
                    A = B;
                    B = temp;
                    System.out.println("Ahora A = " + A + " y B = " + B);
                }
                case 20 -> {
                    System.out.print("Ingrese X0: "); double X0 = sc.nextDouble();
                    System.out.print("Ingrese Y0: "); double Y0 = sc.nextDouble();
                    System.out.print("Ingrese X1: "); double X1 = sc.nextDouble();
                    System.out.print("Ingrese Y1: "); double Y1 = sc.nextDouble();
                    double m = (Y0 - Y1) / (X0 - X1);
                    double b = Y0 - m * X0;
                    System.out.println("Ecuación: y = " + m + "x + " + b);
                }
                case 21 -> {
                    System.out.print("Ingrese K: ");
                    int k = sc.nextInt();
                    int suma = 0;
                    for (int i = 1; i < k; i++) suma += i;
                    System.out.println("Suma = " + suma);
                }
                case 22 -> {
                    System.out.print("¿Cuántos números ingresará?: ");
                    int n = sc.nextInt();
                    double suma = 0;
                    for (int i = 1; i <= n; i++) {
                        System.out.print("Número " + i + ": ");
                        suma += sc.nextDouble();
                    }
                    System.out.println("Promedio = " + (suma/n));
                }
                case 23 -> {
                    int sumaP=0, sumaI=0, pares=0, impares=0, total=0;
                    for (int i=1;i<=10;i++){
                        System.out.print("Número " + i + ": ");
                        int num = sc.nextInt();
                        total += num;
                        if(num%2==0){ pares++; sumaP+=num; }
                        else{ impares++; sumaI+=num; }
                    }
                    System.out.println("Suma pares = " + sumaP);
                    System.out.println("Suma impares = " + sumaI);
                    System.out.println("Cantidad pares = " + pares);
                    System.out.println("Cantidad impares = " + impares);
                    System.out.println("Suma total = " + total);
                }
                case 24 -> {
                    int sumaP=0, sumaI=0;
                    for(int i=1;i<=200;i++){
                        if(i%2==0) sumaP+=i;
                        else sumaI+=i;
                    }
                    System.out.println("Suma pares = " + sumaP);
                    System.out.println("Suma impares = " + sumaI);
                }
                case 25 -> {
                    int suma=0;
                    for(int i=1;i<=100;i++) suma += i*i;
                    System.out.println("Suma cuadrados = " + suma);
                }
                case 26 -> {
                    System.out.print("Ingrese N: ");
                    int n = sc.nextInt();
                    long fact = 1;
                    for(int i=1;i<=n;i++) fact *= i;
                    System.out.println(n+"! = " + fact);
                }
                case 27 -> {
                    int max=Integer.MIN_VALUE;
                    for(int i=1;i<=10;i++){
                        System.out.print("Número " + i + ": ");
                        int num = sc.nextInt();
                        if(num>max) max=num;
                    }
                    System.out.println("Máximo = " + max);
                }
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
}
