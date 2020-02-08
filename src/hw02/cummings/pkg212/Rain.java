/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw02.cummings.pkg212;

/**
 *knows it's type of percip and can calculate how much it changes the temp
 * @author sunbe
 */
public class Rain extends Percipitation {

    String percipType = "Rain";

    public double calculateConditional() {
        return getAmount().getValue() * 0.9*-1;
    }
    public String getPercipType(){
    
    return percipType;
    }
}
