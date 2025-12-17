package CalculadoraPOO;

public class Soma extends Operacao {
    public Soma(double a, double b) {
        super(a, b);
    }

    @Override
    public void calcular() {
        result = a + b;
    }

    @Override
    public String toString() {
        return "Operaçao - " + a + " + " + b + " = " + result;
    }
}

