package POO.Java;

/**
 * Main
 */
//Clase
public class Main {
public static void main(String[] args) {
    System.out.println("JAVA");

    Car car = new Car("Fiat","Fernando","32",19);
    car.printDataCar();
    //ESTE ES UN OBJETO DE LA CLASE -> CAR()
    Car car2 = new Car("Fiat","rocio","pedro",32);
    car.printDataCar();
    //ESTE ES UN OBJETO DE LA CLASE -> CAR()
    Car car3 = new Car("Fiat","rocio","pedro",32);
    car.printDataCar();

    
    
}}