/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw02.cummings.pkg212;

/**
 * Represents a single day holds it's morning and night temperatures
 *
 * @author sunbe
 */
public class Day {

    private Tempeture morningTemp;
    private Tempeture middayTemp;

    public Day(Tempeture morningTemp, Tempeture middayTemp) {
        this.morningTemp = morningTemp;
        this.middayTemp = middayTemp;
        // this.middayTemp=weatherBot.calculateMornToMid(weatherBot.getActiveDay());
    }

    //getters and setters
    public Tempeture getMorningTemp() {
        return morningTemp;
    }

    public Tempeture getMiddayTemp() {
        return this.middayTemp;
    }

    public void setMorningTemp(Tempeture morningTemp) {
        this.morningTemp = morningTemp;
    }

    public void setMiddayTemp(Tempeture middayTemp) {
        this.middayTemp = middayTemp;
    }

    public String giveWeather() {//i think it said that when printing it should only print ints
        String s = " This morning it will be " + getMorningTemp().getIntValue() +getMorningTemp().getUnits()+" "
                + getMorningTemp().toCelsius().getIntValue()+getMorningTemp().toCelsius().getUnits()
                + " and " + getMiddayTemp().getIntValue() + " " +getMiddayTemp().getUnits()
                + getMiddayTemp().toCelsius().getIntValue()+" "+getMiddayTemp().toCelsius().getUnits();
        return s;
    }

}
