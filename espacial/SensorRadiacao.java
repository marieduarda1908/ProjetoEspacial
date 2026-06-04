package espacial;

import java.util.Random;

public class SensorRadiacao extends ComponenteEspacial implements Sensor {

    private double limite = 70;

    public SensorRadiacao(int id, String nome) {
        super(id, nome);
    }

    @Override
    public double lerValor() {
        Random random = new Random();
        return random.nextDouble() * 100;
    }

    @Override
    public boolean verificarFuncionamento() {
        return true;
    }

    @Override
    public String retornarTipo() {
        return "Radiacao";
    }

    @Override
    public void exibirStatus() {

        double valor = lerValor();

        System.out.println("=== SENSOR RADIACAO ===");
        System.out.println("Valor: " + valor);

        if (valor > limite) {
            System.out.println("☢ ALERTA DE RADIACAO!");
        }
    }
}