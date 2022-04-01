package org.thePlaceholder.epheria.menus;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.io.IOException;

public class mainMenu implements Listener
{


    @EventHandler
    public void inventoryClick(InventoryClickEvent event) throws IOException, ClassNotFoundException {
        HumanEntity human = event.getWhoClicked();
        Inventory generalMenu = Bukkit.createInventory(null, 27, Component.text("MENU"));

        customEnderChest.getItem(generalMenu,11);

        if(event.getSlot() == 17 && event.getInventory() == human.getInventory()) human.openInventory(generalMenu);

        if(event.getSlot() == 11 && event.getInventory() == generalMenu) customEnderChest.open(human);
    }

    @EventHandler
    public void inventoryOpen(final InventoryOpenEvent event)
    {
        final HumanEntity human = event.getPlayer();
        human.setItemOnCursor(new ItemStack(Material.AIR));
    }

    public static ItemStack generateMenuStar()
    {
        ItemStack menuStar = new ItemStack(Material.NETHER_STAR);
        ItemMeta menuStarMeta = menuStar.getItemMeta();
        menuStarMeta.displayName(Component.text(ChatColor.DARK_PURPLE + "MENU"));
        menuStar.setItemMeta(menuStarMeta);

        return menuStar;
    }
}
