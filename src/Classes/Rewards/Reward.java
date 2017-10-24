package Classes.Rewards;

import org.bukkit.OfflinePlayer;

/**
 * Created by Quinn on 10/22/2017.
 */
public abstract class Reward {

    private int quantity;

    public abstract void getReward(OfflinePlayer p);
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int q){
        quantity = q;
    }


}
