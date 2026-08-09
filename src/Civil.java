public class Civil extends Personagem{

    private String profissao;

    public Civil(String nome, Sexo sexo, double altura, String profissao) {
        super(nome, sexo, altura);
        this.profissao = profissao;
    }

    @Override
    public String apresentar() {
        return "Meu nome é " + getNome()
                + " e minha profissão é "
                + profissao + ".";
    }

    @Override
    public void agir() {
        System.out.println(getNome() + " pede socorro desesperadamente!");
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
