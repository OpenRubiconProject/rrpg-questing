package com.openrubicon.questing.checkpoints;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.EntityType;

/**
 * Created by Quinn on 10/22/2017.
 */
public class KillEntity extends Checkpoint {

    int quantity;
    EntityType entity;

    KillEntity(int q, EntityType e){
        quantity = q;
        entity = e;
    }

    @Override
    public boolean isAchieved(OfflinePlayer p) {
        //Fetch database, get the pk for this checkpoint type, determine if the player has achieved the requirements.
        return false;
    }
}
