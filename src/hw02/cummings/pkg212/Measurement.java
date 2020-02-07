/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw02.cummings.pkg212;

/**
 *
 * @author sunbe
 */
public class Measurement {

    double value = 0.0;
    String units = "";
    String valueWithUnits;

    public Measurement(double value, String units) {
        this.value = value;
        this.units = units;
        valueWithUnits = toString();
    }

    @Override
    public String toString() {

        String s = String.valueOf(getValue()) + " " + getUnits();
        return s;
    }

    /**
     * uses conversion equation found at
     * https://www.inchcalculator.com/convert/fahrenheit-to-celsius/
     *
     * @param fahrenheit temperature value in fahrenheit passed in
     * @return temperature value in celsius
     */

//To Implement! kph to mph method
    
    
    public int getIntValue() {

        return (int) Math.round(this.getValue());
    }

    public double getValue() {
        return value;
    }

    public String getUnits() {
        return units;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setUnits(String units) {
        this.units = units;
    }

}
