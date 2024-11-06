
/**
 * Main para la clase CalculadoraEjemplo.
 */
public class CalculadoraMain {

    /**
     * Método principal para crear objetos de CalculadoraEjemplo y probar sus
     * métodos.
     *
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        CalculadoraEjemplo calculadora = new CalculadoraEjemplo(28, 18);

        System.out.println("Suma: " + calculadora.suma());
        System.out.println("Resta: " + calculadora.resta());
        System.out.println("Multiplicación: " + calculadora.multiplicacion());
        System.out.println("División: " + calculadora.division());
    }
}
