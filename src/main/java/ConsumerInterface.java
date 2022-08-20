import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ConsumerInterface {

    public static void main(String[] args) {

        Consumer<String> s1 = s -> System.out.println(s + " is a good guy");
        Consumer<String> s2 = s -> System.out.println(s.toUpperCase());
        Consumer<String> result = s1.andThen(s2);
        result.accept("Perry");

    }

}
