package dev.sebkuip.nochat;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener {
    @EventHandler(priority= EventPriority.HIGHEST)
    public void onAsyncPlayerChatEvent(AsyncPlayerChatEvent event) {
        event.getPlayer().sendMessage(ChatColor.RED + "Chat is disabled on this server.");
        event.setCancelled(true);
    }
}
