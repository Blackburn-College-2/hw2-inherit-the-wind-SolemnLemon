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
public class Tempeture extends Measurement {
    
  public Tempeture(Double value, String Unit){
  super(value,Unit);
      
  }
    public Tempeture toFahrenheit() {
        return new Tempeture((this.getValue()*9/5)+32, " F");
    }
}
