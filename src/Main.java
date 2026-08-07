import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SuperHeroi h = new SuperHeroi("Lisiane Reips", 1.75, Sexo.MULHER,"Super Prof", true, Arrays.asList(
                "super força",
                "voar",
                "teleporte"
        ));

        Vilao v = new Vilao("Gritten Malfoy", Sexo.OUTRO, 1.90, 9);
        Civil c = new Civil("Mateus NPC", Sexo.HOMEM, 1.80, "VibeCoder");

        System.out.println(h.apresentar());
        System.out.println(v.apresentar());
        System.out.println(c.apresentar());

        System.out.println("----------------");
        System.out.println("Identidade do héroi:");
        h.getIdentidadeSecreta();






    }
}