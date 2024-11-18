import java.util.Scanner;

public class Calcolatore {

    // Metodo per calcolare il perimetro di un rettangolo
    public static double perimetroRettangolo(double lato1, double lato2) {
        return 2 * (lato1 + lato2);
    }

    // Metodo per determinare se un numero è pari o dispari
    public static int pariDispari(int numero) {
        return (numero % 2 == 0) ? 0 : 1;
    }

    // Metodo per calcolare l'area di un triangolo usando la formula di Erone
    public static double areaTriangolo(double a, double b, double c) {
        double s = (a + b + c) / 2; // semiperimetro
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // formula di Erone
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Calcolare il perimetro del rettangolo
        System.out.println("Calcolo del perimetro di un rettangolo:");
        System.out.print("Inserisci la lunghezza del primo lato: ");
        double lato1 = scanner.nextDouble();
        System.out.print("Inserisci la lunghezza del secondo lato: ");
        double lato2 = scanner.nextDouble();
        double perimetro = perimetroRettangolo(lato1, lato2);
        System.out.println("Il perimetro del rettangolo è: " + perimetro);

        // Verificare se un numero è pari o dispari
        System.out.println("Controllo pari e dispari:");
        System.out.print("Inserisci un numero intero: ");
        int numero = scanner.nextInt();
        int risultatoPariDispari = pariDispari(numero);
        System.out.println("Il numero " + numero + " è " + (risultatoPariDispari == 0 ? "pari" : "dispari") + ".");

        // Calcolare l'area del triangolo
        System.out.println("Calcolo dell'area di un triangolo:");
        System.out.print("Inserisci la lunghezza del primo lato: ");
        double a = scanner.nextDouble();
        System.out.print("Inserisci la lunghezza del secondo lato: ");
        double b = scanner.nextDouble();
        System.out.print("Inserisci la lunghezza del terzo lato: ");
        double c = scanner.nextDouble();
        double area = areaTriangolo(a, b, c);
        System.out.println("L'area del triangolo è: " + area);

        scanner.close();
    }
}
