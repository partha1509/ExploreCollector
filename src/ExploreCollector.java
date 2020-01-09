import java.util.Optional;

public class ExploreCollector {
    public static void main(String[]args){
       System.out.println(PersonUtilities.greet());

     Optional<String> name= PersonDataUtils.getPersonData()
                .stream()
                .map(Person::getName)
                .filter(n-> n.startsWith("S"))
                .findFirst();

     name.ifPresent(n-> System.out.println(n));

    }

}
