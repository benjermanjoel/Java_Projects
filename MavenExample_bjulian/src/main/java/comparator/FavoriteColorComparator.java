package comparator;

import model.Person;

import java.util.Comparator;

public class FavoriteColorComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return person1.getFavoriteColor().compareTo(person2.getFavoriteColor());
    }
}
