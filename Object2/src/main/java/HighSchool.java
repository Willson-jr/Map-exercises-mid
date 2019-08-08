import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.LinkedList;
import java.util.List;

@AllArgsConstructor     //konstruktor z wszystkimi polami
@Data                   //Gettery, Settery, toString(), equals and hashCode
public class HighSchool {
    private String name;
    private Integer points;
    private Integer distance;

    public static void main(String[] args) {
        List<HighSchool> highSchoolList = new LinkedList<>();
        highSchoolList.add(new HighSchool("LO im. Jana Zamoyskiego", 173, 15));
        highSchoolList.add(new HighSchool("LO im. Mikołaja Kopernika", 193, 7));
        highSchoolList.add(new HighSchool("LO im. Batalionu Zośka", 122, 6));
        HighSchool theBest = null;
        for (HighSchool schools : highSchoolList) {
            if ((schools.getPoints() <= 180) && (schools.getDistance() <= 10)) {
                if (theBest == null) {
                    theBest = schools;
                } else if (theBest.getPoints() < schools.getPoints()) {
                    theBest = schools;
                }
            }
        }
        if (theBest != null) {
            System.out.println("Apply for " + theBest);
        }
    }
}
