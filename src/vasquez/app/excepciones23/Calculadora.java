package vasquez.app.excepciones23;

public class Calculadora {
    public double dividir(int numerador, int denominador) throws DivisionPorCeroException {
        if (denominador == 0) {
            throw new DivisionPorCeroException("El denominador es 0 y no se puede dividir.");
        }
        return (double)numerador/denominador;
    }

}
