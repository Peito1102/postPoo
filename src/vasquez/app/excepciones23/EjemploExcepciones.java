package vasquez.app.excepciones23;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        String valor = JOptionPane.showInputDialog(null, "Ingresa un entero");
        int divisor;


        try {
            divisor = Integer.parseInt(valor);
            double division = cal.dividir(10,divisor);
            System.out.println(division);
        } catch (NumberFormatException e) {
            System.out.println("Hubo un error con el formato del divisor, su valor es " + "\'" + valor + "\'");
            main(args);
        } catch (DivisionPorCeroException e) {
            System.out.println("Hubo un error con el divisor, su valor es 0");
        }
        finally {
            System.out.println("Yo JD mrd.");
        }

        System.out.println("Continuamos");
    }

}
