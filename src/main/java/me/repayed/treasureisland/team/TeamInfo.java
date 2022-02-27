package me.repayed.treasureisland.team;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public enum TeamInfo {

    ENGLAND(
            new ItemStack(Material.DIAMOND_HELMET),
            new ItemStack(Material.DIAMOND_CHESTPLATE),
            new ItemStack(Material.DIAMOND_LEGGINGS),
            new ItemStack(Material.DIAMOND_BOOTS)
    );


    private final ItemStack helmet;
    private final ItemStack chestplate;
    private final ItemStack leggings;
    private final ItemStack boots;

    TeamInfo(final ItemStack helmet, final ItemStack chestplate, final ItemStack leggings, final ItemStack boots) {
        this.helmet = helmet;
        this.chestplate = chestplate;
        this.leggings = leggings;
        this.boots = boots;
    }
}
