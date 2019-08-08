import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.LinkedList;
import java.util.List;
@AllArgsConstructor
@Data
public class Apartment {
    private String city;
    private double pricePermeter;
    private double area;

    public float getFullPrice(){
        return (float) (0.95*area*pricePermeter);
    }

    public static void main(String[] args) {
        List<Apartment> apartmentList = new LinkedList<>();
        apartmentList.add(new Apartment("Warszawa", 10000, 50));
        apartmentList.add(new Apartment("Kraków", 7000, 50));
        apartmentList.add(new Apartment("Gdańsk", 8000, 30));

        for (int i = 0; i < apartmentList.size(); i++) {
            System.out.println((i + 1) + "." + "Apartment in " +
                    apartmentList.get(i).getCity() + " costs " +
                    apartmentList.get(i).getFullPrice());
        }
    }


}
