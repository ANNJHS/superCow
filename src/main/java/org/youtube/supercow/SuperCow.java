package org.youtube.supercow;

import org.bukkit.plugin.java.JavaPlugin;

public final class SuperCow extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EntityListener(), this);
        getCommand("cow").setExecutor(new cowCommand());
    }

    @Override
    public void onDisable() {
    }

    public static  SuperCow getInstance() {
        return getPlugin(SuperCow.class);
    }
}




















