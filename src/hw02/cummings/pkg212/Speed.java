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
public class Speed extends Measurement{
    public Speed(Double value, String Unit){
  super(value,Unit);
      
  }
    
    public Speed toMPH() {
    
        return new Speed(this.getValue()/1.609," mph");
    }
    
    
}
