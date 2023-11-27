package atividade6;

import atividade6.Animais.Animal;
import atividade6.Animais.Ave;
import atividade6.Animais.Mamifero;
import atividade6.Animais.Reptil;

public class Executavel {
    public static void main(String[] args) {
        Ave ave1 = new Ave("Calopsita", 13.0, 20.5, "Curvo", "sim");
        Mamifero mam1 = new Mamifero("Cachorro", 3800.500, 60.0, "sim");
        Reptil rep1 = new Reptil("Cobra", 5000.00, 300.00, "Retangular", "sim");

        ImprimirAnimal(ave1);
        ImprimirAnimal(mam1);
        ImprimirAnimal(rep1);
    }

    public static void ImprimirAnimal(Animal a){
        System.out.println(a);
    }
}
