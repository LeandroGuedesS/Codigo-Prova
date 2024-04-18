package prova;

public abstract class Figura {

    protected String cor;

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Figura(String cor) {
        this.cor = cor;
    }

    public Figura() {
    }
}
