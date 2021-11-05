package com.glyart.authmevelocity.proxy.config;

import com.glyart.authmevelocity.proxy.AuthMeVelocityPlugin;
import de.leonhard.storage.Yaml;

import java.util.List;

public interface AuthMeConfig {
    static void defaultConfig( ){
        Yaml config = AuthMeVelocityPlugin.getConfig( );
        config.setDefault(
                "authservers" ,
                List.of(
                        "auth1" ,
                        "auth2"
                ) );
        config.setDefault(
                "teleport.send-to-server-after-login" ,
                false );
        config.setDefault(
                "teleport.servers" ,
                List.of(
                        "lobby1" ,
                        "lobby2"
                ) );
    }
}
