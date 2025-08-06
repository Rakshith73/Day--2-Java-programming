class Bike {
    String brand, type;
    int engineCapacity;

    Bike(String brand, int engineCapacity, String type) {
        this.brand = brand;
        this.engineCapacity = engineCapacity;
        this.type = type;
    }

    public void displayBikeDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Engine Capacity: " + engineCapacity + "cc");
        System.out.println("Type: " + type);
    }
}

class SportsBike extends Bike {
    SportsBike(String brand, int engineCapacity, String type) {
        super(brand, engineCapacity, type);
        System.out.println("This is a high-performance sports bike: " + brand);
    }
}

public class BikeDemo {
    public static void main(String[] args) {
        SportsBike myBike = new SportsBike("Yamaha R15", 155, "Sport");
        myBike.displayBikeDetails();
    }
}
