package org.example.model;

import lombok.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode
@AllArgsConstructor
public class Map {
    private List<List<String>> grid;

    public Map() {
        grid = new ArrayList<>();
    }

    /**
     * Add one column in the grid
     * @param character The character to add in the grid
     * @param lineIndex The line index which the character is added
     */
    public void addColumn(String character, int lineIndex) {
        grid.get(lineIndex).add(character);
    }

    /**
     * Add one line in the grid
     */
    public void addLine() {
        grid.add(new ArrayList<>());
    }

    /**
     * Check if the movement is possible or not
     * @param nextCoordinate The coordinates to go
     * @return True if the movement is allowed, else false
     */
    public boolean isAreaFree(Point nextCoordinate) {
        return nextCoordinate.getY() < grid.size() && nextCoordinate.getX() < grid.get((int) nextCoordinate.getY()).size() && grid.get((int) nextCoordinate.getY()).get((int) nextCoordinate.getX()).equals(" ");
    }

    /**
     * Check if the coordinates are within the map
     * @param nextCoordinate The coordinates to go
     * @return true if the coordinates are in the map, else false
     */
    public boolean isInBoundaries(Point nextCoordinate) {
        return ((nextCoordinate.getX() >= 0 && nextCoordinate.getY() >= 0) && (nextCoordinate.getY() <= grid.size() && nextCoordinate.getX() <= grid.get((int) nextCoordinate.getY()).size()));
    }
}
