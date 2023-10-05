package dev.sebkuip.nochat;

import org.bukkit.plugin.java.JavaPlugin;

public class NoChat extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Enabling NoChat. All chat is disabled.");
        getServer().getPluginManager().registerEvents(new ChatListener(), this);
    }
}
