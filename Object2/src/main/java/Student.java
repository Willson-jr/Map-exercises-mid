import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@AllArgsConstructor
@Data
public class Student {
    private Integer id;
    private Map<String, Integer> marks;

    public static void main(String[] args) {

        Map<String, Integer> atestat = new HashMap<>();
        atestat.put("English",7);
        atestat.put("Polish",5);
        atestat.put("Russian",3);

        Student student1 = new Student(150,atestat);

        System.out.println("Student's id "+student1.id);
        System.out.println("Student's mean " +calculateMean( student1.marks));
        student1.addGrade("Math",10);
        student1.addGrade("Phys",9);
        System.out.println("Student's id "+student1.id);
        System.out.println("Student's mean " +calculateMean( student1.marks));

    }

    void addGrade(String s, Integer g){
        marks.put(s,g);
    }

    static float calculateMean(Map<String, Integer> map) {
        int sum = 0;
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            sum += entry.getValue();
        }
        float avg = (float) sum/map.size();
        return avg;
    }
}
