import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // ABSTRAÇÃO: Criamos instâncias baseadas nos moldes (classes)
        SuperHeroi h1 = new SuperHeroi("Lisiane Reips", 1.75, Sexo.MULHER,"Super Prof", true, Arrays.asList("super força", "voar", "teleporte"));
        SuperHeroi h2 = new SuperHeroi("Bruce Wayne", 1.88, Sexo.HOMEM,"Batman", true, Arrays.asList("artes marciais", "dinheiro"));
        Vilao v1 = new Vilao("Gritten Malfoy", Sexo.OUTRO, 1.90, 9);
        Vilao v2 = new Vilao("Coringa", Sexo.HOMEM, 1.85, 10);
        Civil c1 = new Civil("Mateus NPC", Sexo.HOMEM, 1.80, "VibeCoder");
        Civil c2 = new Civil("Lois Lane", Sexo.MULHER, 1.70, "Jornalista");

        Batalha batalha = new Batalha();
        batalha.adicionar(h1);
        batalha.adicionar(h2);
        batalha.adicionar(v1);
        batalha.adicionar(v2);
        batalha.adicionar(c1);
        batalha.adicionar(c2);
        
        // Testando recusa de null e duplicados
        batalha.adicionar(h1); 
        batalha.adicionar(null); 

        batalha.iniciar();

        System.out.println("\n🛡️  --- HERÓIS ATUAIS NA BATALHA --- 🛡️");
        List<SuperHeroi> herois = batalha.listarHerois();
        for (SuperHeroi h : herois) {
            System.out.println("  🔹 " + h.getNomeDeGuerra());
        }

        Personagem alto = batalha.maisAlto();
        System.out.println("\n📏 MAIS ALTO DA BATALHA: " + alto.getNome() + " (" + alto.getAltura() + "m)");

        System.out.println("\n💥 Acontecimentos da Batalha...");
        batalha.removerDerrotado("Batman");

        System.out.println("\n🛡️  --- HERÓIS RESTANTES NA BATALHA --- 🛡️");
        for (SuperHeroi h : batalha.listarHerois()) {
            System.out.println("  🔹 " + h.getNomeDeGuerra());
        }
    }
}