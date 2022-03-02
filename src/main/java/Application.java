import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Application {
    public static void main(String[] arg) throws IOException {
        List<String> lines =  Files.readAllLines(Paths.get("C:\\switips project\\test\\src\\main\\java\\persons.txt"));
        List<Person> personList = new ArrayList<Person>();
        for (int i = 0; i < lines.size(); i+=3) {
            Person person = new Person(lines.get(i), lines.get(i+1), Integer.parseInt(lines.get(i+2)));
            personList.add(person);
        }

        personList.sort(Comparator.comparing(Person::getAge));
        personList.forEach(System.out::println);
    }

}
