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
public abstract class Percipitation {

    //do work after midday is calculated
Random random=new Random();
    
    Length amount;
    public void calculateAmount(){
    setAmount(new Length((double)random.nextInt(7)," In"));
    
    }
        public Length getAmount() {
        return amount;
    }

    public void setAmount(Length amount) {
        this.amount = amount;
    }
}
