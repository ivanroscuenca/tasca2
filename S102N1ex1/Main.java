package S102N1ex1;
//- Exercici 1
//        Crea una classe anomenada "Producte" amb els atributs nom i preu, i una altra classe anomenada "Venda".
//        Aquesta classe té com a atributs una col·lecció de productes i el preu total de la venda.
//
//        La classe "Venda", té un mètode anomenat calcularTotal() que llança l’excepció personalitzada
//        VendaBuidaException i mostra per pantalla “Per fer una venda primer has d’afegir productes” si la
//        col·lecció de productes està buida. Si la col·lecció té productes, llavors ha de recórrer la col·lecció
//        i guardar la suma de tots els preus dels productes a l’atribut preu total de la venda.
//
//        L’excepció personalitzada VendaBuidaException ha de ser filla de la classe Exception. Al seu constructor
//        li hem de passar el missatge  “Per fer una venda primer has d’afegir productes” i quan capturem l’excepció,
//        l’hem de mostrar per pantalla amb el mètode getMessage() de l’excepció.
//
//        Escriu el codi necessari per a generar i capturar una excepció de tipus ArrayIndexOutOfBoundsException.


import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws VendaBuidaException {


        Venda venta1 = new Venda();
        venta1.escollirProducte(new Producte("aigua", 1));
        venta1.escollirProducte(new Producte("cervesa", 2));
        venta1.escollirProducte(new Producte("vi", 3));
        venta1.escollirProducte(new Producte("vermut", 5));
        venta1.escollirProducte(new Producte("cubata", 10));

        int ventaTotal = venta1.calcularTotal();
        System.out.println("Venta 1 total : " + ventaTotal + " €");

        Venda venta2 = new Venda();
        venta2.escollirProducte(new Producte("cervesa", 2));
        venta2.escollirProducte(new Producte("vi", 3));
        int ventaTotal2 = venta2.calcularTotal();
        System.out.println("Venta 2 total : " + ventaTotal2 + " €");

        Venda venta3 = new Venda();
        venta3.escollirProducte(new Producte("cubata", 10));
        int ventatotal3 = venta3.calcularTotal();
        System.out.println("Venta 3 total : " + ventatotal3 + " €");

        System.out.println(Venda.VentesTotals());

        //Salti VendaBuidaException
//        Venda venta0 = new Venda();
//        int ventaTotal0 = venta0.calcularTotal();

        //salti ArrayIndexOutOfBoundsException
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[15]);
        } catch (Exception e){
            System.out.println("Capturat ArrayIndexOutOfBoundsException");
        }

    }

}


