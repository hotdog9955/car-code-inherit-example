class Vehicle{
    String make;
    String model;
    int year;

    Vehicle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayInfo(){
        System.out.println(this);
    }

    @Override
    public String toString(){
        return String.format("Make: %s Model: %s Year: %d", make, model, year);
    }
}

class Car extends Vehicle{
    int numberOfDoors;

    Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString(){
        return String.format("Make: %s Model: %s Year: %d Doors: %s", make, model, year, numberOfDoors);
    }
}

class Motorcycle extends Vehicle{
    int engineCapacity;

    Motorcycle(String make, String model, int year, int engineCapacity){
        super(make, model, year);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString(){
        return String.format("Make: %s Model: %s Year: %d EngineCapacity: %d", make, model, year, engineCapacity);
    }
}

class Truck extends Vehicle{
    int payloadCapacity;

    Truck(String make, String model, int year, int payloadCapacity){
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }


    @Override
    public String toString(){
        return String.format("Make: %s Model: %s Year: %d PayloadCapacity: %d", make, model, year, payloadCapacity);
    }
}

public class Main {
    public static void main(String[] args){
        Car car = new Car("Honda","Civic",2007,2);
        Motorcycle motorcycle = new Motorcycle("Honda", "Grom", 2021, 125);
        Truck truck = new Truck("Toyota", "Tacoma", 2019, 1230);

        car.displayInfo();
        motorcycle.displayInfo();
        truck.displayInfo();
    }
}