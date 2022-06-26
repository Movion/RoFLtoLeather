package me.movion.rofltoleather;

import me.movion.rofltoleather.items.boneHuntingKnife;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public final class RoFLtoLeather extends JavaPlugin {

    public final static String prefix = ChatColor.GOLD + "" + ChatColor.BOLD + "RoFLtoLeather " + ChatColor.GRAY;


    @Override
    public void onEnable() {
        {
            //Create Item "Bone Hunting Knife "
            ItemStack boneHuntingKnifeItem = new ItemStack(Material.IRON_SWORD, 1);
            ItemMeta boneHuntingKnifeItemMeta = boneHuntingKnifeItem.getItemMeta();
            boneHuntingKnifeItemMeta.setDisplayName(ChatColor.WHITE + "Bone Hunting Knife");
            List<String> lore = new ArrayList<>();
            lore.add("Use it to scalp your enemies");
            lore.add("");
            lore.add(RoFLtoLeather.prefix);
            boneHuntingKnifeItemMeta.setLore(lore);
            boneHuntingKnifeItemMeta.setCustomModelData(1);
            boneHuntingKnifeItem.setItemMeta(boneHuntingKnifeItemMeta);
            //Create Recipe for Bone Hunting Knife
            NamespacedKey key = new NamespacedKey(this, "BoneHuntingKnife");
            ShapedRecipe recipe = new ShapedRecipe(key, boneHuntingKnifeItem);
            recipe.shape(
                    "  N",
                    " NN",
                    "BN ");
            recipe.setIngredient('N', Material.IRON_INGOT);
            recipe.setIngredient('B', Material.BONE);
            Bukkit.addRecipe(recipe);
        }
        {
            //Create Item "Bone Hunting Knife "
            ItemStack woodHuntingKnifeItem = new ItemStack(Material.WOODEN_SWORD, 1);
            ItemMeta woodHuntingKnifeItemMeta = woodHuntingKnifeItem.getItemMeta();
            woodHuntingKnifeItemMeta.setDisplayName(ChatColor.WHITE + "Wood Hunting Knife");
            List<String> lore = new ArrayList<>();
            lore.add("Use it to scalp your enemies");
            lore.add("");
            lore.add(RoFLtoLeather.prefix);
            woodHuntingKnifeItemMeta.setLore(lore);
            woodHuntingKnifeItemMeta.setCustomModelData(1);
            woodHuntingKnifeItem.setItemMeta(woodHuntingKnifeItemMeta);
            //Create Recipe for Bone Hunting Knife
            NamespacedKey key = new NamespacedKey(this, "WoodHuntingKnife");
            ShapedRecipe recipe = new ShapedRecipe(key, woodHuntingKnifeItem);
            recipe.shape(
                    "  L",
                    " LL",
                    "SL ");
            recipe.setIngredient('L', Material.DARK_OAK_SLAB);
            recipe.setIngredient('S', Material.STICK);
            Bukkit.addRecipe(recipe);
        }


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
