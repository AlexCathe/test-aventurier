package org.example;

import lombok.extern.slf4j.Slf4j;
import org.example.exception.IllegalCoordinatesException;
import org.example.exception.IllegalMovementException;
import org.example.model.Adventurer;
import org.example.model.Map;
import org.example.service.AdventurerService;
import org.example.provider.MapProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Slf4j
public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws IOException, IllegalCoordinatesException, IllegalMovementException {
        MapProvider mapProvider = new MapProvider();
        Map map = mapProvider.createMap(args[0]);
        AdventurerService adventurerService = new AdventurerService();

        try (BufferedReader fileBuffer = new BufferedReader(new FileReader(args[1]))) {
            byte[] bytesCoordinate = fileBuffer.readLine().getBytes(StandardCharsets.UTF_8);
            String coordinateLine = new String(bytesCoordinate, StandardCharsets.UTF_8);

            Point coordinates = new Point(Integer.parseInt(coordinateLine.split(",")[0]), Integer.parseInt(coordinateLine.split(",")[1]));
            byte[] bytesTravelPath = fileBuffer.readLine().getBytes(StandardCharsets.UTF_8);
            Adventurer adventurer = new Adventurer(coordinates, map);
            String travelPath = new String(bytesTravelPath, StandardCharsets.UTF_8);
            adventurerService.travel(travelPath.split(""), map, adventurer);

        }

    }
}