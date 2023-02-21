package domain.player;

import java.util.Objects;

public class PlayerName {
    private final String name;

    private static final int PLAYER_NAME_MAX_SIZE = 5;
    private static final int PLAYER_NAME_MIN_SIZE = 1;
    private static final String PLAYER_NAME_LENGTH_ERROR_MESSAGE = "[ERROR] 플레이어 이름음 1~5글자만 가능합니다.";
    private static final String BLANK_MESSAGE = "[ERROR] 입력값이 비어있습니다.";
    private static final String NULL_MESSAGE = "[ERROR] 아무것도 입력하지 않았습니다.";

    public PlayerName(String name) {
        checkPlayerName(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlayerName that = (PlayerName) o;

        return Objects.equals(name, that.name);
    }

    private void checkPlayerName(String playerName) {
        checkPlayerNameLength(playerName);
        checkBlank(playerName);
        checkNull(playerName);
    }


    private void checkPlayerNameLength(String playerName) {
        if (playerName.length()>PLAYER_NAME_MAX_SIZE||playerName.length()<PLAYER_NAME_MIN_SIZE) {
            throw new IllegalArgumentException(PLAYER_NAME_LENGTH_ERROR_MESSAGE);
        }
    }
    private static void checkBlank(String player) {
        if (player.isBlank()) {
            throw new IllegalArgumentException(BLANK_MESSAGE);
        }
    }

    private static void checkNull(String player) {
        if (player == null) {
            throw new IllegalArgumentException(NULL_MESSAGE);
        }
    }
}
