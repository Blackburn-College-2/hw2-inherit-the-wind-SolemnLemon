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
public class Length extends Measurement {
    public Length(Double value, String Unit){
  super(value,Unit);
      
  }
    public Length toCentimeters() {
        return new Length(this.getValue()*2.54, " cm");
    }
}
