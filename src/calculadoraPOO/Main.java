package calculadoraPOO;

import calculadoraPOO.config.CalculadoraConfig;
import calculadoraPOO.service.CalculadoraService;
import calculadoraPOO.service.CalculadoraServiceImpl;
import calculadoraPOO.service.HistoricoService;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CalculadoraConfig calculadoraConfig = new CalculadoraConfig();
        CalculadoraService calc = calculadoraConfig.getCalculadoraService();
        HistoricoService hist = calculadoraConfig.getHistoricoService();

        Scanner sc = new Scanner(System.in);
        String opcao = "";

        do {
            System.out.println("\nDigite o primeiro número:");
            double a = sc.nextDouble();

            System.out.println("Digite o segundo número:");
            double b = sc.nextDouble();

            System.out.println("Escolha a operação (+, -, *, /):");
            char op = sc.next().charAt(0);

            double resultado;
            String registro;

            switch (op) {
                case '+':
                    resultado = calc.somar(a, b);
                    registro = a + " + " + b + " = " + resultado;
                    break;
                case '-':
                    resultado =calc.subtrair(a, b);
                    registro = a + " - " + b + " = " + resultado;
                    break;
                case '*':
                    resultado = calc.multiplicar(a, b);
                    registro = a + " * " + b + " = " + resultado;
                    break;
                case '/':
                    resultado = calc.dividir(a, b);
                    registro = a + " / " + b + " = " + resultado;
                    break;
                default:
                    System.out.println("Operação inválida!");
                    continue;
            }

            System.out.println("Resultado:" + resultado);
            hist.registrar(registro);

            System.out.println("\nDeseja continuar? (s/n)");
            opcao = sc.next();

        } while (opcao.equalsIgnoreCase("s"));


        System.out.println("\n=== HISTÓRICO DE OPERAÇÕES ===");
        hist.obterHistorico().forEach(System.out::println);
        sc.close();
    }
}