package org.example.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.model.enums.Direction;

import java.awt.*;
import java.util.List;

@Data
@EqualsAndHashCode
public class Adventurer {
    private Point coordinate;

    public Adventurer(Point startCoordinates) {
        coordinate = new Point(startCoordinates);
    }
    public void move(Direction direction, Map map) {
        switch (direction) {
            case N -> {

            }
        }
    }

    public void moveNorth(Map map) {
        Point nextCoordinate = new Point((int) coordinate.getX(), (int) coordinate.getY()-1);
        if(map.isAreaFree(nextCoordinate) && map.isOutOfBoundaries(nextCoordinate)) {
            coordinate = nextCoordinate;
        }
    }

    public void moveWest(Map map) {
        Point nextCoordinate = new Point((int) coordinate.getX(), (int) coordinate.getY()-1);
        if(map.isAreaFree(nextCoordinate) && map.isOutOfBoundaries(nextCoordinate)) {
            coordinate = nextCoordinate;
        }
    }

    public void moveNorth(Map map) {
        Point nextCoordinate = new Point((int) coordinate.getX(), (int) coordinate.getY()-1);
        if(map.isAreaFree(nextCoordinate) && map.isOutOfBoundaries(nextCoordinate)) {
            coordinate = nextCoordinate;
        }
    }

    public void moveNorth(Map map) {
        Point nextCoordinate = new Point((int) coordinate.getX(), (int) coordinate.getY()-1);
        if(map.isAreaFree(nextCoordinate) && map.isOutOfBoundaries(nextCoordinate)) {
            coordinate = nextCoordinate;
        }
    }
}
