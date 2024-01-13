package oop;

public class phone {
    String name;
    String model;
    String modelId;
    int price;
    String color;
    int ram;

    public void call(){
        System.out.println("Dial the number from " + color+" "+ name);
    }

    public void browseInternet(){
        System.out.println("To browse you need "+ ram +"GB");
    }

    public static void main(String[]args){
        phone myPhone = new phone();
        myPhone.name = "iPhone";
        myPhone.color = "Black";
        myPhone.ram = 64;

        myPhone.call();
        myPhone.browseInternet();

    }
}
