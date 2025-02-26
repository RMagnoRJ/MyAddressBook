package NewClasses.MyAddressBook.Entities;
import java.time.LocalDate;
import java.time.Period;

public class Birthday {
    
    private LocalDate data;
    private String idade;

    public Birthday(LocalDate data) {
        this.data = data;

        if(data.getYear() == 1900){
            this.idade = "Ano não informado";
        } else {
            LocalDate dataAtual = LocalDate.now();
            Period periodo = Period.between(data, dataAtual);
            this.idade = Integer.toString(periodo.getYears());
        }
    }

    public LocalDate getData() {
        return data;
    }

    public String getIdade() {
        return idade;
    }

}
