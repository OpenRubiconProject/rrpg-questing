package Classes.Rewards;

import com.openrubicon.core.RRPGCore;
import net.milkbowl.vault.Vault;
import net.milkbowl.vault.VaultEco;
import org.bukkit.OfflinePlayer;

/**
 * Created by Quinn on 10/23/2017.
 */
public class MonetaryReward extends Reward {

    MonetaryReward(int q){
        this.setQuantity(q);
    }

    @Override
    public void getReward(OfflinePlayer p) {
    }
}
