public class Multiplicacao extends Operacao {
    public Multiplicacao(double a, double b) {
        super(a, b);
    }

    @Override
    public void calcular() {
        result = a * b;
    }

    @Override
    public String toString() {
        return "Operaçao - " + a + " x " + b + " = " + result;
    }
}
