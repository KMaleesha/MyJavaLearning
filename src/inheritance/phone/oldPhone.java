package inheritance.phone;

public class oldPhone {
    String model;
    String color;
    int ram;

    public void makeCall(){
        System.out.println("take a call from "+color +" "+model);
    }
    public void browseInternet(){
        System.out.println("Browse internet from "+model+" with "+ram+"GB");
    }

    public static void main(String[] args){
        oldPhone myphone = new oldPhone();
        myphone.model = "iPhone";
        myphone.color = "Rose Gold";
        myphone.ram = 64;

        myphone.browseInternet();
        myphone.makeCall();
    }
}
