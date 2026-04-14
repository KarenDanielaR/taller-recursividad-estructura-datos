
import java.util.Scanner;

/**
 *
 * @author Karen Daniela Ramirez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingresarDatos = new Scanner(System.in);
        recursividad recursividad = new recursividad();

        //Ejercicio 1
        System.out.println("EJERCICIO 1");
        System.out.println("Ingrese un numero entero para calcular su factorial");
        int numeroAFactorizar = ingresarDatos.nextInt();
        int resultadoFactorial = recursividad.calcularFactorial(numeroAFactorizar);
        System.out.println("El resultado factorial es: " + resultadoFactorial);

        //Ejercicio 2
        System.out.println("\nEJERCICIO 2");
        System.out.println("Ingrese un numero entero para sumar sus Digitos");
        int numeroASumar = ingresarDatos.nextInt();
        int resultadoSumaDigitos = recursividad.calcularSumatoria(numeroASumar);
        System.out.println("El resultado de la suma de digitos es: " + resultadoSumaDigitos);

        //Ejercicio 3
        System.out.println("\nEJERCICIO 3");
        System.out.println("Ingrese un numero entero para calcular en Fracciones: ");
        int numeroASumarFraccion = ingresarDatos.nextInt();
        double resultadoSumaFraccion = recursividad.calcularSumatoriaFracciones(numeroASumarFraccion);
        System.out.println("El resultado de la sumatoria es: " + resultadoSumaFraccion);

        //Ejercicio 4
        System.out.println("\nEJERCICIO 4");
        System.out.println("Ingrese un numero entero para invertir sus Digitos");
        int numeroAInvertir = ingresarDatos.nextInt();
        int resultadoNumeroInveritido = recursividad.invertirNumero(numeroAInvertir, 0);
        System.out.println("El resultado del numero invertido es: " + resultadoNumeroInveritido);

        //Ejercicio 5
        System.out.println("\nEJERCICIO 5");
        System.out.println("Ingrese un numero entero para sumar sus Digitos");
        int digitosASumar = ingresarDatos.nextInt();
        int resultadoDumatoriaDigitos = recursividad.sumatoriaDigitos(digitosASumar);
        System.out.println("El resultado de sus digitos es: " + resultadoDumatoriaDigitos);

        //Ejercicio 6
        System.out.println("\nEJERCICIO 6");
        System.out.println("Ingrese dos numero entero para calcular su potencia");
        System.out.println("Numero de la Base");
        int numeroBase = ingresarDatos.nextInt();
        System.out.println("Numero del exponente");
        int numeroExponente = ingresarDatos.nextInt();
        int resultadoCalcularPotencia = recursividad.calcularPotencia(numeroBase, numeroExponente);
        System.out.println("El resultado de la potencia es: " + resultadoCalcularPotencia);

        //Ejercicio 7
        System.out.println("\nEJERCICIO 7");
        System.out.println("Ingrese dos numero entero para calcular calcular el maximo comun divisor (M.C.D.)");
        int primerNumero = ingresarDatos.nextInt();
        int segundoNumero = ingresarDatos.nextInt();
        int resultadoCalcularMCD = recursividad.calcularMaximoComunDivisor(primerNumero, segundoNumero);
        System.out.println("El resultado del MCD es: " + resultadoCalcularMCD);

        //Ejercicio 8
        System.out.println("\nEJERCICIO 8");
        System.out.println("Ingrese dos numeros enteros para calcular el cociente de una division entera");
        System.out.println("Dividendo");
        int dividendo = ingresarDatos.nextInt();
        System.out.println("Divisor");
        int divisor = ingresarDatos.nextInt();
        int resultadoDivision = recursividad.calcularCociente(dividendo, divisor);
        System.out.println("El resultado del cociente es: " + resultadoDivision);

        //Ejercicio 9
        System.out.println("\nEJERCICIO 9");
        System.out.println("Ingrese dos numeros enteros para multiplicar");
        int numeroUno = ingresarDatos.nextInt();
        int numeroDos = ingresarDatos.nextInt();
        int resultadoMultiplicacion = recursividad.multiplicacion(numeroUno, numeroDos);
        System.out.println("El resultado de la multiplicacion es: " + resultadoMultiplicacion);

        //Ejercicio 10
        System.out.println("\nEJERCICIO 10");
        System.out.println("Ingrese la cantidad de elementos del arreglo");
        int tamañoArreglo = ingresarDatos.nextInt();
        int[] arreglo = new int[tamañoArreglo];

        for (int i = 0; i < tamañoArreglo; i++) {
            System.out.println("Ingrese el elemento en la posicion: " + i);
            arreglo[i] = ingresarDatos.nextInt();
        }
        int resultadoSumaArreglo = recursividad.sumaDeArreglo(arreglo, tamañoArreglo);
        System.out.println("La suma del arreglo es: " + resultadoSumaArreglo);

        //Ejercicio 11
        System.out.println("\nEJERCICIO 11");
        System.out.println("Ingrese el numero de filas de la matriz");
        int filas = ingresarDatos.nextInt();
        System.out.println("Ingrese el numero de columnas de la matriz");
        int columnas = ingresarDatos.nextInt();
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Ingrese el elemento en la posicion [" + i + "][" + j + "]");
                matriz[i][j] = ingresarDatos.nextInt();
            }
        }
        int resultadoSumaMatriz = recursividad.sumaDeMatriz(matriz, filas - 1, columnas - 1);
        System.out.println("La suma de la matriz es: " + resultadoSumaMatriz);

        //Ejercicio 12
        System.out.println("\nEJERCICIO 12");
        System.out.println("Ingrese el limite de la serie de Fibonacci");
        int limiteFibonacci = ingresarDatos.nextInt();
        System.out.println("Serie de Fibonacci:");
        for (int i = 0; i <= limiteFibonacci; i++) {
            System.out.print(recursividad.serieFibonacci(i) + " ");
        }
        System.out.println();

        //Ejercicio 13
        System.out.println("\nEJERCICIO 13");
        System.out.println("Ingrese los valores nivel de Recursion y valor de Entrada para la funcion de Ackermann");
        System.out.println("Nivel de Recursion");
        int nivelRecursion = ingresarDatos.nextInt();
        System.out.println("Valor de Entrada");
        int valorEntrada = ingresarDatos.nextInt();
        if (nivelRecursion > 3) {
            System.out.println("Error: valores muy grandes provocan desbordamiento de pila");
        } else {
            int resultadoAckermann = recursividad.funcionAckermann(nivelRecursion, valorEntrada);
            System.out.println("El resultado de Ackermann es: " + resultadoAckermann);
        }

    }

}
