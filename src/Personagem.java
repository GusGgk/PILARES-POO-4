import java.util.ArrayList;
import java.util.List;

public abstract class Personagem {
    private String nome;
    private Sexo sexo;
    private double altura;
    private boolean identidadeSecreta;
    private List<String> habilidades;


    public Personagem(String nome, double altura, Sexo sexo, boolean identidadeSecreta, List habilidades){

        if (nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("O nome do personagem deve ser preenchido");
        }
        if (altura < 0.5 || altura > 3.0){
            throw new IllegalArgumentException("A altura do personagem deve ser realista");
        }

        this.nome = nome;
        this.altura = altura;
        this.sexo = sexo;
        this.identidadeSecreta = identidadeSecreta;
        this.habilidades = habilidades;



    }

    public void getIdentidadeSecreta(){
        if ( this.identidadeSecreta == true){
            revelarIdentidade("??? (identidade protegida)");
        } else {
            revelarIdentidade(this.nome);
        }
    }

    public void revelarIdentidade(String mensagem){
        System.out.println(mensagem);
    }

    public abstract String apresentar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
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
        this.habilidades = habilidades;
    }
}
