package com.gmail.ryderzye.AntiTNTMinecartGrief.Listeners;

import com.gmail.ryderzye.AntiTNTMinecartGrief.AntiTNTMinecartGrief;
import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class EntityExplodeEventListener implements Listener {
    public EntityExplodeEventListener() {
    }

    @EventHandler
    public void onEntityExplodeEvent(EntityExplodeEvent event) {
        boolean tntminecartblockgrief = AntiTNTMinecartGrief.get().getConfig().getBoolean("tntminecartblockgrief");
        Entity entity = event.getEntity();
        if (!tntminecartblockgrief && entity.getType() == EntityType.MINECART_TNT) {
            event.setCancelled(true);
        }
    }
}
