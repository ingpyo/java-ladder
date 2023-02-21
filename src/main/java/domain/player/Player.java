package domain.player;


import java.util.Objects;

public class Player {
    private final PlayerName name;

    public Player(String playerName) {
        this.name = new PlayerName(playerName);
    }

    public String getPlayerName() {
        return name.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        return Objects.equals(name, player.name);
    }

}
