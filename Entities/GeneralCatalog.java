package NewClasses.MyAddressBook.Entities;

import java.util.ArrayList;
import java.util.List;

public class GeneralCatalog {
    
    List <FileContact> catalogoDeContatos = new ArrayList<>();

    public GeneralCatalog() {
    }

    public GeneralCatalog(List<FileContact> catalogoDeContatos) {
        this.catalogoDeContatos = catalogoDeContatos;
    }

    public List<FileContact> getCatalogoDeContatos() {
        return catalogoDeContatos;
    }

    public void addContato(FileContact contato){
        catalogoDeContatos.add(contato);
    }

    public void removeContato(FileContact contato){
        catalogoDeContatos.remove(contato);
    }
    
    
}
