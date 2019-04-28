package Lab1;

/**
 * Created By: Naveen Krishna
 * Created on: 02/04/2019
 * program prints all the car attributes mentioned in this car class
 */

public class Car {

    //Instance Variables
    private int id;
    private String make;
    private String ownerName;
    private String colour;
    private int yearOfManufacture;
    private int topSpeed;
    private double costPrice;

    //Building the default constructor
    public Car() {

    }//Default constructor method

    //Building constructor 1
    public Car(int nId, String nMake, String nOwnerName, String nColour, int nYearOfManufacture, int nTopSpeed, double nCostPrice) {
        id = nId;
        make = nMake;
        ownerName = nOwnerName;
        colour = nColour;
        yearOfManufacture = nYearOfManufacture;
        topSpeed = nTopSpeed;
        costPrice = nCostPrice;
    }// constructor 1

    //Building constructor 2
    public Car(int mId, String mMake, String mOwnerName, String mColour) {
        id = mId;
        make = mMake;
        ownerName = mOwnerName;
        colour = mColour;
        yearOfManufacture = 2019;
        topSpeed = 280;
        costPrice = 25750.50;
    }//constructor 2

    //Building constructor 3
    public Car(int kId, String kOwnerName, int kTopSpeed) {
        id = kId;
        make = "Nissan";
        ownerName = kOwnerName;
        colour = "Red";
        yearOfManufacture = 2019;
        topSpeed = kTopSpeed;
        costPrice = 25750.50;
    }//constructor 3

    //Creating a print car info menthod
    public void printCarInfo() {
        System.out.println("This car id is : " + id);
        System.out.println("The make of the car is: " + make);
        System.out.println("The owner of the car is: " + ownerName);
        System.out.println("The colour of the car is: " + colour);
        System.out.println("The year of manufacture of the car is: " + yearOfManufacture);
        System.out.println("The top speed of the car is: " + topSpeed);
        System.out.println("The cost of the car is: " + costPrice);
    }//print car info method

    //Creating the get methods
    public int getId() {
        return id;
    }//getId

    public String getMake() {
        return make;
    }//getMake

    public String getOwnerName() {
        return ownerName;
    }//getOwnerName

    public String getColour() {
        return colour;
    }//getColour

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }//getYearOfManufacture

    public int getTopSpeed() {
        return topSpeed;
    }

    public double getCostPrice() {
        return costPrice;
    }//getCostPrice


    //Creating setting methods
    public void setId(int myId) {
        id = myId;
    }//setId

    public void setMake(String myMake) {
        make = myMake;
    }//setMake

    public void setOwnerName(String myOwnerName) {
        ownerName = myOwnerName;
    }//setOwnerName

    public void setColour(String myColour) {
        colour = myColour;
    }//setColour

    public void setYearOfManufacture(int myYearOfManufacture) {
        yearOfManufacture = myYearOfManufacture;
    }//setyearOfManufacture

    public void setTopSpeed(int myTopSpeed) {
        topSpeed = myTopSpeed;
    }//setTopSpeed

    public void setCostPrice(double myCostPrice) {
        costPrice = myCostPrice;
    }//setCostPrice

}//car class
