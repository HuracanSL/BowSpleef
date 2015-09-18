package me.huracansl.bowspleef.api

import me.huracansl.bowspleef.arena.Arena;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

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
