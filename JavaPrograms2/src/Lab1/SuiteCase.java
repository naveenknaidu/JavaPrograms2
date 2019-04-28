package Lab1;

import java.text.DecimalFormat;

public class SuiteCase {
    //class variable
    private static int noOfSuiteCases = 0;

    //Instance Variables
    private String colour, material;
    private int wheels;
    private boolean cabin;
    private double price;

    //Default Constructor
    public SuiteCase() {
        noOfSuiteCases++;
    }//Default Constructor

    //Creating user defined constructor with all the parameters
    public SuiteCase(String pColour, String pMaterial, int pWheels, boolean pCabin, double pPrice) {
        colour = pColour;
        material = pMaterial;
        wheels = pWheels;
        cabin = pCabin;
        price = pPrice;
        noOfSuiteCases++;
    }//parametrerised constructor

    //Creating user defined constructor with 2 parameters passed
    public SuiteCase(String pColour, String pMaterial) {
        colour = pColour;
        material = pMaterial;
        wheels = 0;
        cabin = false;
        price = 0.00;
        noOfSuiteCases++;
    }// 2 parameters constructor

    //Creating user defined constructor with 2 mater passed
    public SuiteCase(String pColour, boolean pCabin) {
        colour = pColour;
        cabin = pCabin;
        material = "UnKnown";
        wheels = 0;
        price = 0.00;
        noOfSuiteCases++;
    }// 2 parameters constructor

    //Creating getters
    public String getColour() {
        return colour;
    }//getColour

    public String getMaterial() {
        return material;
    }//getMaterial

    public boolean getCabin() {
        return cabin;
    }//get Cabin

    public int getWheels() {
        return wheels;
    }//getwheels

    public double getPrice() {
        return price;
    }//getprice

    //Creating setters
    public void setColour(String pColour) {
        colour = pColour;
    }//setcolour

    public void setMaterial(String pMaterial) {
        material = pMaterial;
    }//setmaterial

    public void setCabin(boolean pCabin) {
        cabin = pCabin;
    }//setcabin

    public void setWheels(int pWheels) {
        wheels = pWheels;
    }//setwheels

    public void setPrice(double pPrice) {
        price = pPrice;
    }//setprice

    //Print Method
    public void printValue() {
        DecimalFormat df = new DecimalFormat("$00.00");
        System.out.println("I own a " + colour + "," + material + "Suitecase");
        System.out.println("It has " + wheels + " wheels");
        System.out.println("It cost me " + df.format(price));
        if (cabin) {
            System.out.println("It is cabin friendly");
        } else
            System.out.println("It is not cabin friendly");
    }//print method

    //preferable print method
    public String toString() {
        DecimalFormat df = new DecimalFormat("£00.00");

        String temp;
        temp = "***************************************";
        temp = temp + "\nThis is a " + colour + "," + material + "suitecase\n";
        temp = temp + "It has " + wheels + " wheels\n";
        temp = temp + "It cost " + df.format(price) + "\n";
        if (cabin) {
            temp = temp + "It is cabin friendly\n";
        } else temp = temp + "It is not cabin friendly\n";
        temp = temp + "*********************************";
        return temp;

    }
    //Static variables
    public static int getNoOfSuiteCases(){
        return noOfSuiteCases;
    }
    public static void PrintNoOfSuitCases(){
        System.out.println("We have built " + noOfSuiteCases + "suitecases");
    }
    public static void printNoOfSuitCases1(){
        System.out.println("We have built " + getNoOfSuiteCases() + "suiitecases");
    }


}//class
