package com.glyart.authmevelocity.spigot.listeners;

import com.glyart.authmevelocity.spigot.AuthMeVelocityPlugin;
import com.glyart.authmevelocity.spigot.events.PreSendLoginEvent;
import fr.xephi.authme.events.LoginEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class AuthMeListener implements Listener {
    private final AuthMeVelocityPlugin plugin;
    
    public AuthMeListener( AuthMeVelocityPlugin plugin ){
        this.plugin = plugin;
    }
    
    @EventHandler
    public void onLogin( LoginEvent event ){
        Player player = event.getPlayer( );
        PreSendLoginEvent sendloginevent = new PreSendLoginEvent( player );
        Bukkit.getPluginManager( ).callEvent( sendloginevent );
        if ( !sendloginevent.isCancelled( ) ) {
            plugin.sendLoginToProxy( player );
        }
    }
}
