package eu.trenend.minesweeper.model;

import lombok.Getter;
import org.bukkit.scheduler.BukkitRunnable;
import org.jetbrains.annotations.NotNull;

@Getter
class GameRunnable extends BukkitRunnable {

    private final Game game;
    private int time = 0;

    GameRunnable(@NotNull Game game) {
        this.game = game;
        runTaskTimer(game.getManager().getPlugin(), 20, 20);
    }

    @Override
    public void run() {
        game.setTime(time ++);
    }
}