package oop;

import java.util.Scanner;

public class billing {
    String customerName;
    String itemName;
    int itemCount;
    int itemPrice;

    public void createBill(){
        Scanner item = new Scanner(System.in);

        customerName = item.nextLine();
        itemName = item.nextLine();
        itemCount = item.nextInt();
        itemPrice = item.nextInt();

        System.out.println("------------ Billing ---------------");
        System.out.println("Customer name : "+ customerName);
        System.out.println("Item Name : " +itemName);
        System.out.println("Item Count: "+ itemCount);
        System.out.println("Item Price : "+itemPrice);
        System.out.println("Total : "+ billAmount());
        System.out.println("------------ Discount ---------------");
        System.out.println("Discount : "+ discount());
        System.out.println("------------ Total ---------------");
        System.out.println("Payment : "+total());

    }

    public int billAmount(){
        return itemPrice*itemCount;
    }

    public int discount(){
        if(billAmount()>=1000){
            return (billAmount()/100)*10;
        }else{
            return 0;
        }
    }

    public int total(){
        return billAmount()-discount();
    }

    public static void main(String[] args){
        billing myBill = new billing();
        myBill.createBill();
    }
}
