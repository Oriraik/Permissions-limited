package rain.plimited;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import rain.plimited.utils.ConsoleUtil;

/**
 * @author rainifuns
 *
 * 目标：方便私服的权限管理
 * groups: 包含了所有的权限组，排序第一个就是玩家加入服务器后默认的组
 *
 */
public class PermissionsLimited extends JavaPlugin {
    public static final String name = "Permissions-Limited";
    public static final String version = "v1.1-2022/3/26";

    private static PermissionsLimited plugin;

    @Override
    public void onLoad() {
        plugin = this;
    }

    @Override
    public void onEnable() {
        ConsoleUtil.pluginLog("插件已加载 by rainifuns");
        ConsoleUtil.pluginLog("版本信息：&d"+version);
    }

    @Override
    public void onDisable() {
        ConsoleUtil.pluginLog("插件已卸载，欢迎再次使用！");
    }

    public static PermissionsLimited getPlugin() {
        return plugin;
    }
}
