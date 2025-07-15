package strategy;

public class Assinatura {
    private Plano plano;


    public Assinatura(Plano plano) {
        this.plano = plano;

    }

    public void setPlano(Plano plano) {
        this.plano = plano;

    }

    public void mostrarPreco() {
        
        double preco = plano.calcularPreco();
        System.out.printf("O preço do plano escolhido é: R$ %.2f%n", preco);
    }
}

