import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SuperHeroi h = new SuperHeroi("Lisiane Reips", 1.75, Sexo.MULHER, true, Arrays.asList(
                "super força",
                "voar",
                "teleporte"
        ));

        h.mostrar();
        h.getIdentidadeSecreta();

        System.out.println("Habilidades originais:");
        System.out.println(h.getHabilidades());

        // Obtém uma cópia da lista
        List<String> copia = h.getHabilidades();

        // Altera apenas a cópia
        copia.add("teletransporte");
        copia.remove("voar");

        System.out.println("\nLista modificada (cópia):");
        System.out.println(copia);

        System.out.println("\nLista do objeto:");
        System.out.println(h.getHabilidades());




    }
}