class Cao {
    String nome;
    String cor;
    int idade;
    double peso;

    public Cao() {
        cor = "Caramelo";
    }

    public Cao(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void Anda() {
        System.out.println("Estou andando...");
    }

    public void DadosCao() {
        System.out.printf("\nEu sou %s, tenho %d anos.", this.nome, this.idade);
    }
}