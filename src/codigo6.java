
import java.util.Scanner;

public class codigo6 {
    public static void main(String[] args) {
        int[] n = new int[20];

        for (int i = 0; i < 20; i++) {
            n[i] = (int)(Math.random() * 381) + 20;
            System.out.print(n[i] + " ");
        }//for

        System.out.println("\n¿Qué números se van a resaltar?");
        System.out.print("(1 – múltiplos de 5, 2 – múltiplos de 7): ");
        
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        int multiplo = (opcion == 1) ? 5 : 7;

        for (int e : n) {
            if (e % multiplo == 0) {
                System.out.print("[" + e + "] ");
            } else {
                System.out.print(e + " ");
            }//else
        }//for

        scanner.close();
    }//main
}//class codigo6