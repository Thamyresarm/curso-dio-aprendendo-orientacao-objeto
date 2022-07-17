public class Calculadora implements Operacoes{

    @Override
    public void soma(double x, double y) {
        System.out.println("Soma: " + (x + y));
    }

    @Override
    public void subtracao(double x, double y) {
        System.out.println("Subtração: " + (x - y));
    }

    @Override
    public void multiplicacao(double x, double y) {
        System.out.println("Multiplicação: " + (x * y));
    }

    @Override
    public void divisao(double x, double y) {
        System.out.println("Divisão: " + (x / y));
    }
}
