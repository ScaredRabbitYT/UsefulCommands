package net.scaredrabbit.usefulcommands.command.subcommands;

import net.scaredrabbit.usefulcommands.UsefulCommands;
import net.scaredrabbit.usefulcommands.command.SubCommand;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.List;

public class BackCommand extends SubCommand {



    @Override
    public String getName() {
        return "back";
    }

    @Override
    public String getDescription() {
        return "returns you to the last place you died!";
    }

    @Override
    public String getSyntax() {
        return "/usefulcommands back";
    }

    @Override
    public void perform(Player player, String[] args) {
        String noDeath = UsefulCommands.getPlugin().getConfig().getString("noDeathMessage");
        String prefix = UsefulCommands.getPlugin().getConfig().getString("pluginPrefix");
        String teleportedBack = UsefulCommands.getPlugin().getConfig().getString("backToDeathLocation");
        if (player.getLastDeathLocation() == null){
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix + noDeath));
        }else {
            player.teleport(player.getLastDeathLocation());
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix + teleportedBack));
        }

    }

    @Override
    public List<String> getSubcommandArguments(Player player, String[] args) {
        return null;
    }

}
