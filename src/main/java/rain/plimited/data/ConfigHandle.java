package rain.plimited.data;

import org.bukkit.configuration.file.FileConfiguration;
import rain.plimited.utils.ConsoleUtil;

import java.util.ArrayList;
import java.util.HashMap;

public class ConfigHandle {

    public static void loadGroups(HashMap<String, ArrayList<String>> groups, FileConfiguration config) {
        ConsoleUtil.pluginLog("正在加载权限组信息...");
        int count = 0;
        for (String group_name : config.getConfigurationSection("").getKeys(false)) {
            StringBuilder sb = new StringBuilder();
            sb.append("名称: "+group_name+", 权限: ");
            ArrayList<String> permissions = new ArrayList<>();
            config.getStringList(group_name).forEach((per) -> {
                permissions.add(per);
                sb.append(per);
            });
            ConsoleUtil.pluginLog(++count + ". "+sb.toString());
            groups.put(group_name,permissions);
        }
        ConsoleUtil.pluginLog("共加载了 "+ count + "个权限组");
    }

}
