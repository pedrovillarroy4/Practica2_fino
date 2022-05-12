package practica2;

public class Practica2 {

    public static void main(String[] args) {
        double res = 0;
        String operacion;
        boolean comprobar = false;

        do {

            String numero1;
            numero1 = metodes.primerNumero();
            //double nume1 = Double.parseDouble(numero1); Innecesario, ya que lo haces a continuación
            double n1 = new Double(numero1);

            operacion = metodes.escollirOpcio();

            String numero2;
            numero2 = metodes.segonNumero();
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
                            numero2 = metodes.denominadorZero();
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
                            numero2 = metodes.denominadorZero();
                            //nume2 = Double.parseDouble(numero2); Innecesario, ya que lo haces a continuación
                            n2 = new Double(numero2);
                        }
                        res = n1 % n2;
                        break;
                }
            } while (comprobar != true);

            System.out.println("\n*RESULTAT FINAL DE LA OPERACIÓ*\n(" + numero1 + ") " + operacion + " (" + numero2 + ")" + " = " + res);
            System.out.println("\nVols continuar operant? [s/n]");
            
            operacion = metodes.continuarOperant();
            
        } while (operacion.equals("s") || operacion.equals("S"));
        System.out.println("\n*FINALITZANT PROGRAMA*");
    }
}
