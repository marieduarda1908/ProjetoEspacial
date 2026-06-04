package espacial;

public class PropulsaoQuimica extends SistemaPropulsao {

    private double combustivelConsumido;

    public PropulsaoQuimica() {
        super();
        combustivelConsumido = 0;
    }

    @Override
    public void acelerar() {

        if (ligado) {
            System.out.println("Propulsão Química acelerando a "
                    + potencia + "%");
        } else {
            System.out.println("Motor desligado!");
        }
    }

    @Override
    public double calcularEmpuxo() {
        return potencia * 15;
    }
}