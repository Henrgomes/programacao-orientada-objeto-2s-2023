package atividade6.Animais;

public class Ave extends Animal{
    private String formatoDoBico;
    private String trocarDePena;

    public Ave(String especie, Double peso, Double tamanho, String formatoDoBico, String trocarDePena) {
        this.especie = especie;
        this.peso = peso;
        this.tamanho = tamanho;
        this.formatoDoBico = formatoDoBico;
        this.trocarDePena = trocarDePena;
    }

    public String getFormatoDoBico() {
        return this.formatoDoBico;
    }

    public void setFormatoDoBico(String formatoDoBico) {
        this.formatoDoBico = formatoDoBico;
    }

    public String getTrocarDePena() {
        return this.trocarDePena;
    }

    public void setTrocarDePena(String trocarDePena) {
        this.trocarDePena = trocarDePena;
    }

    @Override
    public String toString() {
        return "{" +
            " formatoDoBico='" + getFormatoDoBico() + "'" +
            ", trocarDePena='" + getTrocarDePena() + "'" +
            ", especie='" + getEspecie() + "'" +
            ", peso='" + getPeso() + "'" +
            ", tamanho='" + getTamanho() + "'" +
            "}";
    }
}
