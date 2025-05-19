public class Targa {

    String numero;

    public Targa(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "numero = " + numero;
    }

    @Override
    public boolean equals(Object o){
        if (o instanceof Targa){
            Targa t = (Targa) o;
            return numero.equalsIgnoreCase(t.numero);
        }
        return false;
    }

    public int hashCode(){
        return numero.hashCode();
    }

}
