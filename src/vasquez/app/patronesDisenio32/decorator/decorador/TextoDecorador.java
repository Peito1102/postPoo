package vasquez.app.patronesDisenio32.decorator.decorador;

import vasquez.app.patronesDisenio32.decorator.Formateable;

abstract public class TextoDecorador implements Formateable {
    protected Formateable texto;

    public TextoDecorador(Formateable texto) {
        this.texto = texto;
    }
}
