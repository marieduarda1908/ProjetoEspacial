package espacial;

public abstract class ComponenteEspacial {

    protected int id;
    protected String nome;
    protected String status;
    protected double temperatura;

    public ComponenteEspacial(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.status = "DESLIGADO";
        this.temperatura = 25;
    }

    public void ligar() {
        status = "LIGADO";
    }

    public void desligar() {
        status = "DESLIGADO";
    }

    public abstract void exibirStatus();
}