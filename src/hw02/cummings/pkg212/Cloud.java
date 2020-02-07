/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw02.cummings.pkg212;

import java.util.Random;

/**
 *
 * @author sunbe
 */
public class Cloud {

    public Random random = new Random();

    String cloudLevel;
public Cloud(){

calculateCloudLevel();
}


/**
 * chooses cloud level at random and sets it to the attribute
 */
    public void calculateCloudLevel() {
        String[] levels = new String[4];
        levels[0] = "None";
        levels[1] = "Light";
        levels[2] = "Medium";
        levels[3] = "Heavy";
        setCloudLevel(levels[random.nextInt(3)]);

    }

    public String getCloudLevel() {
        return cloudLevel;
    }

    public void setCloudLevel(String cloudLevel) {
        this.cloudLevel = cloudLevel;
    }
}
