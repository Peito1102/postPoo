package vasquez.app.patronesDisenio.decorator.decorador;

import vasquez.app.patronesDisenio.decorator.Formateable;

public class ReemplazarEspaciosDecorador extends TextoDecorador {
    public ReemplazarEspaciosDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().replace(" ","_");
    }
}
