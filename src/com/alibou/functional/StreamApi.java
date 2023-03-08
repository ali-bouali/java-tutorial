package com.alibou.functional;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApi {

  private final List<SoftwareDeveloper> softwareDevelopers = List.of(
      new SoftwareDeveloper("Rico", "Riddle", 21, 122.2, List.of("Java", "Spring"), "M"),
      new SoftwareDeveloper("Jeremiah", "Bonilla", 34, 127.2, List.of("Ruby", "Go", "Docker"), "M"),
      new SoftwareDeveloper("Kamal", "Waller", 32, 129.2, List.of("AWS", "Azure", "Spring"), "M"),
      new SoftwareDeveloper("Mariya", "Kent", 45, 120.2, List.of("Hibernate", "Java", "Kotlin", "K8s"), "F"),
      new SoftwareDeveloper("Ali", "Bouali", 18, 123.2, List.of("C", ".NET", "Angular"), "M"),
      new SoftwareDeveloper("Miriam", "Merrill", 39, 125.2, List.of("Angular", "Javascript", "Typescript"), "F"),
      new SoftwareDeveloper("Djamal", "Francis", 56, 125.2, List.of("Marketing", "Design"), "M"),
      new SoftwareDeveloper("Briony", "Finch", 27, 126.2, List.of("Docker", "GitHub Actions", "GitLab CI"), "M"),
      new SoftwareDeveloper("Joanna", "Maddox", 25, 128.2, List.of("Management", "Team building"), "F")
  );

  public Map<String, Long> countDevelopersPerGender() {
    return softwareDevelopers
        .stream()
        .collect(Collectors.groupingBy(SoftwareDeveloper::getGender, Collectors.counting()));
  }

  public void getAllByGender(String gender) {
    softwareDevelopers
        .stream()
        .filter(dev -> gender.equals(dev.getGender()))
        .forEach(System.out::println);
  }

  public void increaseAllSalariesBy_10_percent() {
    softwareDevelopers
        .stream()
        .map(dev ->
            new SoftwareDeveloper(
                dev.getFirstname(),
                dev.getLastname(),
                dev.getAge(),
                dev.getSalary() * 1.10,
                dev.getSkills(),
                dev.getGender()
            )
        )
        .forEach(System.out::println);
  }

  public void sortDevelopersByAge() {
    softwareDevelopers
        .stream()
        .sorted(Comparator.comparing(SoftwareDeveloper::getAge))
        .forEach(System.out::println);
  }

  public void listUniqueSkillsAndUpperCase() {
    softwareDevelopers
        .stream()
        .map(SoftwareDeveloper::getSkills)
        .flatMap(List::stream)
        .map(String::toUpperCase)
        .distinct()
        .forEach(System.out::println);
  }

  public void findAllDevsEarningMoreThan(double salary) {
    softwareDevelopers
        .stream()
        .filter(dev -> dev.getSalary() >= salary)
        .forEach(System.out::println);
  }

  public void findAnyDev_whereNameStartsWith(String namePortion) {
    softwareDevelopers
        .stream()
        .filter(dev -> dev.getFirstname().startsWith(namePortion))
        .findAny()
        .ifPresent(System.out::println);
  }

  public void findFirst_2_DevelopersStartingFromPosition_3() {
    softwareDevelopers
        .stream()
        .skip(3)
        .limit(2)
        .forEach(System.out::println);
  }

  public void displayFirst_3_developers() {
    softwareDevelopers
        .stream()
        .limit(2)
        .forEach(System.out::println);
  }

  public void displayOldestDeveloper() {
    softwareDevelopers
        .stream()
        .max(Comparator.comparing(SoftwareDeveloper::getAge))
        .ifPresent(System.out::println);
  }
  public void displayYoungestDeveloper() {
    softwareDevelopers
        .stream()
        .min(Comparator.comparing(SoftwareDeveloper::getAge))
        .ifPresent(System.out::println);
  }

  public void displayTotalSalaries() {
    var totalSalaries = softwareDevelopers
        .stream()
        .map(SoftwareDeveloper::getSalary)
        .reduce(0.0, Double::sum);
    System.out.println("Total salaries: " + totalSalaries);
  }



}
