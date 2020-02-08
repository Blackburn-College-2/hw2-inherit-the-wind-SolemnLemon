/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw02.cummings.pkg212;

import java.util.Random;

/**
 *determines cloud level at random
 * and can calculate how much it changes the temp
 * @author sunbe
 */
public class Cloud {

    public Random random = new Random();

    String cloudLevel;
    double conditional = 0.0;

    int cloudLevelInt;

    public Cloud() {

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

        setCloudLevelInt(random.nextInt(3));
        setCloudLevel(levels[getCloudLevelInt()]);

    }

    public String getCloudLevel() {
        return cloudLevel;
    }

    public void setCloudLevel(String cloudLevel) {
        this.cloudLevel = cloudLevel;
    }

    public double calculateConditional() {
        if (getCloudLevelInt() == 0) {
            //make sure to add not subtract cloud conditional
            return 6.0;
        } else if (getCloudLevelInt() == 1) {
            return 3.0;
        } else if (getCloudLevelInt() == 2) {
            return -3.0;
        } else {
            return -14.0;
        }

    }

    public int getCloudLevelInt() {
        return cloudLevelInt;
    }

    public void setCloudLevelInt(int cloudLevelInt) {
        this.cloudLevelInt = cloudLevelInt;
    }
}
