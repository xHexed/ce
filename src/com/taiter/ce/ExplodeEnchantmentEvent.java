package com.taiter.ce;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.List;

public class ExplodeEnchantmentEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private final List<Block> blocks;
    private final Player breaker;

    public ExplodeEnchantmentEvent(final List<Block> blocks, final Player breaker) {
        this.blocks = blocks;
        this.breaker = breaker;
    }

    public List<Block> getBlocksBroken() {
        return blocks;
    }

    public Player getBreaker() {
        return breaker;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
