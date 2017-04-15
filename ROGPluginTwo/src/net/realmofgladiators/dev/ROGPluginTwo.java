/* Created with <3 by the Realm of Gladiators development team (Only Eric right now) */

package net.realmofgladiators.dev;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class ROGPluginTwo extends JavaPlugin {

	public void onEnable() {
		
		getLogger().info("Taking out the testing cat.");
		getLogger().info("Cat is being fed.");
		getLogger().info("Cat is fed.");
		getLogger().info("Cat is testing.");
		getLogger().info("Cat has tested.");
		getLogger().info("Cat is analyzing.");
		getLogger().info("Cat has analyzed.");
		getLogger().info("Cat says \"Test nominal, ready to go.\"");
		getLogger().info("has been enabled!");
		
	}
	
	public void onDisable() {
		
		getLogger().info("Testing cat is being brought in.");
		getLogger().info("Testing cat has been brought in.");
		getLogger().info("Testing cat is nominal, ready to shutdown.");
		getLogger().info("has been disabled!");
		
	}
	
	public void onPlayerMove(PlayerMoveEvent event) {
	    // Get the player's location.
	    Location loc = event.getPlayer().getLocation();
	    Player player = event.getPlayer();
	    Location spawn = new Location(Bukkit.getWorld("Spawn"), -117.5, 15, 244.5);
	    
	    if(loc.getY() <= 9 && player.getWorld().getName().equals("Spawn")) {
	    	
	    	player.teleport(spawn);
	    	
	    }
	    
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		if(cmd.getName().equalsIgnoreCase(""/*Put the command in here*/)) {
			
			/*What to do when the command is executed*/
			
		}
		
		return true;
		
	}

}
