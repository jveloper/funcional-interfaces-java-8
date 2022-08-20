import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateInterface {

    public static void main(String[] args) {

        Stream<String> list = Stream.of("Michael", "Rose", "John", "Mason", "Harry", "Patrick");

        Predicate<String> containsA = name -> name.contains("a");
        Predicate<String> greaterThan5 = name -> name.length() > 5;

        Stream<String> listA = list.filter(containsA.and(greaterThan5));
        listA.forEach(System.out::println);

    }
}
