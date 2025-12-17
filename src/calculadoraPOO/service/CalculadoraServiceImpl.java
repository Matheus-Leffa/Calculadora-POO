package calculadoraPOO.service;

public class CalculadoraServiceImpl implements CalculadoraService {

    @Override
    public double somar(double a, double b) {
        return a + b;
    }

    @Override
    public double subtrair(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplicar(double a, double b) {
        return a * b;
    }

    @Override
    public double dividir(double a, double b) {
        if(b == 0){
            System.out.println("Impossível dividir um número por 0");
            return 0;
        }

        return a / b;
    }
}
