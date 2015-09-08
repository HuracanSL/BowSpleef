package me.huracansl.bowspleef.api

import me.huracansl.bowspleef.arena.Arena;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Copyright HuracanSL (c) 2014. All Rights Reserved.
 * Any code contained within this document, and any associated APIs with similar brandings
 * are the sole property of HuracanSL. Distribution, reproduction, taking snippits, or
 * claiming any contents as your own will break the terms of the license, and void any
 * agreements with you, the third party.
 */
public class ArenaJoinEvent extends Event {

    private static final HandlerList handlers = new HandlerList();
    private Arena arena;
    private Player player;

    public ArenaJoinEvent(Arena arena, Player player){
        this.arena = arena;
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public Arena getArena() {
        return arena;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}
