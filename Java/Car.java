package POO.Java;
//ESTE ES LA CLASE CAR
public class Car {
    String marca; //METODOS
    Integer id ;  //ATRIBUTOS
    String matricula;
    String dueño;
    Integer pasajeros; 

    public Car(String marca, String dueño , String matricula , Integer pasajeros){ //METODO CONSTRUCTOR
        this.dueño = dueño;
        this.matricula = matricula;
        this.marca = marca;
    
    }

    void printDataCar(){
        System.out.println("License: " + matricula + "Dueño" + dueño);
    }
}
