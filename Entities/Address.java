package NewClasses.MyAddressBook.Entities;

public class Address {
    
    private String street;
    private String number;
    private String complement;
    private String neighborhood;
    private String city;
    private String state;
    private String zipcode;

    public Address(String street, String number, String complement, String neighborhood, String city, String state,
            String zipcode) {
        this.street = street;
        this.number = number;
        this.complement = complement;
        this.neighborhood = neighborhood;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getStreet() {
        return street;
    }

    public String getNumber() {
        return number;
    }

    public String getComplement() {
        return complement;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void showAddress(){

        System.out.println(" [Rua]  " + getStreet().substring(0, 1).toUpperCase() + getStreet().substring(1));
        System.out.println(" [Número]  " + getNumber());
        System.out.println(" [Complemento]  " + getComplement().substring(0, 1).toUpperCase() + getComplement().substring(1));
        System.out.println(" [Bairro]  " + getNeighborhood().substring(0, 1).toUpperCase() + getNeighborhood().substring(1));
        System.out.println(" [Cidade]  " + getCity().substring(0, 1).toUpperCase() + getCity().substring(1));
        System.out.println(" [Estado]  " + getState().toUpperCase());
        System.out.println(" [CEP]  " + getZipcode());

    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((street == null) ? 0 : street.hashCode());
        result = prime * result + ((number == null) ? 0 : number.hashCode());
        result = prime * result + ((complement == null) ? 0 : complement.hashCode());
        result = prime * result + ((neighborhood == null) ? 0 : neighborhood.hashCode());
        result = prime * result + ((city == null) ? 0 : city.hashCode());
        result = prime * result + ((state == null) ? 0 : state.hashCode());
        result = prime * result + ((zipcode == null) ? 0 : zipcode.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Address other = (Address) obj;
        if (street == null) {
            if (other.street != null)
                return false;
        } else if (!street.equals(other.street))
            return false;
        if (number == null) {
            if (other.number != null)
                return false;
        } else if (!number.equals(other.number))
            return false;
        if (complement == null) {
            if (other.complement != null)
                return false;
        } else if (!complement.equals(other.complement))
            return false;
        if (neighborhood == null) {
            if (other.neighborhood != null)
                return false;
        } else if (!neighborhood.equals(other.neighborhood))
            return false;
        if (city == null) {
            if (other.city != null)
                return false;
        } else if (!city.equals(other.city))
            return false;
        if (state == null) {
            if (other.state != null)
                return false;
        } else if (!state.equals(other.state))
            return false;
        if (zipcode == null) {
            if (other.zipcode != null)
                return false;
        } else if (!zipcode.equals(other.zipcode))
            return false;
        return true;
    }

    
    

}
