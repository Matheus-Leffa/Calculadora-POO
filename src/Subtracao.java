public class Subtracao extends Operacao {
    public Subtracao(double a, double b) {
        super(a, b);
    }

    @Override
    public void calcular() {
        result = a - b;
    }

    @Override
    public String toString() {
        return "Operaçao - " + a + " - " + b + " = " + result;
    }
}
