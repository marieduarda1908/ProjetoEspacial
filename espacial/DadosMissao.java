package espacial;

public class DadosMissao {

    private String coordenadas;
    private double combustivel;
    private String trajetoria;
    private int tripulantes;
    private String senha;

    public DadosMissao(String coordenadas, double combustivel,
                       String trajetoria, int tripulantes, String senha) {

        this.coordenadas = coordenadas;
        this.combustivel = combustivel;
        this.trajetoria = trajetoria;
        this.tripulantes = tripulantes;
        this.senha = senha;
    }

    public String getCoordenadas(String senhaInformada) {

        if (senha.equals(senhaInformada)) {
            return coordenadas;
        }

        return "Acesso negado!";
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {

        if (combustivel >= 0 && combustivel <= 100) {
            this.combustivel = combustivel;
        } else {
            System.out.println("Valor de combustível inválido!");
        }

        if (this.combustivel < 20) {
            System.out.println("⚠ ALERTA: Combustível abaixo de 20%");
        }
    }

    public String getTrajetoria() {
        return trajetoria;
    }

    public void setTrajetoria(String trajetoria) {
        this.trajetoria = trajetoria;
    }

    public int getTripulantes() {
        return tripulantes;
    }

    public void setTripulantes(int tripulantes) {

        if (tripulantes > 0) {
            this.tripulantes = tripulantes;
        }
    }
}