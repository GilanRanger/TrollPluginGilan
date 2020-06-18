package me.gilan.troll.trolls;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class SafeBox implements Listener, CommandExecutor {

    public String Cbox = "box";

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {

            Player player = (Player) sender;
            if (player.isOp()) {

                if (cmd.getName().equalsIgnoreCase(Cbox)) {
                    if (args.length == 1) {
                        for (Player online : Bukkit.getOnlinePlayers()) {
                            if (args[0].equalsIgnoreCase(online.getDisplayName())) {
                                player.sendMessage(ChatColor.GREEN + "Boxed " + online + "!");
                                Location loc = online.getLocation();
                                //Material
                                Material Cageblock = Material.GLASS;
                                Material Masked = Material.AIR;


                                    //Floor
                                if(loc.add(0, -1, 0).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(1, -1, 0).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(-1, -1, 0).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(0, -1, 1).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(1, -1, 1).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(-1, -1, 1).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(0, -1, -1).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(1, -1, -1).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(-1, -1, -1).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();




                                    //X-
                                if(loc.add(-2, 0, 0).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(-2, 1, 0).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(-2, 2, 0).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(-2, 0, 1).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(-2, 1, 1).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(-2, 2, 1).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(-2, 0, -1).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(-2, 1, -1).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(-2, 2, -1).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();



                                    //X+
                                if(loc.add(2, 0, 0).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(2, 1, 0).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(2, 2, 0).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(2, 0, 1).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(2, 1, 1).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(2, 2, 1).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(2, 0, -1).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(2, 1, -1).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(2, 2, -1).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();



                                    //Z-
                                if(loc.add(0, 0, -2).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(0, 1, -2).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(0, 2, -2).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(1, 0, -2).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(1, 1, -2).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(1, 2, -2).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(-1, 0, -2).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(-1, 1, -2).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(-1, 2, -2).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();



                                    //Z+
                                if(loc.add(0, 0, 2).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(0, 1, 2).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(0, 2, 2).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(1, 0, 2).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(1, 1, 2).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(1, 2, 2).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(-1, 0, 2).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(-1, 1, 2).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(-1, 2, 2).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();



                                    //Roof
                                if(loc.add(0, 3, 0).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(1, 3, 0).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(-1, 3, 0).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(0, 3, 1).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(1, 3, 1).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(-1, 3, 1).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(0, 3, -1).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(1, 3, -1).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
                                if(loc.add(-1, 3, -1).getBlock().getType().equals(Masked)){
                                    loc.getBlock().setType(Cageblock);
                                    loc = online.getLocation();
                                }
                                loc = online.getLocation();
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
