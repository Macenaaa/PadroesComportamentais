package strategy;
import java.util.Scanner;
import strategy.Enum.PlanoTipo;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um plano:");
        System.out.println("1 - Básico");
        System.out.println("2 - Padrão");
        System.out.println("3 - Premium");
        System.out.print("Digite o número do plano: ");

        int escolha = scanner.nextInt();
        PlanoTipo tipo;

        switch (escolha) {
            case 1:

                tipo = PlanoTipo.BASICO;
                break;
            case 2:

                tipo = PlanoTipo.PADRAO;
                break;
            case 3:

                tipo = PlanoTipo.PREMIUM;
                break;

            default:
                System.out.println("Opção inválida, escolhendo Básico por padrão.");
                tipo = PlanoTipo.BASICO;
        }

        Plano plano = PlanoFactory.criarPlano(tipo);
        Assinatura assinatura = new Assinatura(plano);
        assinatura.mostrarPreco();
        scanner.close();
    }
}

