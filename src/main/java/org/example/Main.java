package org.example;

import org.example.model.Map;
import org.example.provider.MapProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        MapProvider mapProvider = new MapProvider();
        Map map = mapProvider.createMap(args[0]);

    }
}