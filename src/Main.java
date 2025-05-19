import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Targa, Proprietario> hm1 = new HashMap<>();
        Targa t1 = new Targa("GP459YJ");
        Targa t2 = new Targa("HP627JF");
        Targa t3 = new Targa("ROCCHISEBY");
        hm1.put(t1, new Proprietario("Carlo", "Piacentini", "JBNPG80A01H501Z"));
        hm1.put(t2, new Proprietario("Denis", "Fanpage", "JHTSF67A03H792S"));
        hm1.put(t3, new Proprietario("Sebastiano", "Rocchiele", "SGDTE45A79H235D"));

    }
}