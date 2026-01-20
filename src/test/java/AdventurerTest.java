import helper.MapHelper;
import org.example.exception.IllegalCoordinatesException;
import org.example.exception.IllegalMovementException;
import org.example.model.Adventurer;
import org.example.model.Map;
import org.example.service.AdventurerService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AdventurerTest {
    private static Map map;
    @BeforeAll
    public static void init() {
        map = new Map(MapHelper.defineMapModel());
    }


    @Test
    public void adventurer1ReachCorrectDestination() throws IOException, IllegalCoordinatesException, IllegalMovementException {
        String adventurerDirections = "SSSSEEEEEENN";

        Adventurer adventurer = new Adventurer(new Point(3,0), map);
        AdventurerService adventurerService = new AdventurerService();
        adventurerService.travel(adventurerDirections.split(""), map, adventurer);


        assertEquals(9, (int) adventurer.getCoordinates().getX());
        assertEquals(2, (int) adventurer.getCoordinates().getY());

    }

    @Test
    public void adventurer2WithIncorrectPath() throws IllegalCoordinatesException  {
        String adventurerDirections = "OONOOOSSO";

        Adventurer adventurer = new Adventurer(new Point(6,7), map);
        AdventurerService adventurerService = new AdventurerService();
        /*Adventurer is indeed reaching [1,9] but he is not allowed to take that path to reach those coordinates*/
        assertThrows(IllegalMovementException.class, () -> adventurerService.travel(adventurerDirections.split(""), map, adventurer));

    }

    @Test
    public void adventurerCantGoNorth() throws IllegalCoordinatesException  {
        String adventurerDirections = "N";

        Adventurer adventurer = new Adventurer(new Point(3,7), map);
        AdventurerService adventurerService = new AdventurerService();
        assertThrows(IllegalMovementException.class, () -> adventurerService.travel(adventurerDirections.split(""), map, adventurer));

    }

    @Test
    public void adventurerCantGoWest() throws IllegalCoordinatesException  {
        String adventurerDirections = "O";

        Adventurer adventurer = new Adventurer(new Point(2,7), map);
        AdventurerService adventurerService = new AdventurerService();
        assertThrows(IllegalMovementException.class, () -> adventurerService.travel(adventurerDirections.split(""), map, adventurer));

    }

    @Test
    public void adventurerCantGoSouth() throws IllegalCoordinatesException  {
        String adventurerDirections = "S";

        Adventurer adventurer = new Adventurer(new Point(6,7), map);
        AdventurerService adventurerService = new AdventurerService();
        assertThrows(IllegalMovementException.class, () -> adventurerService.travel(adventurerDirections.split(""), map, adventurer));

    }

    @Test
    public void adventurerCantGoEast() throws IllegalCoordinatesException  {
        String adventurerDirections = "E";

        Adventurer adventurer = new Adventurer(new Point(6,7), map);
        AdventurerService adventurerService = new AdventurerService();
        assertThrows(IllegalMovementException.class, () -> adventurerService.travel(adventurerDirections.split(""), map, adventurer));

    }

    @Test
    public void adventurer3IsCreatedInWrongArea() {
        Assertions.assertThrows(IllegalCoordinatesException.class, () -> new Adventurer(new Point(0,0), map));
    }

    @Test
    public void adventurer3IsCreatedOutOfBoundaries() {
        Assertions.assertThrows(IllegalCoordinatesException.class, () -> new Adventurer(new Point(21,21), map));
    }

    @Test
    public void adventurer3IsMovingOutOfBoundaries() throws IllegalCoordinatesException {
        String adventurerDirections = "E";

        Adventurer adventurer = new Adventurer(new Point(19,8), map);
        AdventurerService adventurerService = new AdventurerService();
        assertThrows(IllegalMovementException.class, () -> adventurerService.travel(adventurerDirections.split(""), map, adventurer));
    }
}
