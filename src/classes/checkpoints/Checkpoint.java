package classes.checkpoints;

import classes.rewards.Reward;
import org.bukkit.OfflinePlayer;

/**
 * Created by Quinn on 10/22/2017.
 */
public abstract class Checkpoint {

    Reward reward;

    /**
     * Fetches the checkpoint primary key from the database and determines if the player has obtained the goals for this checkpoint.
     * @param p
     * @return If the player has achieved the checkpoint or not.
     */
    public abstract boolean isAchieved(OfflinePlayer p);
    public void getReward(OfflinePlayer p){reward.giveReward(p);}

}
