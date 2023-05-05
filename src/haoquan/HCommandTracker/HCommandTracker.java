package haoquan.HCommandTracker;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.event.player.PlayerCommandPreprocessEvent;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.utils.TextFormat;

public class HCommandTracker extends PluginBase implements Listener {
	
	public void onEnable() {
        	this.getServer().getPluginManager().registerEvents(this, this);
        	this.getLogger().info(TextFormat.LIGHT_PURPLE + "HCommandTracker Loaded! [Made by Haoquan]");
	}
	
	@EventHandler
	public void onPlayerCommandPreprocess(PlayerCommandPreprocessEvent event) {
		if(!event.isCancelled()) {
		    String player = event.getPlayer().getName();
		    this.getLogger().info(player + ": " + event.getMessage());
		}
	}
}
