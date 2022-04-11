package POO.Java;

/**
 * Main
 */
//Clase
public class Main {
public static void main(String[] args) {
    System.out.println("JAVA");

    Car car = new Car();
    car.marca = "Peugeout208";
    car.dueño = "Roberto Copa";
    car.matricula ="JOZ728";
    car.pasajeros = 4;
    car.printDataCar();
    //ESTE ES UN OBJETO DE LA CLASE -> CAR()
    Car car2 = new Car();
    car.marca = "Fiat";
    car.dueño = "Rocio Copa";
    car.matricula ="PEG342";
    car.pasajeros = 2;
    car.printDataCar();
    //ESTE ES UN OBJETO DE LA CLASE -> CAR()
    Car car3 = new Car();
    car.marca = "FORD";
    car.dueño = "Camila Galleguillos";
    car.matricula ="P2EW342";
    car.pasajeros = 2;
    car.printDataCar();

    
    
}}