package org.example.provider;

import lombok.extern.slf4j.Slf4j;
import org.example.Main;
import org.example.model.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileReader;

public class MapProvider {
    private static final Logger log = LoggerFactory.getLogger(MapProvider.class);

    public Map createMap(String mapPath) {

        Map map = new Map();
        try (BufferedReader br = new BufferedReader(new FileReader(mapPath))) {
            String line;
            int j = 0;
            while ((line = br.readLine()) != null) {
                map.addLine();
                for(int i = 0; i < line.length(); i++) {
                    map.addColumn(Character.toString(line.charAt(i)), j);
                }
                j++;
            }
        }
        catch(Exception e) {
            log.error(e.getMessage());
            //TODO Throw custom exception
        }

        return map;
    }
}
