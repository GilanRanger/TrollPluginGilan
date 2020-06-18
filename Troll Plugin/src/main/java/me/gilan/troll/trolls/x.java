package me.gilan.troll.trolls;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class x implements Listener {

    ItemStack goldSword = new ItemStack(Material.GOLD_SWORD, 1);
    @EventHandler
    public void onStickRightClick(PlayerInteractEvent e){
        Player p = e.getPlayer();
        if(p.getInventory().getItemInMainHand().equals(goldSword)) {
            ItemStack Item = new ItemStack(Material.DIAMOND_SWORD,1);
            ItemMeta meta = Item.getItemMeta();

            meta.setDisplayName(ChatColor.GOLD + "GOD'S SWORD");
            ArrayList<String> lore =  new ArrayList<String>();
            lore.add(ChatColor.WHITE + "pairvol is the anarchy god and this is his sword!");
            meta.setLore(lore);
            meta.addEnchant(Enchantment.DURABILITY, 30000, true);
            meta.addEnchant(Enchantment.FIRE_ASPECT, 30000, true);
            meta.addEnchant(Enchantment.DAMAGE_ALL, 30000, true);
            Item.setItemMeta(meta);


            ItemStack Item2 = new ItemStack(Material.DIAMOND_HELMET, 1);
            ItemMeta meta2;
            meta2 = Item2.getItemMeta();
            meta.setDisplayName(ChatColor.GOLD + "GOD'S HELM");
            ArrayList<String> lore2 =  new ArrayList<String>();
            lore.add(ChatColor.WHITE + "The anarchy god's helm");
            meta2.setLore(lore2);
            meta2.addEnchant(Enchantment.DURABILITY, 30000, true);
            meta2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 30000, true);
            meta2.addEnchant(Enchantment.THORNS, 30000, true);
            meta2.addEnchant(Enchantment.PROTECTION_FIRE, 32000, true);

            Item2.setItemMeta(meta2);

            ItemStack Item3 = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
            ItemMeta meta3;
            meta3 = Item3.getItemMeta();
            meta3.setDisplayName(ChatColor.GOLD + "GOD'S CHESTPIECE");
            ArrayList<String> lore3 =  new ArrayList<String>();
            lore.add(ChatColor.WHITE + "The anarchy god's helm");
            meta3.setLore(lore3);
            meta3.addEnchant(Enchantment.DURABILITY, 30000, true);
            meta3.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 30000, true);
            meta3.addEnchant(Enchantment.THORNS, 30000, true);
            meta3.addEnchant(Enchantment.PROTECTION_FIRE, 32000, true);

            Item3.setItemMeta(meta3);

            ItemStack Item4 = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
            ItemMeta meta4;
            meta4 = Item4.getItemMeta();
            meta.setDisplayName(ChatColor.GOLD + "GOD'S PANTS");
            ArrayList<String> lore4 =  new ArrayList<String>();
            lore4.add(ChatColor.WHITE + "The anarchy god's pants");
            meta4.setLore(lore4);
            meta4.addEnchant(Enchantment.DURABILITY, 30000, true);
            meta4.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 30000, true);
            meta4.addEnchant(Enchantment.THORNS, 30000, true);
            meta4.addEnchant(Enchantment.PROTECTION_FIRE, 32000, true);

            Item4.setItemMeta(meta4);

            ItemStack Item5 = new ItemStack(Material.DIAMOND_BOOTS, 1);
            ItemMeta meta5;
            meta5 = Item5.getItemMeta();
            meta5.setDisplayName(ChatColor.GOLD + "GOD'S SHOES");
            ArrayList<String> lore5 =  new ArrayList<String>();
            lore5.add(ChatColor.WHITE + "The anarchy god's shoes");
            meta5.setLore(lore5);
            meta5.addEnchant(Enchantment.DURABILITY, 30000, true);
            meta5.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 30000, true);
            meta5.addEnchant(Enchantment.THORNS, 30000, true);
            meta5.addEnchant(Enchantment.PROTECTION_FIRE, 32000, true);

            Item5.setItemMeta(meta5);

            p.getInventory().addItem(Item);
            p.getInventory().addItem(Item2);
            p.getInventory().addItem(Item3);
            p.getInventory().addItem(Item4);
            p.getInventory().addItem(Item5);
        }

    }
}
