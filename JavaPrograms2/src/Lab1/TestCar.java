package Lab1;

/**
 * Created By: Naveen Krishna
 * Created on: 02/04/2019
 * program prints all the car attributes mentioned in this car class by testing the car class from this class
 */

public class TestCar {
    public static void main(String[] args) {
        Car myCar;
        Car sistersCar;
        Car bossCar;
        Car aCar;
        Car bCar;
        Car myEncap = new Car();

        myCar = new Car();
        sistersCar = new Car(100, "Ford", "My Sister Mary", "Red", 2008, 105, 10995.00);
        bossCar = new Car(101, "Honda", "Pat Bell", "Silver", 2011, 210, 27500.00);
        aCar = new Car(102, "Ford", "Janet Allison", "Red");
        bCar = new Car(103, "John Smith", 100);
        myCar.printCarInfo();
        sistersCar.printCarInfo();
        bossCar.printCarInfo();
        aCar.printCarInfo();
        bCar.printCarInfo();

        //Printing encapsulation
        myEncap.setId(1001);
        myEncap.setMake("Nissan Micra");
        myEncap.setOwnerName("Naveen K Medisetti");
        myEncap.setColour("Blue");
        myEncap.setYearOfManufacture(2019);
        myEncap.setTopSpeed(280);
        myEncap.setCostPrice(27570.56);
        System.out.println(" The car id: " + myEncap.getId() + "\n Make of the car is: " + myEncap.getMake()
                + "\n Owner of the car is: " + myEncap.getOwnerName() + "\n Colour of the car is: " + myEncap.getColour()
                + "\n The year of the manufacture is: " + myEncap.getYearOfManufacture() + "\n The top speed of the car is: " + myEncap.getTopSpeed()
                + "\n The cost price of the car is: " + myEncap.getCostPrice());

        //3.5
        bCar.setMake("Vauxhall");
        bCar.setOwnerName("James Rodgers");
        bCar.setYearOfManufacture(2018);
        bCar.setCostPrice(256700);
        System.out.println(" The car make is: " + bCar.getMake() + "\n The owner of the car is: " + bCar.getOwnerName() +
                "\n The car year of manufacture is: " + bCar.getYearOfManufacture() + "\n The price of the car is: "
                + bCar.getCostPrice());

    }//main method

}//class
