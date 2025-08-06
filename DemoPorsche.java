class Car {
    String nameofCompany;
    boolean isAvailable;

    Car(String nameofCompany, boolean isAvailable) {
        this.nameofCompany = nameofCompany;
        this.isAvailable = isAvailable;
    }

    public void getCarDetails() {
        System.out.println("Company: " + nameofCompany);
        System.out.println("Availability: " + isAvailable);
    }
}

class Porsche extends Car {
    String carName, modelName, color;

    Porsche(String carName, String modelName, String color) {
        super("Porsche", true);
        this.carName = carName;
        this.modelName = modelName;
        this.color = color;
    }

    public void displayCarModel() {
        System.out.println("Name of the car: " + carName);
        System.out.println("Model: " + modelName);
        System.out.println("Color: " + color);
    }
}

public class DemoPorsche {
    public static void main(String[] args) {
        Porsche c2 = new Porsche("Porsche", "911 Turbo S", "Red");
        c2.getCarDetails();
        c2.displayCarModel();
    }
}
