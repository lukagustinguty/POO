package POO.Java;
//ESTE ES LA CLASE CAR
public class Car {
    String marca; //METODOS
    Integer id ;  //ATRIBUTOS
    String matricula;
    String dueño;
    Integer pasajeros; 

    void printDataCar(){
        System.out.println("License: " + matricula + "Dueño" + dueño);
    }
}
