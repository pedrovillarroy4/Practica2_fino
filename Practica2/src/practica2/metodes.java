package practica2;

import java.util.Scanner;

public class metodes {
    
    static String primerNumero() {
        Scanner sc = new Scanner(System.in);

        String numero1;
        do {
            System.out.println("\n*PROGRAMA-CALCULADORA*\nIntrodueix el primer numero a operar.");
            numero1 = sc.nextLine();
        } while (!numero1.matches("[+-]?[\\d]*[.]?[\\d]+"));

        return numero1;
    }

    static String segonNumero() {
        Scanner sc = new Scanner(System.in);

        String numero2;
        do {
            System.out.println("\nIntrodueix el segon numero a operar.");
            numero2 = sc.nextLine();
        } while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));

        return numero2;
    }

    static String escollirOpcio() {
        Scanner sc = new Scanner(System.in);

        String operacion;
        boolean comprobar = false;

        do {
            System.out.println("\nEscull la operació que vols fer (Indica el signe):");
            System.out.println("+ = sumar\n- = restars\n"
                    + "x = multiplicar\n/ = dividir\n* = elevar primer num al segon num."
                    + "\n% = residu");
            operacion = sc.nextLine();
            if (operacion.equals("+") || operacion.equals("-") || operacion.equals("x")
                    || operacion.equals("X") || operacion.equals("/") || operacion.equals("%")
                    || operacion.equals("*")) {
                comprobar = true;
            } else {
                System.err.println("Error, escolleix una opció correcta.");
                comprobar = false;
            }
        } while (comprobar != true);
        return operacion;
    }

    static String denominadorZero() {
        Scanner sc = new Scanner(System.in);

        String numero2;

        do {
            System.err.println("Al denominador hi ha un zero\n"
                    + "per a  evitar errors coloca un altre valor.");
            numero2 = sc.nextLine();
        } while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
        return numero2;
    }

    static String continuarOperant() {
        Scanner sc = new Scanner(System.in);
        
        boolean comprobar = false;
        String operacion;
        
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
        return operacion;
    }
}
