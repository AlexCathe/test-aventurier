import helper.MapHelper;
import org.example.model.Map;
import org.example.provider.MapProvider;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MapUnitTest {

    private static String mapFilePath;
    @BeforeAll
    public static void init() {
        mapFilePath = "src/main/resources/carte_v2.txt";
    }

    @Test
    public void mapIsCorrectlyProvided() throws IOException {
        MapProvider mapProvider = new MapProvider();
        Map map = mapProvider.createMap(mapFilePath);
        assertNotNull(map.getGrid());
        List<List<String>> expectedGrid = MapHelper.defineMapModel();
        for(int i = 0; i < expectedGrid.size(); i++) {
            assertEquals(expectedGrid.get(i), map.getGrid().get(i));
        }
    }

}
