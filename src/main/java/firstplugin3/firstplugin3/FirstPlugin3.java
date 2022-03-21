package firstplugin3.firstplugin3;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class FirstPlugin3 extends JavaPlugin {

    FileConfiguration config = getConfig();

    @Override
    public void onEnable() {
        Bukkit.getLogger().info(config.getString("startmessage"));
        config.options().copyDefaults(true);
        saveConfig();

        this.getCommand("mystats").setExecutor(new StartCommand());
        this.getCommand("mystats").setTabCompleter(new StartTab());
    }

    @Override
    public void onDisable() {
        System.out.println("[FirstPlugin3] Goodbye!");
    }

    public FileConfiguration getConfigFile() {
        return config;
    }
}