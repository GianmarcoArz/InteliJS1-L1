import java.util.Scanner;

public class Moltiplicazione {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Inserisci il primo numero intero: ");
        int numero1 = scanner.nextInt();


        System.out.print("Inserisci il secondo numero intero: ");
        int numero2 = scanner.nextInt();


        int prodotto = moltiplica(numero1, numero2);


        System.out.println("Il prodotto di " + numero1 + " e " + numero2 + " è: " + prodotto);

        scanner.close();
    }


    public static int moltiplica(int a, int b) {
        return a * b;
    }
}