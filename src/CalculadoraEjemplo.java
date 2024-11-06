/**
 * Clase CalculadoraEjemplo para realizar operaciones básicas (suma, resta,
 * multiplicación y división) entre dos operandos.
 * 
 * @author Daniel
 * @version 1.0
 */
public class CalculadoraEjemplo {

    private double operando1;
    private double operando2;
    private double resultado;

    /**
     * Constructor para inicializar los operandos de la calculadora.
     * 
     * @param operando1 Primer operando
     * @param operando2 Segundo operando
     */
    public CalculadoraEjemplo(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    /**
     * Método para realizar la suma.
     * 
     * @return el resultado de la suma de los operandos
     */
    public double suma() {
        resultado = operando1 + operando2;
        return resultado;
    }

    /**
     * Método para realizar la resta.
     * 
     * @return el resultado de la resta de los operandos
     */
    public double resta() {
        resultado = operando1 - operando2;
        return resultado;
    }

    /**
     * Método para realizar la multiplicación.
     * 
     * @return el resultado de la multiplicación de los operandos
     */
    public double multiplicacion() {
        resultado = operando1 * operando2;
        return resultado;
    }

    /**
     * Método para realizar la división.
     * 
     * @return el resultado de la división de los operandos
     */
    public double division() {
        resultado = operando1 / operando2;
        return resultado;
    }
}
