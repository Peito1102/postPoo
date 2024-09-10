package vasquez.app.patronesDisenio32.decorator.decorador;

import vasquez.app.patronesDisenio32.decorator.Formateable;

public class ReemplazarEspaciosDecorador extends TextoDecorador {
    public ReemplazarEspaciosDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().replace(" ","_");
    }
}
