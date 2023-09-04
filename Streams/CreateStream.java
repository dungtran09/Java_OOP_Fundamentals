package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {
  public static void main(String[] args) {
    Stream<String> s1 = Stream.of("Java");    
    Stream<Integer> s2 = Stream.of(1, 3, 5, 6 ,9);

    Stream<Integer> s3 = Stream.empty();

    List<String> listOfStrings = new ArrayList<>();
    listOfStrings.add("Hello");
    listOfStrings.add("Word");

    Stream<String> streamOfStrings = listOfStrings.stream();
    Stream<Double> infiniteRandomNumbers = Stream.generate(() -> Math.random()); 
    
  }
}
