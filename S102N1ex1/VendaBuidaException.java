package S102N1ex1;

public class VendaBuidaException extends Exception {

    private String missatge;
    public VendaBuidaException(String missatge){
        this.missatge=missatge;
        getMessage();
    }

    public String getMessage(){
        return missatge;
    }
}
