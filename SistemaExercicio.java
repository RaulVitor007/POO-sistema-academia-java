public class Exercicio {

    // Atributos: oque exercicio tem! (as caracteriticas)
    public String nome;
    public int serie;
    public int repeticao;

    public Exercicio(String nome, int serie, int repeticao) {
        this.nome = nome;
        this.serie = serie;
        this.repeticao = repeticao;
    }

    //Metodos: oque o exercicio faz! (a ação)
    public void iniciarTreino(){
        System.out.println( nome + " vamos comecar com " + serie + " de " + repeticao + "a carga voce que manda!" );
    }

}
