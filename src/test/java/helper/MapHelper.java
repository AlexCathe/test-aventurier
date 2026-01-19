package helper;

import java.util.ArrayList;
import java.util.List;

public class MapHelper {
    public static List<List<String>> defineMapModel() {
        List<String> line1 = List.of("#","#","#"," "," "," "," ","#","#","#","#","#","#"," "," "," "," ","#","#","#");
        List<String> line2 = List.of("#","#","#"," "," "," "," "," "," ","#","#"," "," "," "," "," "," ","#","#","#");
        List<String> line3 = List.of("#","#"," "," "," "," "," ","#","#"," "," ","#","#"," "," "," "," "," ","#","#");
        List<String> line4 = List.of("#"," "," "," "," "," "," ","#","#"," "," ","#","#"," "," "," "," "," "," ","#");
        List<String> line5 = List.of("#","#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#","#");
        List<String> line6 = List.of("#","#","#","#","#"," "," "," "," "," "," "," "," "," "," ","#","#","#","#","#");
        List<String> line7 = List.of("#","#","#","#","#","#"," ","#","#"," "," ","#","#"," "," ","#","#","#","#","#");
        List<String> line8 = List.of(" ","#"," "," "," "," "," ","#","#","#","#","#","#"," "," "," "," "," ","#"," ");
        List<String> line9 = List.of(" "," "," "," "," ","#","#","#","#","#","#","#","#"," "," "," "," "," "," "," ");
        List<String> line10 = List.of(" "," "," "," ","#","#","#","#","#","#","#","#","#","#","#","#"," "," "," "," ");
        List<String> line11 = List.of(" "," "," "," ","#","#","#","#","#","#","#","#","#","#","#","#"," "," "," "," ");
        List<String> line12 = List.of(" "," "," "," "," ","#","#","#","#","#","#","#","#"," "," "," "," "," "," ","#");
        List<String> line13 = List.of(" ","#"," "," "," "," "," ","#","#","#","#","#","#"," "," "," "," "," ","#","#");
        List<String> line14 = List.of("#","#","#","#","#","#"," ","#","#"," "," ","#","#"," ","#","#","#","#","#","#");
        List<String> line15 = List.of("#","#","#","#","#"," "," "," "," "," "," "," "," "," "," ","#","#","#","#","#");
        List<String> line16 = List.of("#","#"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ","#","#");
        List<String> line17 = List.of("#"," "," "," ","#","#"," ","#"," "," "," "," ","#"," ","#","#"," "," "," ","#");
        List<String> line18 = List.of("#","#"," "," "," ","#","#"," "," "," "," "," "," ","#","#"," "," "," ","#","#");
        List<String> line19 = List.of("#","#","#"," "," "," "," ","#"," "," "," "," ","#"," "," "," "," ","#","#","#");
        List<String> line20 = List.of("#","#","#"," "," "," "," ","#","#","#","#","#","#"," "," "," "," ","#","#","#");

        List<List<String>> mapModel = new ArrayList<>();
        mapModel.add(line1);
        mapModel.add(line2);
        mapModel.add(line3);
        mapModel.add(line4);
        mapModel.add(line5);
        mapModel.add(line6);
        mapModel.add(line7);
        mapModel.add(line8);
        mapModel.add(line9);
        mapModel.add(line10);
        mapModel.add(line11);
        mapModel.add(line12);
        mapModel.add(line13);
        mapModel.add(line14);
        mapModel.add(line15);
        mapModel.add(line16);
        mapModel.add(line17);
        mapModel.add(line18);
        mapModel.add(line19);
        mapModel.add(line20);

        return mapModel;
    }
}
