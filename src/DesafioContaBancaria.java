import java.util.Scanner;

public class DesafioContaBancaria {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        //Inicialização das variáveis de texto
        String textoEntradaOpcoes = """
                Operações
                                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                                
                Digite a opção desejada:
                """;
        String informacoesDaConta = """
                ******************************************
                Dados iniciais do cliente:
                
                Nome: %s
                Tipo de conta: %s
                Saldo: R$ %.2f
                ******************************************
                """;

        //Inicialização das informações do cliente
        String nome = "Jonas Ladeira";
        String tipoDeConta = "Corrente";
        double saldo = 5000.00;

        int operacao = 0;
        System.out.println(informacoesDaConta.formatted(nome, tipoDeConta, saldo));
        while (operacao != 4) {
            System.out.println(textoEntradaOpcoes);
            operacao = leitura.nextInt();

            switch (operacao) {
                case(1): //Consulta saldo
                    System.out.println("Seu saldo é de: %.2f".formatted(saldo));
                    break;
                case(2): //Incrementa valor no saldo
                    System.out.println("Informe o valor que deseja receber: ");
                    double valorReceber = leitura.nextDouble();
                    saldo += valorReceber;
                    System.out.println("Seu saldo é de: %.2f".formatted(saldo));
                    break;
                case(3): //Retira valor do saldo
                    System.out.println("Informe o valor que deseja transferir: ");
                    double valorSaque = leitura.nextDouble();
                    //Verifica se ha saldo suficiente
                    if(saldo < valorSaque)
                        System.out.println("Saldo insuficiente!");
                    else
                        saldo -= valorSaque;
                    System.out.println("Seu saldo é de: %.2f".formatted(saldo));
                    break;
                case(4): //Sair
                    System.out.println("Até logo!");
                    break;
                default:
                    System.out.println("Operação informada inválida ou não cadastrada!");
                    break;
            }

        }
    }

}
