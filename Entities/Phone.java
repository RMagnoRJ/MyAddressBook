package NewClasses.MyAddressBook.Entities;

public class Phone {

    private String tipo;    
    private String number;

    public Phone(String tipo, String number) {
        this.tipo = tipo;
        this.number = number;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNumber() {
        return number;
    }
    

}
