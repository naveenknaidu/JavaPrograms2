package Lab2;

/**
 * Created by: Naveen Krishna
 * Created on: 09/04/2019
 * This program prints height, width and depth and calculate the volume of the box
 */

public class CardboardBox {
    private double width;
    private double height;
    private double depth;
    private String colour;
    private static int noOfBoxes = 0;

    public CardboardBox() {
        noOfBoxes++;
    }//default constructor
    public CardboardBox(double pWidth, double pHeight, double pDepth, String pColour){
        width=pWidth;
        height=pHeight;
        depth=pDepth;
        colour=pColour;
        noOfBoxes++;
    }//Parametrized constructor1
    public CardboardBox(double nWidth, double nHeight, double nDepth){
        width=nWidth;
        height=nHeight;
        depth=nDepth;
        noOfBoxes++;
    }//Parametrized constructor2
    //get methods
    public double getWidth(){
        return width;
    }//getwidth
    public double getHeight(){
        return height;
    }//getheight
    public double getDepth(){
        return depth;
    }//getdepth
    public String getColour(){
        return colour;
    }//getcolour

}//class
