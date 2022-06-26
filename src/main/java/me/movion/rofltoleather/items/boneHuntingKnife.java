package me.movion.rofltoleather.items;

import me.movion.rofltoleather.RoFLtoLeather;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import java.util.ArrayList;
import java.util.List;

public class boneHuntingKnife {

    private static RoFLtoLeather plugin;

    public static ItemStack boneHuntingKnife;

    public void createBoneHuntingKnife(){
        //Create Item "Bone Hunting Knife"
        ItemStack item = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.WHITE + "Bone Hunting Knife");
        List<String> lore = new ArrayList<>();
        lore.add("Use it to scalp your enemies");
        lore.add("");
        lore.add(RoFLtoLeather.prefix);
        meta.setLore(lore);
        meta.setCustomModelData(1);
        item.setItemMeta(meta);

        //Create Recipe for Bone Hunting Knife
        {
            NamespacedKey key = new NamespacedKey(plugin, "BoneHuntingKnife");
            ShapedRecipe recipe = new ShapedRecipe(key, boneHuntingKnife);
            recipe.shape(
                    "  N",
                    " NN",
                    "BN ");
            recipe.setIngredient('N', Material.IRON_INGOT);
            recipe.setIngredient('B', Material.BONE);

            Bukkit.addRecipe(recipe);
        }
    }
}
