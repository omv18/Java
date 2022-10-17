//Example of Single Inheritance 
class Shape {
    public void draw() {
        System.out.println("Draw is successfully");
    }
}

class Traingle extends Shape {
    public void calculate(int l,int h) {
        System.out.println("Area of traingle is = " + 0.5*l*h);
    } 
}

class Single {
    public static void main(String args[]) {
        Traingle ti = new Traingle();
        ti.draw();
        ti.calculate(2,4);
    }
}

