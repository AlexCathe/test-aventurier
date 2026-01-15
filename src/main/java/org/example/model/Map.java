package org.example.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode
@Getter
public class Map {
    private List<List<String>> grid;

    public Map() {
        grid = new ArrayList<>();
    }

    public void addColumn(String character, int lineIndex) {
        grid.get(lineIndex).add(character);
    }

    public void addLine() {
        grid.add(new ArrayList<>());
    }

    public boolean isAreaFree(Point nextCoordinate) {
        return grid.get((int) nextCoordinate.getX()).get((int) nextCoordinate.getY()).equals(" ");
    }
    public boolean isOutOfBoundaries(Point nextCoordinate) {
        return ((nextCoordinate.getX() >= 0 && nextCoordinate.getY() >= 0) && (nextCoordinate.getX() <= grid.get((int) nextCoordinate.getY()).size() &&  nextCoordinate.getY() <= grid.size()));
    }
}
