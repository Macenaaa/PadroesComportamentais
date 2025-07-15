package strategy;

public class PlanoPremium implements Plano {


    
    @Override
    public double calcularPreco() {
        double precoBase = 60.0;
        double desconto = 0.1; 
        return precoBase * (1 - desconto);
    }
}
