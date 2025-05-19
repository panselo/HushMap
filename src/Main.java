import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Targa, Proprietario> registro = new HashMap<>();

        registro.put(new Targa("AB123CD"), new Proprietario("Mario", "Rossi", "RSSMRA80A01H501Z"));
        registro.put(new Targa("EF456GH"), new Proprietario("Luigi", "Bianchi", "BNCGLG85B02H501Y"));
        registro.put(new Targa("IJ789KL"), new Proprietario("Anna", "Verdi", "VRDANN90C03H501X"));

        registro.put(new Targa("AB123CD"), new Proprietario("Giulia", "Neri", "NRIGLL95D04H501W"));

        System.out.println("Contenuto del registro:");
        registro.forEach((targa, proprietario) -> System.out.println(targa + " → " + proprietario));

        System.out.println("\nNota: Quando è stata inserita una targa duplicata (AB123CD), il proprietario precedente è stato sovrascritto.");
    }
}