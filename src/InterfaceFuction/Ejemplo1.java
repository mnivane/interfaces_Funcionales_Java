package interface1;

import java.util.function.Function;

public class Ejemplo1 {

    public static void main(String[] args) {

        Function<Double, String> formatearPrecio = precio -> "El costo final con IVA es: $" + (precio * 1.19);

        String resultado = formatearPrecio.apply(100.0);

        System.out.println(resultado);
    }
}