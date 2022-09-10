package com.gmail.ryderzye.AntiTNTMinecartGrief.Listeners;

import com.gmail.ryderzye.AntiTNTMinecartGrief.AntiTNTMinecartGrief;
import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;


public class EntityDamageByEntityEventListener implements Listener {
    public EntityDamageByEntityEventListener() {
    }

    @EventHandler
    public void onEntityExplodeEvent(EntityDamageByEntityEvent event) {
        boolean tntminecartplayerdmg = AntiTNTMinecartGrief.get().getConfig().getBoolean("tntminecartplayerdmg");
        Entity damager = event.getDamager();
        Entity target = event.getEntity();
        if (!tntminecartplayerdmg && damager.getType() == EntityType.MINECART_TNT && target.getType() == EntityType.PLAYER) {
            event.setCancelled(true);
        }
    }
}