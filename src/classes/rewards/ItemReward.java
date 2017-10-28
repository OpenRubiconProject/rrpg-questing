package classes.rewards;

import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

/**
 * Created by Quinn on 10/22/2017.
 */
public class ItemReward extends Reward {

    private Material itemType;
    private Enchantment[] enchants;
    private int[] levels;

    //Constructor for an item without enchantments
    public ItemReward(int q, Material m){
        itemType = m;
        this.setQuantity(q);
    }

    //Constructor for an item with enchantments
    public ItemReward(int q, Material m, Enchantment[] e, int[] l){
        itemType = m;
        this.setQuantity(q);
        if(e.length == l.length) {
            enchants = e;
            this.levels = l;
        }
    }

    @Override
    public void getReward(OfflinePlayer p) {
        ItemStack stack = new ItemStack(itemType);
        stack.setAmount(this.getQuantity());

        int i=0;
        for(Enchantment e : enchants){
            stack.addEnchantment(e, levels[i]);
            i++;
        }

        p.getPlayer().getInventory().addItem(stack);
    }
}
