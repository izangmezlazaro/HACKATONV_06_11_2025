import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // DECLARAR VARIABLES
        // SIMPLES
        int numero1, numero2;
        int acarreo = 0;  // Contador global de acarreos
        int suma;
        // COMPLEJO
        Scanner leer = new Scanner(System.in);

        // INICIO PREGUNTANDO EL NUMERO DE SUMAS QUE QUIERE
        System.out.println("Cuantas sumas quieres realizar?");
        int dato = leer.nextInt();

        // BUCLE PARA SUMAR LAS DOS CIFRAS
        for (int i = 0; i < dato; i++) {
            System.out.println("Introduce el número que quieras sumar");
            numero1 = leer.nextInt();
            System.out.println("Introduce el número que quieres que sea sumado");
            numero2 = leer.nextInt();

            // VARIABLES PARA ACARREOS
            int acarreoLocal = 0;
            int contador = 0;
            int cifra1, cifra2;

            // LEER DE DCHA A IZQDA
            while (numero1 > 0 || numero2 > 0) {
                // SACAMOS ULTIMO DIGITO
                cifra1 = numero1 % 10;
                cifra2 = numero2 % 10;

                // SUMA DE NUMEROS MAS ACARREO ANTERIOR
                suma = cifra1 + cifra2 + acarreoLocal;

                // GENERAMOS UN CASO PARA CONTADOR
                if (suma >= 10) {
                    acarreoLocal = 1;
                    contador++;
                } else {
                    acarreoLocal = 0;
                }


                //PONEMOS 0 PARA TERMINAR
                numero1 /= 10;
                numero2 /= 10;
            }
            System.out.println("El número de acarreos al sumar " + " es : " + contador);


        }
    }
}
