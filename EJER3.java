import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar && sc.hasNextLine()) {
            String texto = sc.nextLine();

            if (!sc.hasNextInt()) {
                continuar = false;
            } else {
                int n = sc.nextInt();
                sc.nextLine(); // consumir salto de línea

                if (n == 0) {
                    continuar = false;
                } else {
                    for (int k = 0; k < n; k++) {
                        if (sc.hasNextInt()) {
                            int i = sc.nextInt();
                            if (sc.hasNextInt()) {
                                int j = sc.nextInt();
                                sc.nextLine(); // salto de línea

                                int min = Math.min(i, j);
                                int max = Math.max(i, j);
                                char c = texto.charAt(min);
                                boolean iguales = true;

                                int idx = min + 1;
                                while (idx <= max && iguales) {
                                    if (texto.charAt(idx) != c) {
                                        iguales = false;
                                    }
                                    idx++;
                                }
                                System.out.println(iguales ? "SI" : "NO");
                            }
                        }
                    }
                    System.out.println(); // línea en blanco
                }
            }
        }
        sc.close();
    }
}
