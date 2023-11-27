package atividade6.Animais;

public class Mamifero extends Animal{
    private String amamentado;


    public Mamifero(String especie, Double peso, Double tamanho, String amamentado) {
        this.especie = especie;
        this.peso = peso;
        this.tamanho = tamanho;
        this.amamentado = amamentado;
    }

    public String isAmamentado() {
        return this.amamentado;
    }

    public String getAmamentado() {
        return this.amamentado;
    }

    public void setAmamentado(String amamentado) {
        this.amamentado = amamentado;
    }

    @Override
    public String toString() {
        return "{" +
            " amamentado='" + isAmamentado() + "'" +
            ", especie='" + getEspecie() + "'" +
            ", peso='" + getPeso() + "'" +
            ", tamanho='" + getTamanho() + "'" +
            "}";
    }
}
