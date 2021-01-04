package com.taiter.ce;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffectType;

public abstract class CBasic {

    public enum Trigger {
        INTERACT,
        INTERACT_ENTITY,
        INTERACT_LEFT,
        INTERACT_RIGHT,
        MOVE,
        DAMAGE_GIVEN,
        DAMAGE_TAKEN,
        DAMAGE_NATURE, //Falldamage, damage by cactus, etc.
        BLOCK_PLACED,
        BLOCK_BROKEN,
        SHOOT_BOW,
        PROJECTILE_THROWN,
        PROJECTILE_HIT,
        WEAR_ITEM,
        DEATH
    }

    protected final Plugin main = Main.plugin;

    protected final HashSet<Player> cooldown = new HashSet<>();
    protected final HashSet<Player> lockList = new HashSet<>();
    protected final HashSet<Trigger> triggers = new HashSet<>();

    protected String displayName;
    protected String originalName;
    protected String permissionName;
    protected String typeString;

    protected final HashMap<PotionEffectType, Integer> potionsOnWear = new HashMap<>();

    protected final Map<String, Object> configEntries = new LinkedHashMap<>();

    public Plugin getPlugin() {
        return this.main;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getOriginalName() {
        return this.originalName;
    }
    
    public String getPermissionName() {
        return this.permissionName;
    }

    public HashSet<Trigger> getTriggers() {
        return this.triggers;
    }

    public FileConfiguration getConfig() {
        return Main.config;
    }

    public String getType() {
        return this.typeString;
    }

    public HashMap<PotionEffectType, Integer> getPotionEffectsOnWear() {
        return this.potionsOnWear;
    }

}
