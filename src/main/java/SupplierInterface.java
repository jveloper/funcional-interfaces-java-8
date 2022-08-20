import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierInterface {

    public static void main(String[] args) {

        Supplier<Stream<String>> streamSupplier = () -> Stream.of("Michael", "Rose", "John", "Mason", "Harry", "Patrick", "Ema", "Joe");

        Predicate<String> containsE = name -> name.contains("e");
        Predicate<String> greaterThan5 = name -> name.length() > 3;

        Stream<String> streamContainsE = streamSupplier.get().filter(containsE);
        streamContainsE.forEach(System.out::println);

        Stream<String> streamGreaterThan5 = streamSupplier.get().filter(greaterThan5);
        streamGreaterThan5.forEach(System.out::println);

    }

}
