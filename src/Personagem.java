

public abstract class Personagem {
    private String nome;
    private Sexo sexo;
    private double altura;

    public Personagem(String nome, Sexo sexo, double altura) {

        if(nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome precisa ser preenchido");
        }
        if(altura < 0.5 || altura > 3.0){
            throw new IllegalArgumentException("A altura deve ser maior que 0.5 e menor que 3.0 metros");
        }
        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;
    }

    public abstract String apresentar();

    public abstract void agir();

    @Override
    public String toString() {
        return "Personagem [nome=" + nome + ", sexo=" + sexo + ", altura=" + altura + "]";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome precisa ser preenchido");
        }
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
        if (altura < 0.5 || altura > 3.0) {
            throw new IllegalArgumentException(
                    "A altura deve estar entre 0.5 e 3.0 metros"
            );
        }
        this.altura = altura;
    }
}
