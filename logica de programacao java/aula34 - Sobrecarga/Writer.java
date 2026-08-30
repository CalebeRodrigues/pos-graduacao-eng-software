public class Writer {
    int qtdRepeticao;

    public Writer() {
        this.qtdRepeticao = 3;
    }

    public Writer(int qtdRepeticaoPadrao) {
        this.qtdRepeticao = qtdRepeticaoPadrao;
    }

    // sem parâmetros adicionais
    void escrever() {
        for (int i = 0; i < qtdRepeticao; i++) {
            System.out.println((i + 1));
        }
    }

    // com parâmmetro do texto
    void escrever(String texto) {
        for (int i = 0; i < qtdRepeticao; i++) {
            System.out.println(texto);
        }
    }

    // com parametro de quantas repetições
    void escrever(String texto, int repeticoes) {
        for (int i = 0; i < repeticoes; i++) {
            System.out.println(texto);
        }
    }
}
