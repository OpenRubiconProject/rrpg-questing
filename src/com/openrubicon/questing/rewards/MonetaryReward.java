package com.openrubicon.questing.rewards;

import org.bukkit.OfflinePlayer;

/**
 * Created by Quinn on 10/23/2017.
 */
public class MonetaryReward extends QuantityReward {

    MonetaryReward(int q){
        this.setQuantity(q);
    }

    @Override
    public void giveReward(OfflinePlayer p) {
    }
}
