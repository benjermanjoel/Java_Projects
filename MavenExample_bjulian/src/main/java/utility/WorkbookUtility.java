package utility;

import model.Person;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WorkbookUtility {

    public final static String INPUT_FILE = "assets//JavaWebProgramming.xlsx";

    public static List<Person> retrievePeopleFromWorkbook(final File inputFile) throws IOException, InvalidFormatException {
        final List<Person> people = new ArrayList<>();

        final Workbook workbook = WorkbookFactory.create(inputFile);
        final Sheet sheet = workbook.getSheetAt(0);

        for(final Row row : sheet) {
            final Cell firstNameCell = row.getCell(0);
            final Cell lastNameCell = row.getCell(1);
            final Cell ageCell = row.getCell(2);
            final Cell favoriteColor = row.getCell(3);

            final Person person = new Person(firstNameCell.getStringCellValue().trim(),
                    lastNameCell.getStringCellValue().trim(),
                    (int) ageCell.getNumericCellValue(),
                    favoriteColor.getStringCellValue().trim());

            people.add(person);
        }

        return people;
    }
}
