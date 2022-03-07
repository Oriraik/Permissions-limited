package rain.plimited;

import org.bukkit.plugin.java.JavaPlugin;
import rain.plimited.utils.ConsoleUtil;

/**
 * @author rainifuns
 */
public class PermissionsLimited extends JavaPlugin {
    public static final String name = "Permissions-Limited";
    public static final String version = "v1.0-2022/3/7";


    @Override
    public void onEnable() {
        ConsoleUtil.pluginLog("插件已加载 by rainifuns");
        ConsoleUtil.pluginLog("版本信息：&d"+version);
    }

    @Override
    public void onDisable() {
    }
}
