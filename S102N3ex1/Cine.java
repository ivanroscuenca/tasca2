package S102N3ex1;

import java.util.Scanner;

public class Cine {
    protected String nom;
    protected int fila;
    protected int seient;

    public Cine(String nom, int fila, int seient) {
        this.nom=nom;
        this.fila = fila;
        this.seient=seient;
    }


    public void iniciar() {
        int opcio = -1;
        while (opcio != 0) {
            opcio = menu();
            switch (opcio) {
//                case 1:
//                    mostrarButaques();
//                    break;
//                case 2:
//                    mostrarButaquesPersona();
//                    break;
//                case 3:
//                    reservarButaca();
//                    break;
//                case 4:
//                    anularReserva();
//                    break;
//                case 5:
//                    anularReservaPersona();
//                    break;
                case 0:
                    System.out.println("Gràcies per utilitzar l'aplicació.");
                    break;
                default:
                    System.out.println("Opció incorrecta, si us plau torna-ho a intentar.");
            }
        }
    }

    public int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n----- Menú Principal -----\n");
        System.out.println("1.- Mostrar totes les butaques reservades.");
        System.out.println("2.- Mostrar les butaques reservades per una persona.");
        System.out.println("3.- Reservar una butaca.");
        System.out.println("4.- Anul·lar la reserva d'una butaca.");
        System.out.println("5.- Anul·lar totes les reserves d'una persona.");
        System.out.println("0.- Sortir.\n");
        System.out.print("Escull una opció: ");
        return sc.nextInt();
    }

}
