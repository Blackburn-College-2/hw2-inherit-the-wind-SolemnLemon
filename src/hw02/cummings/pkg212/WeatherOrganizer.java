/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw02.cummings.pkg212;

import java.util.Random;

/**
 * creates base temp and catalogs changes between days and manage conditionals
 * conditionals are small changes to temp due to randomly determined weather
 * conditions
 *
 * @author sunbe
 */
public class WeatherOrganizer {

    public Random random = new Random();

    private Day[] days = new Day[9];
    private Tempeture startTemp;

    private double mornToMidModifier = 0.0;
    private double midToMornModifier = 0.0;
    private int activeDay = 0;

    public WeatherOrganizer() {
        //main will basically just call this and fuckkin nothing else
        createStartTemp();
        //get10Day()[0].setMorningTemp(getStartTemp());

        System.out.println("Weather bot 1.0 starting...");
        calculate10Day();
    }

    /**
     * calculates the midday temp using the morning temp and the modifiers which
     * are based on randomly determined conditionals
     *
     * @param activeDay current day being set
     * @return midday temp
     */
    public Tempeture calculateMornToMid(Tempeture morn) {

        return new Tempeture(morn.getValue() + getMornToMidModifier(), "F");

    }

    /**
     * calculates the morning temp using the last day's midday temp and the
     * modifiers which are based on randomly determined conditionals
     *
     * @param activeDay current day being set
     * @return morning temp
     */
    public Tempeture calculateMidtoMorn(Tempeture mid) {
        //only works on not day 1
        return new Tempeture(mid.getValue() + getMidToMornModifier(), " F");

    }

    /**
     * this is the thicc boi that does everything really
     */
    public void calculate10Day() {
        int activeDay = 0;
        

        System.out.println(getStartTemp().toString());
        setDay(activeDay, new Day(getStartTemp(), calculateMornToMid(getStartTemp())));
        activeDay++;
        while (activeDay < get10Day().length) {

            Tempeture mornTemp = calculateMidtoMorn(get10Day()[activeDay - 1].getMiddayTemp());
            Tempeture midTemp = calculateMornToMid(mornTemp);

            setDay(activeDay, new Day(mornTemp, midTemp));

            System.out.println("Day: " + activeDay + " " + get10Day()[activeDay].giveWeather());
            activeDay++;
        }
    }

    public void manageConditionals(){
    Wind windConditions=new Wind(this);
    
    }
    
    public void createStartTemp() {
        setStartTemp(new Tempeture((double)random.nextInt(20) + 40, " F"));

    }

    /**
     * sets start temp to the passed in value
     *
     * @param startTemp
     */
    public void setStartTemp(Tempeture startTemp) {
        this.startTemp = startTemp;
    }

    public Tempeture getStartTemp() {
        return this.startTemp;
    }

    public Day getDay(int day) {
        return get10Day()[day];
    }

    public void setDay(int day, Day value) {
        get10Day()[day] = value;
    }

    public Day[] get10Day() {
        return days;
    }

    public void set10day(Day[] weekTemp) {
        this.days = weekTemp;
    }

    public double getMornToMidModifier() {
        return mornToMidModifier;
    }

    public double getMidToMornModifier() {
        return midToMornModifier;
    }

    public void setMornToMidModifier(double mornToMidModifier) {
        this.mornToMidModifier = mornToMidModifier;
    }

    public void setMidToMornModifier(double midToMornModifier) {
        this.midToMornModifier = midToMornModifier;
    }

    public int getActiveDay() {
        return activeDay;
    }

    public void setActiveDay(int activeDay) {
        this.activeDay = activeDay;
    }
}
