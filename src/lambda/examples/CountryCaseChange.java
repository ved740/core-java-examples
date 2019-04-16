package javase8.examples;

import java.util.*;

public class CountryCaseChange {
  public static void main(String[] args) {
     List<String> listCountries = Arrays.asList("France", "Germany", "Italy", "Egypt");
     listCountries.sort((String stringArg1, String stringArg2) ->   stringArg1.compareTo(stringArg2)); 
     listCountries.forEach(country -> System.out.println(country));
  }
}

