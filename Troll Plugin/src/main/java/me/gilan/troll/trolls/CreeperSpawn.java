package me.gilan.troll.trolls;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class CreeperSpawn implements Listener, CommandExecutor {

    public String Ccreep = "creeper";

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if(player.isOp()) {

                if (cmd.getName().equalsIgnoreCase(Ccreep)) {
                    if (args.length == 1) {
                        for (Player online : Bukkit.getOnlinePlayers()) {
                            if (args[0].equalsIgnoreCase(online.getDisplayName())) {
                                player.sendMessage(ChatColor.GREEN + "Creepered " + online + "!");

                                Location loc = online.getLocation();

                                player.getWorld().spawnEntity(loc, EntityType.CREEPER);

                            }
                        }
                    }
                }

            }

        }
        else{
            sender.sendMessage("Your not a Player!!!");
            return true;
        }
        return false;
    }
}
