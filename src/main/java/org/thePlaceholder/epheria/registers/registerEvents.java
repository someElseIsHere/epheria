package org.thePlaceholder.epheria.registers;

import org.bukkit.plugin.Plugin;
import org.thePlaceholder.epheria.events.playerChat;
import org.thePlaceholder.epheria.events.playerDeath;
import org.thePlaceholder.epheria.events.playerJoin;
import org.thePlaceholder.epheria.events.playerQuit;
import org.thePlaceholder.epheria.items.sugarDiamond;
import org.thePlaceholder.epheria.menus.customEnderChest;
import org.thePlaceholder.epheria.menus.mainMenu;

import static org.bukkit.Bukkit.getServer;

public class registerEvents
{
    public static void run(Plugin plugin)
    {
        getServer().getPluginManager().registerEvents(new playerQuit(), plugin);
        getServer().getPluginManager().registerEvents(new playerChat(), plugin);
        getServer().getPluginManager().registerEvents(new playerDeath(), plugin);
        getServer().getPluginManager().registerEvents(new playerJoin(), plugin);
        getServer().getPluginManager().registerEvents(new mainMenu(), plugin);
        getServer().getPluginManager().registerEvents(new customEnderChest(), plugin);
        getServer().getPluginManager().registerEvents(new sugarDiamond(), plugin);
    }
}