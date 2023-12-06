package domain;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestingJava21 {
    public static void main(String[] args){
    //        List<Integer> list = List.of(5,7,2,9,4);
    //
    //        OptionalDouble average = list.stream().mapToInt(Integer::intValue).average();
    //
    //        average.ifPresent(System.out::println);

    //        List<String> listStrings = List.of("ABC","DEF","GHI");
    //
    //        listStrings.stream().map(String::toLowerCase).forEach(System.out::println);
//    List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
//
//    OptionalDouble average =
//        numbers.stream().filter(number -> number % 2 != 0).mapToInt(Integer::intValue).average();
//
//    System.out.println(average);

//        String text = """
//hola adios mañana hola parque casa moto casa libro
//""";
//        Stream<String> stream = Arrays.stream(text.split(" "));
//        stream.distinct().forEach(System.out::println);

        List<String> list = List.of("Spring", "Java", "Scala", "Groovy", "Kotlin", "Ruby", "R");

        List<String> result = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

    System.out.println(result);
  }
}
