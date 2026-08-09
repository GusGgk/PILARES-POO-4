import java.util.ArrayList;
import java.util.List;


public class SuperHeroi extends Personagem {
    private String nomeDeGuerra;
    private boolean identidadeSecreta;
    private List<String> habilidades;

    public SuperHeroi(String nome, double altura, Sexo sexo,String nomeDeGuerra, boolean identidadeSecreta, List<String> habilidades){

        super(nome, sexo, altura);
        this.nomeDeGuerra = nomeDeGuerra;
        this.identidadeSecreta = identidadeSecreta;
        this.habilidades = new ArrayList<>(habilidades);
    }

    @Override
    public String apresentar() {
        return "Eu sou o herói " + nomeDeGuerra
                + ", tenho " + getAltura() + "m"
                + " e minhas habilidades são " + habilidades + " Meu nome de verdade é: " + getNome() + " e meu gênero: " + getSexo()   ;
    }

    @Override
    public void agir() {
        usarHabilidade();
    }

    public void usarHabilidade() {
        if (!habilidades.isEmpty()) {
            System.out.println(nomeDeGuerra + " usou a habilidade: " + habilidades.get(0));
        } else {
            System.out.println(nomeDeGuerra + " não possui habilidades para usar!");
        }
    }

    public void usarHabilidade(int indice) {
        if (indice >= 0 && indice < habilidades.size()) {
            System.out.println(nomeDeGuerra + " usou a habilidade: " + habilidades.get(indice));
        } else {
            System.out.println(nomeDeGuerra + " tentou usar uma habilidade em um índice inválido (" + indice + ")!");
        }
    }

    public void usarHabilidade(String nome) {
        if (habilidades.contains(nome)) {
            System.out.println(nomeDeGuerra + " usou a habilidade: " + nome);
        } else {
            System.out.println(nomeDeGuerra + " tentou usar a habilidade " + nome + " mas não a possui!");
        }
    }

    public void getIdentidadeSecreta(){
        if ( this.identidadeSecreta == true){
            revelarIdentidade("??? (identidade protegida)");
        } else {
            revelarIdentidade(getNome());
        }
    }public void revelarIdentidade(String mensagem){System.out.println(mensagem);}

    public String getNomeDeGuerra() {
        return nomeDeGuerra;
    }

    public void setNomeDeGuerra(String nomeDeGuerra) {
        this.nomeDeGuerra = nomeDeGuerra;
    }

    public boolean isIdentidadeSecreta() {
        return identidadeSecreta;
    }

    public void setIdentidadeSecreta(boolean identidadeSecreta) {
        this.identidadeSecreta = identidadeSecreta;
    }

    public List<String> getHabilidades() {
        return new ArrayList<>(this.habilidades);
    }

    public void setHabilidades(List<String> habilidades) {

        this.habilidades = new ArrayList<>(habilidades);
    }


}