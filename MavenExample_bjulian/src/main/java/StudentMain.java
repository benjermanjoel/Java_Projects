import model.Person;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import utility.WorkbookUtility;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class StudentMain {

    public final static String INPUT_FILE = "src//main//webapp//assets//JavaWebProgramming.xlsx";

    public static void main(String[] args) {

        final File inputFile = new File(INPUT_FILE);

        try {
            final List<Person> people = WorkbookUtility.retrievePeopleFromWorkbook(inputFile);

            for(final Person person : people) {
                if (person.getFavoriteColor().equals("Green")) {
                    System.out.println(person);
                }
            }
        } catch (IOException | InvalidFormatException e) {
            e.printStackTrace();
        }


    }
}
