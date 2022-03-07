package rain.plimited.utils;

import org.bukkit.Bukkit;
import rain.plimited.PermissionsLimited;

public class ConsoleUtil {
    public static void pluginLog(String message) {
        Bukkit.getConsoleSender().sendMessage(StringUtil.color("&f[&e"+ PermissionsLimited.name+"&f] &b >>> &a"+message));
    }
}
