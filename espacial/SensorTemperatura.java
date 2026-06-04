package espacial;

import java.util.Random;

public class SensorTemperatura extends ComponenteEspacial implements Sensor {

    private double limite = 80;

    public SensorTemperatura(int id, String nome) {
        super(id, nome);
    }

    @Override
    public double lerValor() {
        Random random = new Random();
        temperatura = random.nextDouble() * 120;
        return temperatura;
    }

    @Override
    public boolean verificarFuncionamento() {
        return true;
    }

    @Override
    public String retornarTipo() {
        return "Temperatura";
    }

    @Override
    public void exibirStatus() {

        double valor = lerValor();

        System.out.println("=== SENSOR TEMPERATURA ===");
        System.out.println("Valor: " + valor + " °C");

        if (valor > limite) {
            System.out.println("⚠ ALERTA DE TEMPERATURA!");
        }
    }
}