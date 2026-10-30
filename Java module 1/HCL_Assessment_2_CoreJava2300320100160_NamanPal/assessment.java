package HCL_Assessment_2_CoreJava2300320100160_NamanPal;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

interface Borrowable {
    boolean isAvailable();

    void borrow();

    void giveBack();
}

abstract class LibraryItem implements Borrowable {

    private static int counter = 1001;

    private final int id;
    private final String title;
    private final int year;
    private boolean available;

    public LibraryItem(String title, int year) {

        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException(
                    "Title cannot be blank."
            );
        }

        int currentYear = Year.now().getValue();

        if (year < 1900 || year > currentYear) {
            throw new IllegalArgumentException(
                    "Year must be between 1900 and " + currentYear
            );
        }

        this.id = counter++;
        this.title = title;
        this.year = year;
        this.available = true;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public void borrow() {
        if (!available) {
            throw new IllegalStateException(
                    "Item is already borrowed."
            );
        }

        available = false;
    }

    @Override
    public void giveBack() {
        if (available) {
            throw new IllegalStateException(
                    "Item has not been borrowed."
            );
        }

        available = true;
    }

    public abstract double lateFee(int daysLate);

    @Override
    public String toString() {
        return new StringBuilder()
                .append("ID: ").append(id)
                .append(", Title: ").append(title)
                .append(", Year: ").append(year)
                .append(", Available: ").append(available)
                .toString();
    }
}


public class assessment {

}
/* libraryitem is an abstract class with privat fields id, title, year, and available. The id is generated from a static counter(1001). use a constructor with validation and the title must not be blank and the year must be btw 1900 and current year. Throw illegalArgumentException otherwise.
Declare abstract double latefee(int dayslate) in libraryitems . Implemet it in the subclasses:
book, magazine and dvd
create the interface boorrowable with boolean isAvailable, void borrow, and void giveBack. Libraryitem iplements it.
Override toString(), in every class using super.toString where appropriate, and use Strigbuider for any report that loops over items.
member has id, name, email, and a list of borrwoed items, validate the email. use this in constructor and provide at least one overloaded constructor.
 demonstarte polymorphism: keep all itmes in a List<Libraryitems> and call latefee() on each without checking the type

 Exception hierarchy
 create this: Libraryexception extends runtimeexception the other extend librartException. Ecach must carry a meaningful message and support a cause.

 */