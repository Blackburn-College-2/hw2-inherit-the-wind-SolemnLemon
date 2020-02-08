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
 * 
 *
 * @author sunbe
 */
public class WeatherOrganizer {

    public Random random = new Random();

    private Day[] days = new Day[10];
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

        return new Tempeture(morn.getValue() + getMornToMidModifier(), "C");

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
        return new Tempeture(mid.getValue() + getMidToMornModifier(), " C");

    }

    /**
     * this is the thicc boi that does everything really
     * 
     */
    public void calculate10Day() {
        int activeDay = 0;

//first bit of this generates the first day since it has different generation methods than subsequent days
        System.out.println(getStartTemp().toString());

        //need tot get conditionals done before the day
        setDay(activeDay, new Day());
        get10Day()[activeDay].generateMiddayWeather();//generates all weather patterns on the active day

        setMornToMidModifier(get10Day()[activeDay].getCloudLevel().calculateConditional());

        get10Day()[activeDay].setMorningTemp(getStartTemp());
        get10Day()[activeDay].setMiddayTemp(calculateMornToMid(getStartTemp()));

        get10Day()[activeDay].generateNextWeather();

        System.out.println("Day: " + (activeDay+1) + " " + get10Day()[activeDay].giveWeather());
System.out.print(get10Day()[activeDay].getWind().getSpeed().toMPH().getIntValue()+
                    " MPH" +"\n"+"Percipitation: "+get10Day()[activeDay].getPercip().getPercipType()+
                        " "+get10Day()[activeDay].getPercip().getAmount()+"\n"+"\n");
        activeDay++;
        while (activeDay < get10Day().length) {
            setDay(activeDay, new Day());//creates the day  that the iteration of the loop will work off 
            get10Day()[activeDay].generateMiddayWeather();//generates all weather patterns on the active day

            setMornToMidModifier(get10Day()[activeDay].getCloudLevel().calculateConditional());
            get10Day()[activeDay].setMorningTemp(calculateMidtoMorn(get10Day()[activeDay - 1].getMiddayTemp()));
            get10Day()[activeDay].setMiddayTemp(calculateMornToMid(get10Day()[activeDay].getMorningTemp()));
            get10Day()[activeDay].generateNextWeather();

            System.out.println("Day: " + (activeDay+1)+ " " + get10Day()[activeDay].giveWeather());
            System.out.print(get10Day()[activeDay].getWind().getSpeed().toMPH().getIntValue()+
                    " MPH" +"\n"+"Percipitation: "+get10Day()[activeDay].getPercip().getPercipType()+
                        " "+get10Day()[activeDay].getPercip().getAmount().getIntValue()+get10Day()[activeDay].getPercip().getAmount().getUnits()+"\n"+"\n");
            activeDay++;
        }
    }

    public void createStartTemp() {
        setStartTemp(new Tempeture((double) random.nextInt(30) - 10, " C"));

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
