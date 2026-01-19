package org.example.provider;

import org.example.model.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class MapProvider {
    private static final Logger log = LoggerFactory.getLogger(MapProvider.class);

    /**
     * Load file content to create a Map object
     * @param mapPath File path to instantiate a map
     * @return The map corresponding to the file content
     */
    public Map createMap(String mapPath) throws IOException {

        Map map = new Map();
        try (BufferedReader fileBuffer = new BufferedReader(new FileReader(mapPath))) {
            String line;
            int j = 0;
            while ((line = fileBuffer.readLine()) != null) {
                String utf8Line = new String(line.getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8);
                map.addLine();
                for(int i = 0; i < utf8Line.length(); i++) {
                    map.addColumn(Character.toString(utf8Line.charAt(i)), j);
                }
                j++;
            }
        }

        return map;
    }
}
