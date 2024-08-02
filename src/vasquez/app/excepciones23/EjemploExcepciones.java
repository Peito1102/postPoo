package vasquez.app.excepciones23;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        String numerador = JOptionPane.showInputDialog(null, "Ingresa numerador");
        String denominador = JOptionPane.showInputDialog(null, "Ingresa denominador");

        try {
            double division2 = cal.dividir(numerador,denominador);
            System.out.println("division2 = " + division2);
        } catch (FormatoNumeroException e) {
            System.out.println("Se detecto un problema al convertir los formatos del numerador o denominador.");
            e.printStackTrace(System.out);
        } catch (DivisionPorCeroException e) {
            System.out.println("Hubo un error con el divisor, su valor es 0");
        }
        finally {
            System.out.println("Yo JD mrd.");
        }

        System.out.println("Continuamos");
    }

}
