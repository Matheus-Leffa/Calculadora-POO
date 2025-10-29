import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        String opcao = "";

        do {
            System.out.println("\nDigite o primeiro número:");
            double a = sc.nextDouble();

            System.out.println("Digite o segundo número:");
            double b = sc.nextDouble();

            System.out.println("Escolha a operação (+, -, *, /):");
            char op = sc.next().charAt(0);

            Operacao operacao = null;

            switch (op) {
                case '+': operacao = new Soma(a, b); break;
                case '-': operacao = new Subtracao(a, b); break;
                case '*': operacao = new Multiplicacao(a, b); break;
                case '/': operacao = new Divisao(a, b); break;
                default:
                    System.out.println("Operação inválida!");
                    continue;
            }

            double resultado = calculadora.calcular(operacao);
            System.out.println("Resultado = " + resultado);

            System.out.println("\nDeseja continuar? (s/n)");
            opcao = sc.next();

        } while (opcao.equalsIgnoreCase("s"));

        calculadora.mostrarHistorico();
        sc.close();
    }
}