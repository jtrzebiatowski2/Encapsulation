/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author J-Tron
 */
public class Part {
    private String partNumber;
    private String partDescription;
    private double partPrice;

    public Part() {
    }
    
    public Part(String partNumber, String partDescription, double partPrice) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.partPrice = partPrice;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public void setPartPrice(double partPrice) {
        this.partPrice = partPrice;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public double getPartPrice() {
        return partPrice;
    }
    
    
    
    

}
