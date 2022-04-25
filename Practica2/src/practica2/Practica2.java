package practica2;

import java.util.Scanner;

public class Practica2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double res = 0;
        String operacion;
        boolean comprobar = false;

        do {

            String numero1;
            do {
                System.out.println("\n*PROGRAMA-CALCULADORA*\nIntrodueix el primer numero a operar.");
                numero1 = sc.nextLine();
            } while (!numero1.matches("[+-]?[\\d]*[.]?[\\d]+"));
            //double nume1 = Double.parseDouble(numero1); Innecesario, ya que lo haces a continuación
            double n1 = new Double(numero1);

            do {
                System.out.println("\nEscull la operació que vols fer (Indica el signe):");
                System.out.println("+ = sumar\n- = restar\n"
                        + "x = multiplicar\n/ = dividir\n* = elevar primer num al segon num."
                        + "\n% = residu");
                operacion = sc.nextLine();
                if (operacion.equals("+") || operacion.equals("-") || operacion.equals("x")
                        || operacion.equals("X") || operacion.equals("/") || operacion.equals("%")
                        || operacion.equals("*")) {
                    comprobar = true;
                } else {
                    comprobar = false;
                }
            } while (comprobar != true);

            String numero2;
            do {
                System.out.println("\nIntrodueix el segon numero a operar.");
                numero2 = sc.nextLine();
            } while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
            //double nume2 = Double.parseDouble(numero2); Innecesario, ya que lo haces a continuación
            double n2 = new Double(numero2);

            do {
                comprobar = true;
                switch (operacion) {
                    case "+":
                        res = n1 + n2; //Cambiar un n2 por un n1
                        break;
                    case "-":
                        res = n1 - n2;
                        break;
                    case "x":
                    case "X":
                        res = n1 * n2;
                        break;
                    case "/":
                        while (n2 == 0) {
                            do {
                                System.err.println("Al denominador hi ha un zero\n"
                                        + "per a  evitar errors coloca un altre valor.");
                                numero2 = sc.nextLine();
                            } while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
                            //nume2 = Double.parseDouble(numero2); Innecesario, ya que lo haces a continuación
                            n2 = new Double(numero2);
                        }
                        res = n1 / n2;
                        break;
                    case "*":
                        res = Math.pow(n1, n2); //Cambiar el segundo n1 a n2
                        break;
                    case "%":
                        while (n2 == 0) {
                            do {
                                System.err.println(" Al denominador hi ha un zero \n"
                                        + "per a  evitar errors coloca un altre valor.");
                                numero2 = sc.nextLine();
                            } while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
                            //nume2 = Double.parseDouble(numero2); Innecesario, ya que lo haces a continuación
                            n2 = new Double(numero2);
                        }
                        res = n1 % n2;
                        break;
                }
            } while (comprobar != true);

            System.out.println("\n*RESULTAT FINAL DE LA OPERACIÓ*\n(" + numero1 + ") " + operacion + " (" + numero2 + ")" + " = " + res);
            System.out.println("\nVols continuar operant? [s/n]");
            do {
                comprobar = true;
                operacion = sc.nextLine();

                switch (operacion) {
                    case "s":
                    case "S":
                    case "n":
                    case "N":
                        break;
                    default:
                        System.err.println("\nError, posa un valor vàlid.\n");
                        comprobar = false;
                }
            } while (comprobar != true);
        } while (operacion.equals("s") || operacion.equals("S"));
        System.out.println("\n*FINALITZANT PROGRAMA*");
    }
}