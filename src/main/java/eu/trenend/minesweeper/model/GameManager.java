package eu.trenend.minesweeper.model;

import eu.trenend.minesweeper.Minesweeper;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Getter
public class GameManager {

    private final Minesweeper plugin;
    private final Map<UUID, Game> sample;

    public GameManager(@NotNull Minesweeper plugin) {
        this.plugin = plugin;
        this.sample = new HashMap<>();
    }

    public boolean inGame(@NotNull UUID uuid) {
        return sample.containsKey(uuid);
    }
}