package domain;

import util.TrueOrFalseGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ladder {
    private final List<Line> lines;

    private static final int FIRST_INDEX=0;

    public Ladder(List<Line> lines) {
        this.lines = List.copyOf(lines);
    }

    public static Ladder generateLadder(Players players, Height height, TrueOrFalseGenerator trueOrFalseGenerator) {
        List<Line> lines = new ArrayList<>();
        int count = FIRST_INDEX;
        while (!height.isSameHeight(count)) {
            Line line = new Line(players.getPlayersCount(), trueOrFalseGenerator);
            lines.add(line);
            count++;
        }
        return new Ladder(Collections.unmodifiableList(lines));
    }

    public List<Line> getLines() {
        return lines;
    }
}
