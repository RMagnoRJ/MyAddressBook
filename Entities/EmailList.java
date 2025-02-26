package NewClasses.MyAddressBook.Entities;

import java.util.ArrayList;
import java.util.List;

public class EmailList {
    
    private List <Email> listaDeEmail = new ArrayList<>();

    public EmailList() {
    }

    public EmailList(List<Email> listaDeEmail) {
        this.listaDeEmail = listaDeEmail;
    }

    public List<Email> getListaDeEmail() {
        return listaDeEmail;
    }

    public void addEmail(Email registro){
        listaDeEmail.add(registro);
    }

    public void removeEmail(Email registro){
        listaDeEmail.remove(registro);
    }
}
