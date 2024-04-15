package org.youtube.supercow;

import org.bukkit.Material;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.inventory.EquipmentSlot;

public class EntityListener implements Listener {

    @EventHandler
    public void onEntityRightClick(PlayerInteractAtEntityEvent event) {

        if (event.getHand() != EquipmentSlot.HAND)
            return;

        Player player = event.getPlayer();
        Entity entity = event.getRightClicked();

        if (entity instanceof Cow && entity.hasMetadata("SuperCow") && player.getItemInHand().getType() == Material.BUCKET) {
            Cow cow = (Cow) entity;
            cow.getWorld().createExplosion(cow.getLocation(), 2.5F);
        }
    }


}




















