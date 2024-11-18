import java.util.Scanner;

public class ConcatenazioneStringhe {
    public static void main(String[] args) {
        // Creiamo uno Scanner per leggere l'input da tastiera
        Scanner scanner = new Scanner(System.in);

        // Chiediamo all'utente di inserire tre stringhe
        System.out.print("Inserisci la prima stringa: ");
        String primaStringa = scanner.nextLine();

        System.out.print("Inserisci la seconda stringa: ");
        String secondaStringa = scanner.nextLine();

        System.out.print("Inserisci la terza stringa: ");
        String terzaStringa = scanner.nextLine();

        // Concatenazione in ordine di inserimento
        String concatenazioneOrdine = primaStringa + secondaStringa + terzaStringa;
        System.out.println("Concatenazione in ordine di inserimento: " + concatenazioneOrdine);

        // Concatenazione in ordine inverso
        String concatenazioneInverso = terzaStringa + secondaStringa + primaStringa;
        System.out.println("Concatenazione in ordine inverso: " + concatenazioneInverso);

        // Chiudiamo lo Scanner
        scanner.close();
    }
}
