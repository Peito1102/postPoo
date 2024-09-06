package vasquez.app.patronesDisenio.decorator.decorador;

import vasquez.app.patronesDisenio.decorator.Formateable;

abstract public class TextoDecorador implements Formateable {
    protected Formateable texto;

    public TextoDecorador(Formateable texto) {
        this.texto = texto;
    }
}
