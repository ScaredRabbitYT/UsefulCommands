package net.scaredrabbit.usefulcommands.command.subcommands;

import net.scaredrabbit.usefulcommands.UsefulCommands;
import net.scaredrabbit.usefulcommands.command.SubCommand;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.List;

public class ReloadCommand extends SubCommand {
    @Override
    public String getName() {
        return "reload";
    }

    @Override
    public String getDescription() {
        return "Reloads the plugins config and all of its data!";
    }

    @Override
    public String getSyntax() {
        return "/usefulcommands reload";
    }

    @Override
    public void perform(Player player, String[] args) {
        String prefix = UsefulCommands.getPlugin().getConfig().getString("pluginPrefix");
        String reloadedConfig = UsefulCommands.getPlugin().getConfig().getString("reloadedConfig");
        UsefulCommands.getPlugin().reloadConfig();
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix + reloadedConfig));
    }

    @Override
    public List<String> getSubcommandArguments(Player player, String[] args) {
        return null;
    }
}
