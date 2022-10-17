//Java Class Program 
public class ClassDemo {
    public static void main(String args[]) {

        //OBJECT 1
        Mobile iPhone = new Mobile();
        iPhone.name = "iphone";
        iPhone.tax = 100;
        iPhone.price = 1000;
        iPhone.color = "red";

        System.out.println("iPhone price is : " + iPhone.getTotalPrice());

        //OBJECT 1
        Mobile Jio = new Mobile();
        Jio.name = "iphone";
        Jio.tax = 100;
        Jio.price = 1000;
        Jio.color = "red";

        System.out.println("Jio price is" + Jio.getTotalPrice());

    }
}

class Mobile {
     // var 
     int price;
     int tax;
     String color;
     String name;

     // Method 
     public int getTotalPrice() {
        return price+tax;
     }

     //Constructor
     //by default 
     Mobile() {
        
     }
}