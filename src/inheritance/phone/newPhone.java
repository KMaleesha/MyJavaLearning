package inheritance.phone;

public class newPhone extends  oldPhone{

    public static void main(String[]args){
        oldPhone myNewPhone = new oldPhone();
        myNewPhone.makeCall();
        myNewPhone.browseInternet();
    }

}
