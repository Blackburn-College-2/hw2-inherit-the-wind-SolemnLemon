/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw02.cummings.pkg212;

import java.util.Random;

/**
 * determines wind speed and direction randomly
 *and can calculate how much it changes the temp
 * @author sunbe
 */
public class Wind {

    public Random random = new Random();

    char direction;
    Speed speed;

    public Wind() {
        calculateDirection();
        calculateSpeed();

    }

    public void calculateDirection() {

        char[] dirChart = new char[4];
        dirChart[0] = 'N';
        dirChart[1] = 'E';
        dirChart[2] = 'S';
        dirChart[3] = 'W';
        setDirection(dirChart[random.nextInt(3)]);
    }

    public void calculateSpeed() {

        setSpeed(new Speed((double) random.nextInt(20), "kph"));

    }

    public double calculateConditional() {
        if (getDirection() == 'N') {
            return getSpeed().getValue() * (-.5);
        } else if (getDirection() == 'S') {
            return getSpeed().getValue() * (.65);
        }
return 0.0;
    }

    public char getDirection() {
        return direction;
    }

    public Speed getSpeed() {
  
        return speed;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }
}
