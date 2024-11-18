public class Esercizio1 {

    // Metodo 1: Moltiplicazione
    public static int moltiplicazione(int a, int b) {
        return a * b;
    }

    // Metodo 2: Concatena
    public static String concatena(String s, int n) {
        return s + n;
    }

    // Metodo 3: Inserisci in array
    public static String[] inserisciInArray(String[] array, String elemento) {
        if (array.length != 5) {
            throw new IllegalArgumentException("L'array deve contenere esattamente 5 elementi.");
        }

        String[] nuovoArray = new String[6];
        nuovoArray[0] = array[0];
        nuovoArray[1] = array[1];
        nuovoArray[2] = elemento;
        nuovoArray[3] = array[2];
        nuovoArray[4] = array[3];
        nuovoArray[5] = array[4];

        return nuovoArray;
    }

    public static void main(String[] args) {
        // Test del metodo moltiplicazione
        int a = 5;
        int b = 3;
        int prodotto = moltiplicazione(a, b);
        System.out.println("Il prodotto di " + a + " e " + b + " è: " + prodotto);

        // Test del metodo concatena
        String stringa = "Numero: ";
        int numero = 10;
        String risultatoConcatena = concatena(stringa, numero);
        System.out.println("Risultato della concatenazione: " + risultatoConcatena);

        // Test del metodo inserisci in array
        String[] arrayOriginale = {"Stringa1", "Stringa2", "Stringa3", "Stringa4", "Stringa5"};
        String nuovaStringa = "NuovaStringa";
        String[] nuovoArray = inserisciInArray(arrayOriginale, nuovaStringa);

        System.out.println("Nuovo array:");
        for (String str : nuovoArray) {
            System.out.println(str);
        }
    }
}
