package me.gilan.troll;

import me.gilan.troll.trolls.BarrierBox;
import me.gilan.troll.trolls.CreeperSpawn;
import me.gilan.troll.trolls.SafeBox;
import me.gilan.troll.trolls.x;
import org.bukkit.plugin.java.JavaPlugin;

public final class Troll extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("boxtotal").setExecutor(new BarrierBox());
        getCommand("creeper").setExecutor(new CreeperSpawn());
        getCommand("box").setExecutor(new SafeBox());
        
    }
}
