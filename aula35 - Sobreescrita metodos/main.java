class Linguagem {
    public void info() {
        System.out.println("Estou falando portugues");
    }
}

class Java extends Linguagem {
    public void info() {
        System.out.println("Sou uma linguagem de programação");
    }
}

class Main {
    public static void main(String[] args) {
        Java java = new Java();
        java.info();

        Linguagem lingua = new Linguagem();
        lingua.info();
    }
}
