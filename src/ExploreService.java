import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class ExploreService implements PersonUtilities {

    @Override
    public void getResult() {
        PersonDataUtils.getPersonData()
                .stream()
                .map(Person::getName)
                .filter(n-> n.startsWith("S"))
                .findFirst()
                .ifPresent( System.out::println);
        System.out.println( PersonDataUtils.getPersonData()
                .stream()
                .mapToInt(Person::getAge)
                .reduce(0,(total, age)-> total+age));
        /* Object Oriented Programming: Polymorphism
         Functional Programming : Functional Composition + Lazy Evaluation
         Lazy Evaluation requires Pure function which has no side effect
         Mutability is dangerous but Shared Mutability is devil
         */
        /*
        toList()
         */
        List<Integer> ages= PersonDataUtils.getPersonData()
                .stream()
                .map(Person::getAge)
                .collect(toList());
        System.out.println(ages);
        /*
        toSet()
         */
        Set<String> names= PersonDataUtils.getPersonData()
                .stream()
                .filter(a-> a.getAge()<50)
                .map(n-> n.getName().toUpperCase())
                .collect(toSet());
        System.out.println(names);
        /*
        toMap
         */
        Map<String, Integer> programmerDetails= PersonDataUtils.getPersonData()
                .stream()
                .filter(n-> n.getSpecializations().contains("C"))
                .collect(toMap((p->p.getWorksFor()),(Person::getAge)));
        System.out.println(programmerDetails);
        /*
        partitioningBy()
         */
        System.out.println(
                PersonDataUtils.getPersonData()
                        .stream()
                        .collect(partitioningBy(person -> person.getAge()>30))
        );
        /*
        GroupingBy
         */

        Map<Integer, List<Person>> personGroupByAge= PersonDataUtils.getPersonData()
                .stream()
                .collect(groupingBy(Person::getAge));
        System.out.println(personGroupByAge);
        /*
        Collector(Function, Collector(Function, Collector))
         */
        Map<String, List<Integer>> nameByAge= PersonDataUtils.getPersonData()
                .stream()
                .collect(groupingBy(Person::getName, mapping(Person::getAge, toList())));
        System.out.println(nameByAge);
        Map<String, Integer> countByName= PersonDataUtils.getPersonData()
                .stream()
                .collect(groupingBy(Person::getName, collectingAndThen(counting(),Long::intValue)));
        /*
        Use flatMap() when it is one to many function
         */
        Set<String> specialization=PersonDataUtils.getPersonData()
                .stream()
                .flatMap(person -> person.getSpecializations().stream())
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
        /*
        Mapping and flatMapping is in JDK9+
         */
//        PersonDataUtils.getPersonData()
//                .stream()
//                .collect(groupingBy(Person::getAge,
//                        flatMapping(person->
//                                Stream.of(person.getSpecialization().split(","),
//                                        toList()))));

        /*
        reduce - reduce, sum, max, min, collect
        collect(Collectors)/ collect(Collector)
        mapping()/ flatMapping
        collectingAndThen(Collector, Function)
        groupingBy()

        ()->{
        .....
        ..... Bad Practice
        .....
        return something;
        }
         */
    }
}
