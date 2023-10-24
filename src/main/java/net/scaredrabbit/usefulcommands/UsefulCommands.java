package net.scaredrabbit.usefulcommands;

import net.scaredrabbit.usefulcommands.command.CommandManager;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class UsefulCommands extends JavaPlugin {


    private static UsefulCommands plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        /* Testing purposes only, will get deleted  with full release*/
        File configFile = new File(getDataFolder(), "config.yml");
        if (configFile.exists()){
            configFile.delete();
            saveDefaultConfig();
        }else {
            saveDefaultConfig();
        }
        saveDefaultConfig();
        plugin = this;

        //Commands
        getCommand("usefulcommands").setExecutor(new CommandManager());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static UsefulCommands getPlugin() {
        return plugin;
    }
}
