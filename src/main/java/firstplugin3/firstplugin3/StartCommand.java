package firstplugin3.firstplugin3;

import org.bukkit.ChatColor;
import org.bukkit.Statistic;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.awt.*;

public class StartCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (label.equalsIgnoreCase("mystats")) {
            if (!(sender instanceof Player)) {
                //console
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cThe console cannot run this command"));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a[Firstplugin 3] info"));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&eVersion: 1.0"));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&bMade plugin by Console"));
                return true;
            }
            Player player = (Player) sender;
            if (args.length == 0) {
                // /mystats
                player.sendMessage(ChatColor.RED + "Use '/mystats help' to view all commands");
                return true;
            }
            if (args.length >= 1) {
                if (args[0].equalsIgnoreCase("deaths")) {
                    player.sendMessage(ChatColor.AQUA + "You have " + player.getStatistic(Statistic.DEATHS) + " deaths");
                    return true;
                }
                if (args[0].equalsIgnoreCase("logins")) {
                    player.sendMessage(ChatColor.AQUA + "You have " + player.getStatistic(Statistic.LEAVE_GAME) + " total logins");
                    return true;
                }
                if (args[0].equalsIgnoreCase("mobKills")) {
                    player.sendMessage(ChatColor.AQUA + "You have " + player.getStatistic(Statistic.MOB_KILLS) + " mob kills");
                    return true;
                }
                if (args[0].equalsIgnoreCase("playerKills")) {
                    player.sendMessage(ChatColor.AQUA + "You have " + player.getStatistic(Statistic.DEATHS) + " player kills");
                    return true;
                }
                if (args[0].equalsIgnoreCase("info")) {
                    player.sendMessage(ChatColor.GREEN + "[Firstplugin 3] info");
                    player.sendMessage(ChatColor.YELLOW + "Version: 1.0");
                    player.sendMessage(ChatColor.AQUA + "Made plugin by Console");
                    return true;
                }
                if (args[0].equalsIgnoreCase("help")) {
                    player.sendMessage(ChatColor.GREEN + "[FirstPlugin 3] commands");
                    player.sendMessage(ChatColor.AQUA + "/mystats deaths");
                    player.sendMessage(ChatColor.AQUA + "/mystats logins");
                    player.sendMessage(ChatColor.AQUA + "/mystats mobKills");
                    player.sendMessage(ChatColor.AQUA + "/mystats playerKills");
                    return true;
                }
            }
        }
        return false;
    }
}

