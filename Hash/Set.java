import java.util.HashSet;

public class Set {
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add(null);
    cars.add(null);
    cars.add(null);
    System.out.println(cars);
  }
}