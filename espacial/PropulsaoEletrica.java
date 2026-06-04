package espacial;

public class PropulsaoEletrica extends SistemaPropulsao {

    private double consumoEnergia;

    public PropulsaoEletrica() {
        super();
        consumoEnergia = 0;
    }

    @Override
    public void acelerar() {

        if (ligado) {
            System.out.println("Propulsão Elétrica acelerando a "
                    + potencia + "%");
        } else {
            System.out.println("Motor desligado!");
        }
    }

    @Override
    public double calcularEmpuxo() {
        return potencia * 10;
    }
}