package Interface;

public class Divisao implements ICalculo {
    @Override
    public void calcular(double numero01, double numero02) {
        double resultado = numero01 / numero02;
        System.out.printf("%.2f\n", resultado);
    }
}
