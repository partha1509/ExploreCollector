import java.util.Arrays;
import java.util.List;

public class PersonDataUtils {

   private static List<Person> personList=
            Arrays.asList(new Person(1,"Josh",45,Arrays.asList("Spring","Spring Boot", "Microservice", "Java"), "Pivotal Lab"),
                    new Person(2,"Robert Martin", 65, Arrays.asList("Java", "Pascal", "SOLID", "TDD","C++","c"),"Open Source Contributor"),
                    new Person(3, "Victor Rantea", 35, Arrays.asList("Clean Code", "TDD", "Java"), "IBM"),
                    new Person(4, "Venkat Subramaniam", 50, Arrays.asList("Java", "Clean Code", "C++","C#","Spring"), "Open Source Contributor"),
                    new Person(5, "Paul", 25, Arrays.asList("C","C++","Java","Python","Scala"), "Google"),
                    new Person(6, "Victor Rantea", 35, Arrays.asList("Clean Code","Java","TDD","Design"), "IBM"),
                    new Person(7, "Tom Harry", 27, Arrays.asList("Django","Angular","JavaScript","J2EE"), "Lowes"),
                    new Person(8, "Kaushik", 40, Arrays.asList("Spring","Spring boot","Java","Ant","Microservice","RXJava","Angular"), "Open Source Contributor"),
                    new Person(9, "Mosh Kyle", 30, Arrays.asList("C++", "JavaScript","CQL","SQL","Java"), "Cerner"),
                    new Person(10, "KaterinaABc", 25, Arrays.asList("JavaScript","ReactJS","Vue.js"), "StartUp"),
                    new Person(11, "Shabaz Khan", 30, Arrays.asList("Java","Spring Boot","TDD", "Microservice", "Cassandra"), "JcPenny")

    );

    public static List<Person> getPersonData(){
        return personList;
    }
}
