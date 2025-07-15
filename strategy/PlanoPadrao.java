package strategy;

public class PlanoPadrao implements Plano {
    
    @Override
    public double calcularPreco() {
        double base = 40.0;
        double taxaExtra = 5.0;
        return base + taxaExtra;
    }
}

