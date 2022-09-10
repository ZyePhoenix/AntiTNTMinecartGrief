package com.gmail.ryderzye.AntiTNTMinecartGrief;

import com.gmail.ryderzye.AntiTNTMinecartGrief.Listeners.EntityExplodeEventListener;
import org.bukkit.plugin.PluginLogger;
import org.bukkit.plugin.java.JavaPlugin;

public class AntiTNTMinecartGrief extends JavaPlugin{
    public static AntiTNTMinecartGrief atmg;

    public AntiTNTMinecartGrief() {
    }

    public void onEnable() {
        atmg = this;
        this.saveDefaultConfig();
        this.getServer().getPluginManager().registerEvents(new EntityExplodeEventListener(), this);
        this.getLogger().info("AntiTNTMinecartGrief is enabled");
    }

    public void onDisable() {
        this.getLogger().info("AntiTNTMinecartGrief is disabled");
    }

    public static AntiTNTMinecartGrief get() {
        return atmg;
    }
}