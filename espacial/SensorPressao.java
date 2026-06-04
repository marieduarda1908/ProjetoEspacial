package espacial;

import java.util.Random;

public class SensorPressao extends ComponenteEspacial implements Sensor {

    private double limite = 100;

    public SensorPressao(int id, String nome) {
        super(id, nome);
    }

    @Override
    public double lerValor() {
        Random random = new Random();
        return random.nextDouble() * 150;
    }

    @Override
    public boolean verificarFuncionamento() {
        return true;
    }

    @Override
    public String retornarTipo() {
        return "Pressao";
    }

    @Override
    public void exibirStatus() {

        double valor = lerValor();

        System.out.println("=== SENSOR PRESSAO ===");
        System.out.println("Valor: " + valor);

        if (valor > limite) {
            System.out.println("⚠ ALERTA DE PRESSAO!");
        }
    }
}