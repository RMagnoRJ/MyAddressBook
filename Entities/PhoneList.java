package NewClasses.MyAddressBook.Entities;

import java.util.ArrayList;
import java.util.List;

public class PhoneList {
    
    private List <Phone> listaDeTelefones = new ArrayList<>();

    public PhoneList() {
    }

    public PhoneList(List<Phone> listaDeTelefones) {
        this.listaDeTelefones = listaDeTelefones;
    }

    public List<Phone> getListaDeTelefones() {
        return listaDeTelefones;
    }

    public void addPhoneNumber(Phone registro){
        listaDeTelefones.add(registro);
    }

    public void removePhoneNumber(Phone registro){
        listaDeTelefones.remove(registro);
    }
    
}
