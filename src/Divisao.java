public class Divisao extends Operacao{
    public Divisao(double a, double b) {
        super(a, b);
    }

    @Override
    public void calcular() {
        if(b == 0) {
            System.out.println("Não é possível fazer divisão por 0");
            return;
        }
        result = a / b;
    }

    @Override
    public String toString() {
        return "Operaçao - " + a + " / " + b + " = " + result;
    }
}
