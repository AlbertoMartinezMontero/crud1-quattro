package it.iad2.eserciziocrud;

public class Prodotto {

    private String codice;
    private String descrizione;

    public Prodotto(String codice, String descrizione) {
        this.codice = codice;
        this.descrizione = descrizione;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    @Override
    public String toString() {
        return "Prodotto{" + "codice=" + codice + ", descrizione=" + descrizione + '}';
    }

}
