package NewClasses.MyAddressBook.Application;

import java.time.LocalDate;
import java.util.Scanner;

import NewClasses.MyAddressBook.Entities.Address;
import NewClasses.MyAddressBook.Entities.Birthday;
import NewClasses.MyAddressBook.Entities.Email;
import NewClasses.MyAddressBook.Entities.EmailList;
import NewClasses.MyAddressBook.Entities.FileContact;
import NewClasses.MyAddressBook.Entities.Instagram;
import NewClasses.MyAddressBook.Entities.Name;
import NewClasses.MyAddressBook.Entities.Phone;
import NewClasses.MyAddressBook.Entities.PhoneList;
import NewClasses.MyAddressBook.Services.GeneralFunctions;

public class Program {
    public static void main(String[] args) {
        Scanner inn = new Scanner (System.in);
        GeneralFunctions function = new GeneralFunctions();
        boolean continua = true;
        System.out.println("\n\n");
        FileContact novoContato = new FileContact();

        System.out.println("\n\n--------------------------------------------------------");
        System.out.println("                         AGENDA                         ");
        System.out.println("--------------------------------------------------------\n");
        System.out.print("Nome: ");
        String nome = inn.nextLine();
        Name nomeDoContato = new Name(nome);
        System.out.println("\n--------------------------------------------------------");
        System.out.println("                        TELEFONE                        ");
        System.out.println("--------------------------------------------------------\n");
        PhoneList listaDeTelefones = new PhoneList();
        Phone registro;
        while (continua == true){
            System.out.println("\nEscolha o tipo:\n"+
            "[1] Celular\n"+
            "[2] Residencial\n"+
            "[3] Comercial");
            int tipo = function.recebeIntMinMaxVariavel(">", 1, 3);
            System.out.print("\nNumero: ");
            String numeroDoContato = inn.nextLine();
            String tipoStr;
            
            if (tipo == 1){
                tipoStr = "Celular";
                registro = new Phone(tipoStr, numeroDoContato);
                listaDeTelefones.addPhoneNumber(registro);
                
            } else if (tipo == 2){
                tipoStr = "Residencial";
                registro = new Phone(tipoStr, numeroDoContato);
                listaDeTelefones.addPhoneNumber(registro);
            } else {
                tipoStr = "Comercial";
                registro = new Phone(tipoStr, numeroDoContato);
                listaDeTelefones.addPhoneNumber(registro);
            }
            System.out.println("\nDeseja cadastrar outro número?\n"+
            "[1] Sim\n"+
            "[2] Não");
            int outroNumero = function.recebeIntMinMaxVariavel("> ", 1, 2);
            if(outroNumero == 1){
                continua = true;
            } else {
                continua = false;
            }
        }
        System.out.println("\n--------------------------------------------------------");
        System.out.println("                        ENDEREÇO                        ");
        System.out.println("--------------------------------------------------------\n");
        System.out.print("Rua: ");
        String rua = inn.nextLine();
        System.out.print("Número: ");
        String numero = inn.nextLine();
        System.out.print("Complemento: ");
        String complemento = inn.nextLine();
        System.out.print("Bairro: ");
        String bairro = inn.nextLine();
        System.out.print("Cidade: ");
        String cidade = inn.nextLine();
        System.out.print("Estado (UF): ");
        String estado = inn.nextLine();
        System.out.print("CEP: ");
        String cep = inn.nextLine();

        Address endereco = new Address(rua, numero, complemento, bairro, cidade, estado, cep);
        System.out.println("\n--------------------------------------------------------");
        System.out.println("                         E-MAIL                         ");
        System.out.println("--------------------------------------------------------\n");
        continua = true;
        EmailList listaDeEmails = new EmailList();
        Email correioEletronico;
        while (continua == true){

            System.out.print("\nE-mail: ");
            String email = inn.nextLine();
            correioEletronico = new Email(email);
            listaDeEmails.addEmail(correioEletronico);
            System.out.println("\nDeseja cadastrar outro e-mail?\n"+
            "[1] Sim\n"+
            "[2] Não");
            int outroEmail = function.recebeIntMinMaxVariavel("> ", 1, 2);
            if(outroEmail == 1){
                continua = true;
            } else {
                continua = false;
            }
        }
        System.out.println("\n--------------------------------------------------------");
        System.out.println("                       ANIVERSÁRIO                      ");
        System.out.println("--------------------------------------------------------\n");
        Birthday dataNascimento;
        System.out.println("Selecione:\n"+
        "[1] Data de nascimento (dia/mes/ano)\n"+
        "[2] Aniversário (dia/mês)");
        int escolheData = function.recebeIntMinMaxVariavel("> ", 1, 2);
        if (escolheData == 1){
            System.out.print("\nDia: ");
            int dia = inn.nextInt(); inn.nextLine();
            System.out.print("Mês: ");
            int mes = inn.nextInt(); inn.nextLine();
            System.out.print("Ano: ");
            int ano = inn.nextInt(); inn.nextLine();
            LocalDate nascimento = LocalDate.of(ano, mes, dia);
            dataNascimento = new Birthday(nascimento);
        } else {
            System.out.print("\nDia: ");
            int dia = inn.nextInt(); inn.nextLine();
            System.out.print("Mês: ");
            int mes = inn.nextInt(); inn.nextLine();
            LocalDate aniversario = LocalDate.of(1900, mes, dia);
            dataNascimento = new Birthday(aniversario);
        }
        System.out.println("\n--------------------------------------------------------");
        System.out.println("                        INSTAGRAM                       ");
        System.out.println("--------------------------------------------------------\n");
        System.out.print("Instagram: @");
        String instagramStr = inn.nextLine();
        Instagram perfilInstagram = new Instagram(instagramStr);

        novoContato = new FileContact(nomeDoContato, listaDeTelefones, endereco, listaDeEmails, dataNascimento, perfilInstagram);
        novoContato.showContact();
        inn.close();
    }
}
