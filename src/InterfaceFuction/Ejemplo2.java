package interface1;

import java.util.function.BiFunction;

public class Ejemplo2 {

    public static void main(String[] args) {

        BiFunction<Double, Double, Double> calcularAreaRectangulo = (base, altura) -> base * altura;
        
        Double area = calcularAreaRectangulo.apply(5.0, 3.5);

        System.out.println("El área del rectángulo es: " + area);
    }
}
