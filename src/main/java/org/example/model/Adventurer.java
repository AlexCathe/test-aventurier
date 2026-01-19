package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.exception.IllegalCoordinatesException;
import org.example.exception.IllegalMovementException;
import org.example.model.enums.Direction;

import java.awt.*;

@Data
@EqualsAndHashCode

public class Adventurer {
    private Point coordinates;

    public Adventurer(Point startCoordinates, Map map) throws IllegalCoordinatesException {
        if(map.isAreaFree(startCoordinates) && map.isInBoundaries(startCoordinates)) {
            coordinates = new Point(startCoordinates);
        }
        else {
            throw new IllegalCoordinatesException(String.format("Coordinates [%f,%f] are not allowed at this emplacement", startCoordinates.getX(), startCoordinates.getY()));
        }
    }

    /**
     * Manage the adventurer's move for each direction
     * @param direction The direction where the adventurer is going
     * @param map The map object which serve as context
     * @throws IllegalMovementException When the movement is not possible
     */
    public void move(Direction direction, Map map) throws IllegalMovementException {
        switch (direction) {
            case N -> {
                moveNorth(map);
                break;
            }
            case O -> {
                moveWest(map);
                break;
            }
            case S -> {
                moveSouth(map);
                break;
            }
            case E -> {
                moveEast(map);
                break;
            }
        }
    }

    /**
     * Make the adventurer move in the north direction
     * @param map The map object which serve as context
     * @throws IllegalMovementException When the movement is not possible
     */
    public void moveNorth(Map map) throws IllegalMovementException {
        Point nextCoordinate = new Point((int) coordinates.getX(), (int) coordinates.getY()-1);
        if(map.isAreaFree(nextCoordinate) && map.isInBoundaries(nextCoordinate)) {
            coordinates = nextCoordinate;
        }
        else {
            throw new IllegalMovementException("The movement in the north direction is not allowed or out of boundaries");
        }
    }

    /**
     * Make the adventurer move in the west direction
     * @param map The map object which serve as context
     * @throws IllegalMovementException When the movement is not possible
     */
    public void moveWest(Map map) throws IllegalMovementException {
        Point nextCoordinate = new Point((int) coordinates.getX()-1, (int) coordinates.getY());
        if(map.isAreaFree(nextCoordinate) && map.isInBoundaries(nextCoordinate)) {
            coordinates = nextCoordinate;
        }
        else {
            throw new IllegalMovementException("The movement in the west direction is not allowed or out of boundaries");
        }
    }

    /**
     * Make the adventurer move in the south direction
     * @param map The map object which serve as context
     * @throws IllegalMovementException When the movement is not possible
     */
    public void moveSouth(Map map) throws IllegalMovementException {
        Point nextCoordinate = new Point((int) coordinates.getX(), (int) coordinates.getY()+1);
        if(map.isAreaFree(nextCoordinate) && map.isInBoundaries(nextCoordinate)) {
            coordinates = nextCoordinate;
        }
        else {
            throw new IllegalMovementException("The movement in the south direction is not allowed or out of boundaries");
        }
    }

    /**
     * Make the adventurer move in the east direction
     * @param map The map object which serve as context
     * @throws IllegalMovementException When the movement is not possible
     */
    public void moveEast(Map map) throws IllegalMovementException {
        Point nextCoordinate = new Point((int) coordinates.getX()+1, (int) coordinates.getY());
        if(map.isAreaFree(nextCoordinate) && map.isInBoundaries(nextCoordinate)) {
            coordinates = nextCoordinate;
        }
        else {
            throw new IllegalMovementException("The movement in the east direction is not allowed or out of boundaries");
        }
    }
}
