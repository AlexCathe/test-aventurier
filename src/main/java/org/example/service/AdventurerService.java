package org.example.service;

import lombok.extern.slf4j.Slf4j;
import org.example.exception.IllegalMovementException;
import org.example.model.Adventurer;
import org.example.model.Map;
import org.example.model.enums.Direction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Slf4j
public class AdventurerService {
    private static final Logger log = LoggerFactory.getLogger(AdventurerService.class);

    /**
     * Make an adventurer travel the indicated path on the map
     * @param adventurerPath Array of {@Direction} indicating where the adventurer must go
     * @param map Current map context
     * @param adventurer The adventurer who will travel
     */
    public void travel(String[] adventurerPath, Map map, Adventurer adventurer) throws IllegalMovementException {
            for(String direction : adventurerPath) {
                adventurer.move(Direction.valueOf(direction), map);
            }
            log.info(adventurer.toString());
    }
}
