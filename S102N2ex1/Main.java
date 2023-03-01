package S102N2ex1;

//Crea una classe anomenada "Entrada". Aquesta classe ha de servir per controlar les diferents
// excepcions que poden aparèixer en Java a l’hora d’introduir dades per teclat utilitzant la
// classe Scanner.
//
//        El primer que s’ha de fer és instanciar un objecte de la classe Scanner i a partir d’aquí,
//        crear mètodes estàtics per llegir els diferents tipus de dades des del teclat.
//
//        Important
//
//        És important que si en algun mètode salta una excepció, la tractem i tornem a demanar la dada
//        a l’usuari/ària fins que aquesta estigui ben introduïda. Per exemple: Si introdueix un float
//        amb un punt en lloc d'amb una coma, ha de mostrar “Error de format”. Fins que l’usuari/ària
//        no introdueix un float ben format ha de seguir demanant la dada.
//
//        Tots els mètodes reben un String amb el missatge que es vol mostrar a l’usuari/ària,
//        per exemple: “Introdueix la teva edat”, i retornen la dada oportuna introduïda per
//        l’usuari/ària en cada mètode, per exemple: un byte amb l’edat de l’usuari/ària.
//
//        Mètodes a implantar capturant l’excepció de la classe InputMismatchException:
//
//public static byte llegirByte(String missatge);
//
//public static int llegirInt(String missatge);
//
//public static float llegirFloat(String missatge);
//
//public static double llegirDouble(String missatge);
//
//        Mètodes a implantar capturant l’excepció de la classe Exception:
//
//public static char llegirChar(String missatge);
//
//public static String llegirString(String missatge);
//
//public static boolean llegirSiNo(String missatge), si l’usuari/ària introdueix “s”,
// retorna “true”, si l’usuari introdueix “n”, retorna “false”.
public class Main {

    public static void main(String[] args) {

        System.out.println("Benvinguts al nostre programa de preguntes");
        System.out.println("**************************************************************");
        System.out.println("Resposta: " + Entrada.llegirByte("Introdueix la teva edat:"));
        System.out.println("Resposta: " + Entrada.llegirInt("Introdueix la teva alçada:"));
        System.out.println("Resposta: " + Entrada.llegirFloat("Introdueix el teu pes:"));
        System.out.println("Resposta: " + Entrada.llegirDouble("Introdueix el seu número d'habitants d'Europa"));
        System.out.println("Resposta: " + Entrada.llegirChar("Introdueix la lletra del teu DNI:"));
        System.out.println("Resposta: " + Entrada.llegirString("Introdueixi el nom de la teva mare:"));
        System.out.println("Resposta: " + Entrada.llegirSiNo("T'agradaria marxar a l'estranger a viure?"));
        System.out.println("Moltes gràcies per utilitzar el nostre programa");
        System.out.println("**************************************************************");
    }
}
