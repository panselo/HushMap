public class Proprietario {

    private String nome;
    private String cognome;
    private String codiceFiscale;

    public Proprietario(String nome, String cognome, String codiceFiscale) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
    }

    public String toString(){
        return "nome = " + nome + ", codice fiscale = " + codiceFiscale;
    }

}
