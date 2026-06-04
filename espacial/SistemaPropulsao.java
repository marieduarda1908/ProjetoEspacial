package espacial;

public abstract class SistemaPropulsao {

    protected boolean ligado;
    protected int potencia;

    public SistemaPropulsao() {
        this.ligado = false;
        this.potencia = 0;
    }

    public void ligarMotor() {
        ligado = true;
        System.out.println("Motor ligado!");
    }

    public void desligarMotor() {
        ligado = false;
        potencia = 0;
        System.out.println("Motor desligado!");
    }

    public void setPotencia(int potencia) {

        if (potencia >= 0 && potencia <= 100) {
            this.potencia = potencia;
        } else {
            System.out.println("Potência inválida! Use valores entre 0 e 100.");
        }
    }

    public int getPotencia() {
        return potencia;
    }

    public abstract void acelerar();

    public abstract double calcularEmpuxo();
}