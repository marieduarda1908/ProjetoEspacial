package espacial;

import java.util.Scanner;

public class SistemaMonitoramento {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        SensorTemperatura temperatura =
                new SensorTemperatura(1, "Sensor Temp");

        SensorPressao pressao =
                new SensorPressao(2, "Sensor Pressao");

        SensorRadiacao radiacao =
                new SensorRadiacao(3, "Sensor Radiacao");

        DadosMissao missao =
                new DadosMissao(
                        "Orbita Terrestre",
                        100,
                        "Lua",
                        4,
                        "1234");

        PropulsaoQuimica quimica =
                new PropulsaoQuimica();

        PropulsaoEletrica eletrica =
                new PropulsaoEletrica();

        int opcao;

        do {

            System.out.println("\n=================================");
            System.out.println(" SISTEMA DE MONITORAMENTO ESPACIAL");
            System.out.println("=================================");
            System.out.println("1 - Verificar Sensores");
            System.out.println("2 - Ver Dados da Missao");
            System.out.println("3 - Propulsao Quimica");
            System.out.println("4 - Propulsao Eletrica");
            System.out.println("5 - Exibir Status Completo");
            System.out.println("6 - Simular Alertas");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");

            opcao = scanner.nextInt();

            switch(opcao) {

                case 1:

                    System.out.println("\n===== SENSORES =====");

                    temperatura.exibirStatus();
                    pressao.exibirStatus();
                    radiacao.exibirStatus();

                    break;

                case 2:

                    System.out.println("\n===== DADOS DA MISSAO =====");

                    System.out.println("Combustivel: "
                            + missao.getCombustivel() + "%");

                    if(missao.getCombustivel() < 20) {
                        System.out.println("CRITICO - Combustivel abaixo de 20%");
                    }

                    System.out.println("Tripulantes: "
                            + missao.getTripulantes());

                    System.out.print("Digite a senha para acessar as coordenadas: ");
                    String senha = scanner.next();

                    System.out.println("Coordenadas: "
                            + missao.getCoordenadas(senha));

                    break;

                case 3:

                    System.out.print("Digite a potencia da Propulsao Quimica (0-100): ");
                    int potenciaQ = scanner.nextInt();

                    quimica.ligarMotor();
                    quimica.setPotencia(potenciaQ);
                    quimica.acelerar();

                    System.out.println(
                            "Empuxo Gerado: "
                            + quimica.calcularEmpuxo());

                    break;

                case 4:

                    System.out.print("Digite a potencia da Propulsao Eletrica (0-100): ");
                    int potenciaE = scanner.nextInt();

                    eletrica.ligarMotor();
                    eletrica.setPotencia(potenciaE);
                    eletrica.acelerar();

                    System.out.println(
                            "Empuxo Gerado: "
                            + eletrica.calcularEmpuxo());

                    break;

                case 5:

                    System.out.println("\n===== STATUS COMPLETO =====");

                    temperatura.exibirStatus();
                    pressao.exibirStatus();
                    radiacao.exibirStatus();

                    System.out.println("\nCombustivel: "
                            + missao.getCombustivel() + "%");

                    System.out.println("Tripulantes: "
                            + missao.getTripulantes());

                    break;

                case 6:

                    System.out.println("\n===== CENTRAL DE ALERTAS =====");

                    System.out.println("ATENCAO - Temperatura elevada");
                    System.out.println("ALERTA - Pressao acima do limite");
                    System.out.println("CRITICO - Radiacao em nivel perigoso");

                    break;

                case 0:

                    System.out.println("Sistema encerrado.");
                    break;

                default:

                    System.out.println("Opcao invalida.");

            }

        } while(opcao != 0);

        scanner.close();
    }
}