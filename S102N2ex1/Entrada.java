package S102N2ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
    //instanciem un objecte de la classe Scanner
    static Scanner entrada = new Scanner(System.in);

    public static Byte llegirByte(String missatge) {
        byte usuariByte = 0;
        boolean correcte = false;

        while (correcte == false) {

            try {
                System.out.println(missatge);
                usuariByte = entrada.nextByte();
                correcte = true;


            } catch (InputMismatchException e) {
                System.out.println("Error de format");
                //scanner següent
                entrada.next();
            }
        }
        return usuariByte;
    }

    public static Integer llegirInt(String missatge) {
        int usuariInt = 0;
        boolean correcte = false;

        while (correcte == false) {

            try {
                System.out.println(missatge);
                usuariInt = entrada.nextInt();
                correcte = true;

            } catch (InputMismatchException e) {
                System.out.println("Error de format");

                //scanner següent
                entrada.next();
            }
        }

        return usuariInt;
    }

    public static Float llegirFloat(String missatge) {
        float usuariFloat = 0f;
        boolean correcte = false;

        while (correcte == false) {

            try {
                System.out.println(missatge);
                usuariFloat = entrada.nextFloat();
                correcte = true;

            } catch (InputMismatchException e) {
                System.out.println("Error de format");

                //scanner següent
                entrada.next();
            }
        }

        return usuariFloat;
    }

    public static Double llegirDouble(String missatge) {
        double usuariDouble = 0f;
        boolean correcte = false;

        while (correcte == false) {

            try {
                System.out.println(missatge);
                usuariDouble = entrada.nextDouble();
                correcte = true;

            } catch (InputMismatchException e) {
                System.out.println("Error de format");

                //scanner següent
                entrada.next();
            }
        }

        return usuariDouble;
    }

    public static char llegirChar(String missatge) {
        char usuariChar = ' ';
        boolean correcte = false;

        while (correcte == false) {

            try {
                System.out.println(missatge);
                String tempText = entrada.next().toLowerCase();
                if (!(tempText.length() == 0)) {
                    usuariChar = tempText.charAt(0);
                    correcte = true;
                }

            } catch (Exception e) {
                System.out.println("Error de format");

            }
        }

        return usuariChar;
    }

    public static String llegirString(String missatge) {
        String usuariString = "";
        boolean correcte = false;

        while (correcte == false) {

            try {
                System.out.println(missatge);
                usuariString = entrada.next();
                correcte = true;

            } catch (NumberFormatException e) {
                System.out.println("Error de format");

                //scanner següent
                entrada.next();
            }
        }

        return usuariString;
    }


    public static Boolean llegirSiNo(String missatge) {
        String usuariString = "";
        boolean userAnswer = false;
        boolean correcte = false;

        while (correcte == false) {

            try {
                System.out.println(missatge);
                usuariString = entrada.next().toLowerCase();

                if (usuariString.charAt(0) == 's') {
                    userAnswer = true;
                    correcte = true;

                } else if (usuariString.charAt(0) == 'n') {
                    userAnswer = false;
                    correcte = true;
                }

            } catch (Exception e) {
                System.out.println("Error de format");

                //scanner següent
                entrada.next();
            }
        }

        return userAnswer;
    }
}

