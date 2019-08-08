import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Data
public class Class {
    private List<String> names;
    

    public static void main(String[] args) {

        List<String> kid = new ArrayList<>();
        Class pupils = new Class(kid);

        pupils.addStudent("Jacek");
        pupils.addStudent("Ania");
        pupils.addStudent("Marek");
        pupils.addStudent("Gresiek");
        pupils.addStudent("Kasia");

        pupils.displayStudents();
        System.out.println();
        System.out.println(pupils.getGirlsCount());

    }

    void addStudent(String name){
        names.add(name);
    }
    void displayStudents(){
        for (String i: names) {
            System.out.print(i+". ");
        }

    }
    int getGirlsCount(){
        int girls = 0;
        for (String i : names) {
            if (i.endsWith("a")){
                girls++;
            }
        } return girls;
    }

}
