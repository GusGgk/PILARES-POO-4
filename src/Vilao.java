public class Vilao extends Personagem {

    private int nivelDeAmeaca;

    public Vilao(String nome, Sexo sexo, double altura, int nivelDeAmeaca) {

        super(nome, sexo, altura);
        if (nivelDeAmeaca < 1 || nivelDeAmeaca > 10) {
            throw new IllegalArgumentException(
                    "O nível de ameaça deve estar entre 1 e 10"
            );
        }

        this.nivelDeAmeaca = nivelDeAmeaca;
    }

    @Override
    public String apresentar() {
        return "Eu sou o vilão " + getNome()
                + " e minha altura é de "+getAltura()+"m e meu gênero é:" + getSexo() + " e meu nível de ameaça é "
                + nivelDeAmeaca + ".";
    }

    public int getNivelDeAmeaca() {
        return nivelDeAmeaca;
    }

    public void setNivelDeAmeaca(int nivelDeAmeaca) {

        if (nivelDeAmeaca < 1 || nivelDeAmeaca > 10) {
            throw new IllegalArgumentException(
                    "O nível de ameaça deve estar entre 1 e 10"
            );
        }

        this.nivelDeAmeaca = nivelDeAmeaca;
    }
}