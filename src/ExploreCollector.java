import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class ExploreCollector {
    public static void main(String[]args){
       System.out.println(PersonUtilities.greet());

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



    }


}
