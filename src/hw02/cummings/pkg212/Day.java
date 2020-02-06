/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw02.cummings.pkg212;

/**
 *Represents a single day holds it's morning and night temperatures 
 * @author sunbe
 */
public class Day {
 private Measurement morningTemp;
   private Measurement middayTemp;
   
   public Day(Measurement morningTemp,Measurement middayTemp /**WeatherOrganizer weatherBot*/){
   this.morningTemp=morningTemp;
   this.middayTemp=middayTemp;
 // this.middayTemp=weatherBot.calculateMornToMid(weatherBot.getActiveDay());
   }
  

   //getters and setters
    public Measurement getMorningTemp() {
        return morningTemp;
    }

    public Measurement getMiddayTemp() {
        return this.middayTemp;
    }

    public void setMorningTemp(Measurement morningTemp) {
        this.morningTemp = morningTemp;
    }

    public void setMiddayTemp(Measurement middayTemp) {
        this.middayTemp = middayTemp;
    }
  public String giveWeather(){
    String s=" This morning it will be "+getMorningTemp()+ " and " +getMiddayTemp();
  return s;
  }
    
    
}
