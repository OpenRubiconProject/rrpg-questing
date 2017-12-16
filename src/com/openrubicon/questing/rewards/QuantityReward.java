package com.openrubicon.questing.rewards;

/**
 * Created by Quinn on 10/26/2017.
 */
public abstract class QuantityReward extends Reward {

    private int quantity;

    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int q){
        quantity = q;
    }
}
