package NewClasses.MyAddressBook.Entities;

import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class FileContact {
    
    private Name nome;
    private PhoneList listaDeTelefones;
    private Address endereco;
    private EmailList listaDeEmails;
    private Birthday data;
    private Zodiac signo;
    private Instagram perfilInstagram;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd - MMMM - yyyy", Locale.of("pt", "BR"));


    public FileContact() {
    }

    public FileContact(Name nome, PhoneList listaDeTelefones, Address endereco, 
        EmailList listaDeEmails, Birthday data, Instagram perfilInstagram) {
        
        this.nome = nome;
        this.listaDeTelefones = listaDeTelefones;
        this.endereco = endereco;
        this.listaDeEmails = listaDeEmails;
        this.data = data;
        Zodiac sign = new Zodiac(data.getData());
        this.signo = sign;
        this.perfilInstagram = perfilInstagram;
    }


    public Name getNome() {
        return nome;
    }

    public Address getEndereco() {
        return endereco;
    }

    public Birthday getData() {
        return data;
    }

    public Zodiac getSigno() {
        return signo;
    }

    public Instagram getPerfilInstagram() {
        return perfilInstagram;
    }

    public PhoneList getListaDeTelefones() {
        return listaDeTelefones;
    }

    public EmailList getListaDeEmails() {
        return listaDeEmails;
    }

    

    public void showContact(){

        System.out.println("\n\n--------------------------------------------------------");
        System.out.println("                          NOME                          ");
        System.out.println("--------------------------------------------------------");
        System.out.println(  " " + getNome().getNome().substring(0, 1).toUpperCase() + getNome().getNome().substring(1));
        System.out.println("--------------------------------------------------------");
        System.out.println("                        TELEFONE                        ");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < getListaDeTelefones().getListaDeTelefones().size(); i++){
            System.out.println(" [ "+ getListaDeTelefones().getListaDeTelefones().get(i).getTipo() + " ]  " + getListaDeTelefones().getListaDeTelefones().get(i).getNumber());
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("                        ENDEREÇO                        ");
        System.out.println("--------------------------------------------------------");
        getEndereco().showAddress();
        System.out.println("--------------------------------------------------------");
        System.out.println("                         E-MAIL                         ");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < getListaDeEmails().getListaDeEmail().size(); i++){
            System.out.println(" [" + (i+1) + "]  " + getListaDeEmails().getListaDeEmail().get(i).getEmail());
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("                       ANIVERSÁRIO                      ");
        System.out.println("--------------------------------------------------------");
        String dataFormatada = formatter.format(getData().getData()).toUpperCase();
        System.out.println(" DATA: " + dataFormatada);
        System.out.println(" IDADE: " + getData().getIdade());
        System.out.println(" SIGNO: " + getSigno().getSign().substring(0, 1).toUpperCase() +  getSigno().getSign().substring(1));
        System.out.println("--------------------------------------------------------");
        System.out.println("                        INSTAGRAM                       ");
        System.out.println("--------------------------------------------------------");
        System.out.println(" @" + getPerfilInstagram().getInstagramProfile());
        System.out.println("--------------------------------------------------------\n\n");
    }
    
}
