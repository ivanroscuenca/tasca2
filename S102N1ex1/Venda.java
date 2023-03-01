package S102N1ex1;

import java.util.ArrayList;

public class Venda {
    //Atributs
    private int preuTotal;
    private ArrayList<Producte> productes =new ArrayList<>();

    private static int preuAcumulat;

    Venda(){}

    public ArrayList<Producte> getProductes() {
        return productes;
    }

public static String VentesTotals(){

        return "El total de ventes son : "+preuAcumulat + " €";
}

    public void escollirProducte(Producte producte){
        productes.add(producte);
    }

    public int calcularTotal() throws VendaBuidaException {
       if(productes == null || productes.size() == 0){
            throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");
        }else {
           for (int i =0; i< productes.size();i++){
               preuTotal += productes.get(i).getPreu() ;
               preuAcumulat+=productes.get(i).getPreu();
           }
       }
       return preuTotal;
    }
}