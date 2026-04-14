
/**
 *
 * @author Karen Daniela Ramirez
 */
public class recursividad {

    // 1. Leer un numero entero y n calcular la factorial de dicho número.
    public static int calcularFactorial(int numeroAFactorizar) {
        if (numeroAFactorizar == 0) {
            return 1;
        }
        return numeroAFactorizar * calcularFactorial(numeroAFactorizar - 1);
    }

    // 2. Leer  un número entero y  calcular la sumatoria hasta el  numero leído.
    public static int calcularSumatoria(int numeroASumar) {
        if (numeroASumar == 0) {
            return 0;
        }
        return (numeroASumar % 10) + calcularSumatoria(numeroASumar / 10);
    }

    // 3. Leer un valor entero y calcular la sumatoria  1 + ½ +1/3+  … 1/n.
    public static double calcularSumatoriaFracciones(int numeroASumarFraccion) {
        if (numeroASumarFraccion == 1) {
            return 1;
        }
        return (1.0 / numeroASumarFraccion) + calcularSumatoriaFracciones(numeroASumarFraccion - 1);
    }

    // 4. Leer un número entero e invertirlo. Ejemplo: Entrada: 123 Salida: 321.
    public static int invertirNumero(int numeroAInvertir, int invertido) {
        if (numeroAInvertir == 0) {
            return invertido;
        }
        return invertirNumero(numeroAInvertir / 10, invertido * 10 + (numeroAInvertir % 10));
    }

    // 5. Leer un número y sumar los dígitos de un número. Ejemplo: Entrada: 123 Resultado: 6.
    public static int sumatoriaDigitos(int digitosASumar) {
        if (digitosASumar < 1) {
            return 0;
        }
        return (digitosASumar % 10) + sumatoriaDigitos(digitosASumar / 10);
    }

    // 6. Leer un número llamado base y otro exponente y calcular la potencia elevando la base al exponente.
    public static int calcularPotencia(int numeroBase, int numeroExponente) {
        if (numeroExponente == 0) {
            return 1;
        }
        return numeroBase * calcularPotencia(numeroBase, numeroExponente - 1);
    }

    /* 7. Leer dos números enteros y calcular el máximo común divisor (M.C.D.) utilizando el algoritmo de 
    Euclides.
    MCD = M si N = 0
    MCD = MCD(N, M % N) si N <> 0*/
    public static int calcularMaximoComunDivisor(int primerNumero, int segundoNumero) {
        if (segundoNumero == 0) {
            return primerNumero;
        }
        return calcularMaximoComunDivisor(segundoNumero, primerNumero % segundoNumero);
    }

    // 8. Leer 2 números enteros y calcular el cociente de la división entera (usar restas sucesivas).
    public static int calcularCociente(int dividendo, int divisor) {
        if (dividendo < divisor) {
            return 0;
        }
        return 1 + calcularCociente(dividendo - divisor, divisor);
    }

    // 9. Leer 2 números enteros y realizar la multiplicación mediante sumas sucesivas.
    public static int multiplicacion(int primerNumero, int segundoNumero) {
        if (segundoNumero == 0) {
            return 0;
        }
        return primerNumero + multiplicacion(primerNumero, segundoNumero - 1);
    }

    // 10. Leer n valores enteros, almacenarlos en un arreglo y realizar la suma de los elementos del vector.
    public static int sumaDeArreglo(int[] arreglo, int tamaño) {
        if (tamaño == 0) {
            return 0;
        }
        return arreglo[tamaño - 1] + sumaDeArreglo(arreglo, tamaño - 1);
    }

    // 11. Crear una matriz de tamaño m x n y sumar los elementos de la matriz.
    public static int sumaDeMatriz(int[][] matriz, int fila, int columna) {
        if (fila == 0 && columna == 0) {
            return matriz[0][0];
        }
        if (columna == 0) {
            return matriz[fila][columna]
                    + sumaDeMatriz(matriz, fila - 1, matriz[0].length - 1);
        }
        return matriz[fila][columna]
                + sumaDeMatriz(matriz, fila, columna - 1);
    }

    // 12. Serie de Fibonacci:
    // Fib(1) = 1 ; Fib(0) = 0
    // Fib(n) = Fib(n-1) + Fib(n-2) si n >= 2.
    // Imprimir la serie hasta el límite dado.
    public static int serieFibonacci(int numero) {
        if (numero == 0) {
            return 0;
        }
        if (numero == 1) {
            return 1;
        }
        return serieFibonacci(numero - 1) + serieFibonacci(numero - 2);
    }

    // 13. Función de Ackermann:
    // Ackermann(m, n) = n + 1 si m = 0
    // Ackermann(m, n) = Ackermann(m - 1, 1) si m > 0 y n = 0
    // Ackermann(m, n) = Ackermann(m - 1, Ackermann(m, n - 1)) si m > 0 y n > 0
    public static int funcionAckermann(int nivelRecursion, int valorEntrada) {
        if (nivelRecursion == 0) {
            return valorEntrada + 1;
        }
        if (nivelRecursion > 0 && valorEntrada == 0) {
            return funcionAckermann(nivelRecursion - 1, 1);
        }
        return funcionAckermann(nivelRecursion - 1, funcionAckermann(nivelRecursion, valorEntrada - 1)
        );
    }

}
