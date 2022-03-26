package rain.plimited.data;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import rain.plimited.PermissionsLimited;
import rain.plimited.utils.ConsoleUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class PerData {
    // <权限组的名字,ArrayList<拥有的权限>>
    public HashMap<String, ArrayList<String>> groups = new HashMap<String, ArrayList<String>>();

    public FileConfiguration loadConfig(String name) {
        FileConfiguration config = null;
        File file = new File(PermissionsLimited.getPlugin().getDataFolder()+"/"+name);
        if (file.exists()) {
            config = YamlConfiguration.loadConfiguration(file);
            ConsoleUtil.pluginLog("文件 " + name + " 已加载");
            return config;
        }else {
            ConsoleUtil.pluginLog("文件 " + name + " 不存在，已自动创建");
            PermissionsLimited.getPlugin().saveResource("name",false);
        }
        return config;
    }

}
