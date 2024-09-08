package vasquez.app.patronesDisenio.decorator2.decorador;

import vasquez.app.patronesDisenio.decorator2.Configurable;

abstract public class CafeDecorador implements Configurable {
    protected Configurable cafe;

    public CafeDecorador(Configurable cafe) {
        this.cafe = cafe;
    }

}
