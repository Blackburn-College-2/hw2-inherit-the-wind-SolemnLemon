/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw02.cummings.pkg212;

import java.util.Random;

/**
 * determines wind speed and direction randomly
 *
 * @author sunbe
 */
public class Wind {

    public Random random = new Random();

    char direction;
    Measurement speed;

    WeatherOrganizer weatherBot;

    public Wind(WeatherOrganizer weatherBot) {
        //this.direction=direction;
        //this.speed=speed;
        this.weatherBot = weatherBot;
    }

    public void calculateDirection() {

        char[] dirChart = new char[4];
        dirChart[0] = 'N';
        dirChart[1] = 'E';
        dirChart[2] = 'S';
        dirChart[3] = 'W';
        setDirection(dirChart[random.nextInt(3)]);
    }
    public void calculateSpeed(){
    
    setSpeed (new Measurement((double)random.nextInt(20),"kph"));
    
    }

    public char getDirection() {
        return direction;
    }

    public Measurement getSpeed() {
        return speed;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }

    public void setSpeed(Measurement speed) {
        this.speed = speed;
    }
}
