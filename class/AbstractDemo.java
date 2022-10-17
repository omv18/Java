class AbstractDemo {
    public static void main(String[] args) {
        Showroom sh = new Showroom();
        sh.display(new Audi());
        sh.display(new BMW());
    }
}

class Showroom {
    void display(Car c) {
        c.autoStart();
        c.autoStop();
    }
}

//Abstract Class
abstract class Car {
    abstract void autoStart();
    abstract void autoStop();
} 

class Audi extends Car{
    void autoStart() {
        System.out.println("Inside AUDI car - Auto Start");
    }

    void autoStop() {
        System.out.println("Inside AUDI car - Auto Stop");
    }
}

class BMW extends Car{
    void autoStart() {
        System.out.println("Inside BMW car - Auto Start");
    }

    void autoStop() {
        System.out.println("Inside BMW car - Auto Stop");
    }
}