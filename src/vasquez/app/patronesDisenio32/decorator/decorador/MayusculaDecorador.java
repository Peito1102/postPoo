package vasquez.app.patronesDisenio32.decorator.decorador;

import vasquez.app.patronesDisenio32.decorator.Formateable;

public class MayusculaDecorador extends TextoDecorador{

    public MayusculaDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().toUpperCase();
    }
}
