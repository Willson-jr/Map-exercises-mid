import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

@AllArgsConstructor
@Data
public class DiaryNote {
    private String humor;
    private String weather;
    private Integer playHours;

    @Override
    public String toString() {
        return ": I was " + humor + ", because I played for "+ playHours + " and it was "+weather;
    }

    public static void main(String[] args) {
        List<DiaryNote> note = new LinkedList<>();
        note.add(new DiaryNote( "happy","cloudy",4));
        note.add(new DiaryNote( "cranky","rainy",2));
        note.add(new DiaryNote( "annoyed","sunny",1));
        note.add(new DiaryNote( "joyful","cloudy",5));

        Map<Integer, DiaryNote> dairy = new HashMap<>();
        dairy.put(3,note.get(0) );
        dairy.put(6,note.get(1) );
        dairy.put(7,note.get(2) );
        dairy.put(10,note.get(3) );

        for (Map.Entry<Integer, DiaryNote> entry: dairy.entrySet()) {
            System.out.println(entry.toString());
        }


    }
}
