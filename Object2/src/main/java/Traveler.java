import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@Data
public class Traveler {
    private String traveler;
    private Set<String> city;

    public void visit(String places){
        city.add(places);
    }

    public static void main(String[] args) {
        Set<String> visited = new HashSet<>();
        Traveler first = new Traveler("Makłowicz",visited);
        first.visit("Warsaw");
        first.visit("New-York");
        first.visit("New-York");
        first.visit("Brasilia");
        first.visit("Warsaw");
        first.visit("Moscow");

        System.out.println(first.getTraveler()+" odwiedził "+ visited);
    }


}
