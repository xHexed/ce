package com.taiter.ce;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class ExplodeEnchantmentEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private final List<Block> blocks;
    private final List<ItemStack> drops;
    private final Player breaker;

    public ExplodeEnchantmentEvent(final List<Block> blocks, final Player breaker, final List<ItemStack> drops) {
        this.blocks = blocks;
        this.breaker = breaker;
        this.drops = drops;
    }

    public List<Block> getBlocksBroken() {
        return blocks;
    }

    public Player getBreaker() {
        return breaker;
    }

    public List<ItemStack> getDrops() {
        return drops;
    }

    @Override
    public HandlerList getHandlers() {
        return null;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
