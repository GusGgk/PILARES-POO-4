import java.util.ArrayList;
import java.util.List;

public class Batalha {

    private List<Personagem> participantes;

    public Batalha() {
        this.participantes = new ArrayList<>();
    }

    public void adicionar(Personagem p) {
        if (p != null && !participantes.contains(p)) {
            participantes.add(p);
        } else {
            System.out.println("[AVISO] Não é possível adicionar: personagem nulo ou já existente na batalha.");
        }
    }

    public void iniciar() {
        System.out.println("\n⚔️ ================= BATALHA INICIADA ================= ⚔️");
        for (Personagem p : participantes) {
            p.agir(); 
        }
        System.out.println("⚔️ ==================================================== ⚔️\n");
    }

    public List<SuperHeroi> listarHerois() {
        List<SuperHeroi> herois = new ArrayList<>();
        for (Personagem p : participantes) {
            if (p instanceof SuperHeroi) {
                herois.add((SuperHeroi) p);
            }
        }
        return herois;
    }

    public Personagem maisAlto() {
        if (participantes.isEmpty()) {
            return null;
        }
        Personagem maisAlto = participantes.get(0);
        for (Personagem p : participantes) {
            if (p.getAltura() > maisAlto.getAltura()) {
                maisAlto = p;
            }
        }
        return maisAlto;
    }

    public void removerDerrotado(String nomeDeGuerra) {
        Personagem aRemover = null;
        for (Personagem p : participantes) {
            if (p instanceof SuperHeroi) {
                SuperHeroi h = (SuperHeroi) p;
                if (h.getNomeDeGuerra().equalsIgnoreCase(nomeDeGuerra)) {
                    aRemover = p;
                    break;
                }
            }
        }
        if (aRemover != null) {
            participantes.remove(aRemover);
            System.out.println("❌ [DERROTA] O herói " + nomeDeGuerra + " foi superado e removido da batalha!");
        } else {
            System.out.println("⚠️ [ERRO] Herói com nome de guerra '" + nomeDeGuerra + "' não foi encontrado na batalha.");
        }
    }
}
