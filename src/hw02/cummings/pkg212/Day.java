/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw02.cummings.pkg212;

/**
 * Represents a single day holds it's morning and night temperatures and all extra weather details
 *
 *
 * @author sunbe
 */
public class Day {

    private Tempeture morningTemp;
    private Tempeture middayTemp;

   
    Wind wind;

    Cloud cloudLevel;
    Percipitation percip;

    public Day() {
    
    }
/**
 * generates weather patterns that affect the same temp same day
 */
    public void generateMiddayWeather() {

        this.cloudLevel = new Cloud();
    }
     public Wind getWind() {
        return wind;
    }

    public Percipitation getPercip() {
        return percip;
    }

    /**
     * generates the weather patterns that affect the next day's temp
     */
    public void generateNextWeather() {

        this.wind = new Wind();
        //assignment sheet does not specify so i'm going to using freezing temp as a margin for if it's snow or rain
        if (getMiddayTemp().getValue() > 0) {
            percip = new Rain();
        } else {
            this.percip = new Snow();

        }
    }
/**
 * return weather report for the day instance
 * @return 
 */
    public String giveWeather() {
        String s = " This morning it will be " + getMorningTemp().toFahrenheit().getIntValue() + getMorningTemp().toFahrenheit().getUnits() + " "
                + getMorningTemp().getIntValue() + getMorningTemp().getUnits()
                + " and by mid day it will be " + getMiddayTemp().toFahrenheit().getIntValue() + " " + getMiddayTemp().toFahrenheit().getUnits()
               +" " + getMiddayTemp().getIntValue() + " " + getMiddayTemp().getUnits()+
               "\n "+ " Clouds will be "+getCloudLevel().getCloudLevel()+"\n"+
                "Wind will be coming from the "+getWind().getDirection()+
                " it will  be going at "+getWind().getSpeed().getIntValue()+" or";
        
        //seemed to get weird issues with making String S go beyond that point overflow issue?
           
                       
        return s;
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

    public Cloud getCloudLevel() {
        return cloudLevel;
    }


}
