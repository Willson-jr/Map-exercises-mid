
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@AllArgsConstructor
@Data

public class Book {
    private String title;
    private String author;
    private Integer pages;
    private LocalDate date;

    public long getDays() {
//      Period period = Period.between(date, LocalDate.now());
//      return period.getDays();
        return ChronoUnit.DAYS.between(date,LocalDate.now());
    }


    public static void main(String[] args) {
        List<Book> books = new LinkedList<>();
        books.add(new Book(
                "Harry Potter",
                "J.K.Rowling",
                1200,
                LocalDate.of(2019, 05, 6)));
        books.add(new Book(
                "James Bond",
                "Ian Fleming",
                1200,
                LocalDate.of(1945, 05, 6)));

//        Book book = new Book(
//                "Harry Potter",
//                "J.K.Rowling",
//                1200,
//                LocalDate.of(2019, 05, 6));

        for (Book book : books) {
            System.out.println("book "+book.getTitle()+" is "+ book.getDays()+" days old");
        }
    }

}
