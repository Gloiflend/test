public class Payer {
     String surname;
     String name;
     String address;
     String cardNumber;
     public void setSurname(String Surname){
        this.surname= surname;
    }
    public String getSurname(){
        return surname;
    }
    public void setName(String name){
        this.name= name;
    }
    public String getName(){
        return name;
    }
    public void setAddress(String address){
        this.address=address;
    }

    public String getAddress() {
        return address;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }
    public String toString() {
        return "Payer: " + surname + " " + name + ", address: " + address + ", card: " + cardNumber;
    }
}