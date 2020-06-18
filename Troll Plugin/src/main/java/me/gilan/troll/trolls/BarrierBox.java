package me.gilan.troll.trolls;

import org.apache.commons.lang.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;


public class BarrierBox implements Listener, CommandExecutor {

    public String Cbox = "boxtotal";

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player){

            Player player = (Player) sender;
            if(player.isOp()) {
                if (cmd.getName().equalsIgnoreCase(Cbox)) {
                    if (args.length == 1) {
                        for (Player online : Bukkit.getOnlinePlayers()) {
                            if (args[0].equalsIgnoreCase(online.getDisplayName())) {
                                player.sendMessage(ChatColor.GREEN + "Boxed " + online + "!");
                                Location loc = online.getLocation();
                                //Material
                                Material Cageblock = Material.BARRIER;
                                //Floor
                                loc.add(0, -1, 0).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(1, -1, 0).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(-1, -1, 0).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(-1, -1, -1).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(1, -1, -1).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(0, -1, -1).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(-1, -1, 1).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(1, -1, 1).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(0, -1, 1).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                //X+ Side
                                loc.add(2, 0, 0).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(2, 1, 0).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(2, 2, 0).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(2, 0, 1).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(2, 1, 1).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(2, 2, 1).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(2, 0, -1).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(2, 1, -1).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(2, 2, -1).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                //X- Side
                                loc.add(-2, 0, 0).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(-2, 1, 0).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(-2, 2, 0).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(-2, 0, 1).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(-2, 1, 1).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(-2, 2, 1).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(-2, 0, -1).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(-2, 1, -1).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(-2, 2, -1).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                //Z+ Side
                                loc.add(0, 0, 2).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(0, 1, 2).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(0, 2, 2).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(1, 0, 2).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(1, 1, 2).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(1, 2, 2).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(-1, 0, 2).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(-1, 1, 2).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(-1, 2, 2).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                //Z- Side
                                loc.add(0, 0, -2).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(0, 1, -2).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(0, 2, -2).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(1, 0, -2).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(1, 1, -2).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(1, 2, -2).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(-1, 0, -2).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(-1, 1, -2).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(-1, 2, -2).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                //Roof
                                loc.add(0, 3, 0).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(1, 3, 0).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(-1, 3, 0).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(-1, 3, -1).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(1, 3, -1).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(0, 3, -1).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(-1, 3, 1).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(1, 3, 1).getBlock().setType(Cageblock);
                                loc = online.getLocation();
                                loc.add(0, 3, 1).getBlock().setType(Cageblock);
                                loc = online.getLocation();

                            } else {
                                player.sendMessage(ChatColor.RED + "Can't find player!");
                            }
                        }
                    }
                    if (args.length == 0) {
                        player.sendMessage(ChatColor.RED + "You need a player name!");
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

