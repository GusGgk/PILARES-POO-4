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

        List<Personagem> personagens = Arrays.asList(h, v, c);

        for (Personagem p : personagens) {
            System.out.println(p.apresentar());
            p.agir();
            System.out.println("Detalhes: " + p.toString());
            System.out.println("----------------");
        }

        System.out.println("Testando sobrecarga de habilidades (Super-Herói):");
        h.usarHabilidade();
        h.usarHabilidade(2);
        h.usarHabilidade(10); // Índice inválido
        h.usarHabilidade("voar");
        h.usarHabilidade("ficar invisível"); // Habilidade não existente
        
        System.out.println("----------------");
        System.out.println("Identidade do héroi:");
        h.getIdentidadeSecreta();






    }
}