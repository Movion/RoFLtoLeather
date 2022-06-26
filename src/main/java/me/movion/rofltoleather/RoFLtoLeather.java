package me.movion.rofltoleather;

import me.movion.rofltoleather.items.boneHuntingKnife;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class RoFLtoLeather extends JavaPlugin {

    public final static String prefix = ChatColor.GOLD + "" + ChatColor.BOLD + "RoFLtoLeather " + ChatColor.GRAY;


    @Override
    public void onEnable() {
        boneHuntingKnife cBoneHuntingKnife = new boneHuntingKnife();


        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
