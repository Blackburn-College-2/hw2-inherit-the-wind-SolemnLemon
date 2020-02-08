/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw02.cummings.pkg212;

/**
 *it's snow it does snow things
 * it multiplies the amount gotten by 10 and knows it's type of percip
 *  can calculate how much it changes the temp
 * @author sunbe
 */
public class Snow extends Percipitation{


   String percipType="Snow";
    public Snow(){
    calculateAmount();
    setAmount(new Length(getAmount().getValue()*10," cm"));
    
    }
    public double calculateConditional(){
    return getAmount().getValue()*0.15*-1;
    
    
}
        public String getPercipType() {
        return percipType;
    }
}