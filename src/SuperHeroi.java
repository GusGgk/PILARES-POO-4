// NÃO ALTERE ANTES DE LER OS PASSOS
public class SuperHeroi {
    private String nome;
    private Sexo sexo;
    private double altura;
    private boolean identidadeSecreta;
    private String[] habilidades;

    public void mostrar() {
        System.out.println(nome + " - " + sexo + " - " + altura);
        for (int i = 0; i < habilidades.length; i++) {
            System.out.println(habilidades[i]);
        }
    }

}