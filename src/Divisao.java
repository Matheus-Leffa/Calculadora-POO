public class Divisao extends Operacao{
    public Divisao(double a, double b) {
        super(a, b);
    }

    @Override
    public void calcular() {
        if(b == 0) {
            throw new IllegalArgumentException("Não é possível fazer divisão por 0");
        }
        result = a / b;
    }

    @Override
    public String toString() {
        return "Operaçao - " + a + " / " + b + " = " + result;
    }
}
