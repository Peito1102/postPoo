package vasquez.app.excepciones23;

public class Calculadora {
    public double dividir(int numerador, int denominador) throws DivisionPorCeroException {
        if (denominador == 0) {
            throw new DivisionPorCeroException("El denominador es 0 y no se puede dividir.");
        }
        return (double)numerador/denominador;
    }

    public double dividir(String numerador, String denominador) throws DivisionPorCeroException, FormatoNumeroException {
        try {
            int nume = Integer.parseInt(numerador);
            int deno = Integer.parseInt(denominador);
            return this.dividir(nume,deno);
        } catch (NumberFormatException e) {
            throw new FormatoNumeroException("Debe ingresar numerador y denominador con un formato adecuado.");
        }

    }

}
