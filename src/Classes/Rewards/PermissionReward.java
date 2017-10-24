package Classes.Rewards;

import com.openrubicon.core.RRPGCore;
import org.bukkit.OfflinePlayer;
import org.bukkit.permissions.PermissionAttachment;

/**
 * Created by Quinn on 10/23/2017.
 */
public class PermissionReward extends Reward {

    String permission;

    PermissionReward(String perm){
        permission = perm;
    }

    @Override
    public void getReward(OfflinePlayer p) {
        PermissionAttachment perms = p.getPlayer().addAttachment(RRPGCore.plugin);
        perms.setPermission(permission, true);
    }
}
