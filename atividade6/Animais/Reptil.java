package atividade6.Animais;

public class Reptil extends Animal{
    private String tipoDeEscama;
    private String TrocarDePele;

    public Reptil(String especie, Double peso, Double tamanho, String tipoDeEscama, String TrocarDePele) {
        this.especie = especie;
        this.peso = peso;
        this.tamanho = tamanho;
        this.tipoDeEscama = tipoDeEscama;
        this.TrocarDePele = TrocarDePele;
    }

    public String getTipoDeEscama() {
        return this.tipoDeEscama;
    }

    public void setTipoDeEscama(String tipoDeEscama) {
        this.tipoDeEscama = tipoDeEscama;
    }

    public String getTrocarDePele() {
        return this.TrocarDePele;
    }

    public void setTrocarDePele(String TrocarDePele) {
        this.TrocarDePele = TrocarDePele;
    }

    @Override
    public String toString() {
        return "{" +
            " tipoDeEscama='" + getTipoDeEscama() + "'" +
            ", TrocarDePele='" + getTrocarDePele() + "'" +
            ", especie='" + getEspecie() + "'" +
            ", peso='" + getPeso() + "'" +
            ", tamanho='" + getTamanho() + "'" +
            "}";
    }
}
