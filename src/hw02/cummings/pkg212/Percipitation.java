/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw02.cummings.pkg212;

import java.util.Random;

/**
 *accounts for both rain and snow as both inherit from it gives them generation methods
 * @author sunbe
 */
public abstract class Percipitation {

    //do work after midday is calculated
Random random=new Random();
    
public Percipitation(){
calculateAmount();
}

    
    Length amount;
    public void calculateAmount(){
    setAmount(new Length((double)random.nextInt(8)," CM"));
    
    }
    
    public abstract String getPercipType();
        public Length getAmount() {
        return amount;
    }

    public void setAmount(Length amount) {
        this.amount = amount;
    }
}
