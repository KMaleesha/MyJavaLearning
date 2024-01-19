package inheritance.phone;

public class newPhone extends  oldPhone{


    public static void main(String[]args){
        oldPhone myNewPhone = new oldPhone();
        myNewPhone.model = "iPhone";
        myNewPhone.color = "Gold";
        myNewPhone.ram = 124;
        myNewPhone.makeCall();
        myNewPhone.browseInternet();
    }

}
