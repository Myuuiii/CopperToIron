package moe.myuuiii.coppertoiron;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class CopperToIron extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        Bukkit.addRecipe(new CopperToIronRecipe(this));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
