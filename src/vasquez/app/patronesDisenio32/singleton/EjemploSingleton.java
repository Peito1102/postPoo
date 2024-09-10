package vasquez.app.patronesDisenio32.singleton;

import vasquez.app.patronesDisenio32.ConexionBDSingleton;

public class EjemploSingleton {
    public static void main(String[] args) throws InterruptedException {
        ConexionBDSingleton con = null;

        for (int i =0;i < 10;i++) {
            con = ConexionBDSingleton.getInstancia();
            Thread.sleep(2000);
            System.out.println("con = " + con);
        }

        ConexionBDSingleton con2 = ConexionBDSingleton.getInstancia();
        ConexionBDSingleton con3 = ConexionBDSingleton.getInstancia();
        boolean b1 = ((con == con2) && (con2 == con3) && (con == con3));
        System.out.println("b1 = " + b1);
    }
}
