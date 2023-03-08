import com.alibou.functional.StreamApi;

public class Main {

  public static void main(String[] args) {
    StreamApi api = new StreamApi();

    System.out.println(api.countDevelopersPerGender());
    System.out.println();
    System.out.println();

    api.getAllByGender("M");
    api.getAllByGender("F");

    System.out.println();
    System.out.println();

    api.increaseAllSalariesBy_10_percent();

    System.out.println();
    System.out.println();

    api.sortDevelopersByAge();

    System.out.println();
    System.out.println();

    api.listUniqueSkillsAndUpperCase();

    System.out.println();
    System.out.println();

    api.findAllDevsEarningMoreThan(125);

    System.out.println();
    System.out.println();

    api.findAnyDev_whereNameStartsWith("A");

    System.out.println();
    System.out.println();

    api.findFirst_2_DevelopersStartingFromPosition_3();

    System.out.println();
    System.out.println();

    api.displayFirst_3_developers();

    System.out.println();
    System.out.println();

    api.displayOldestDeveloper();

    System.out.println();
    System.out.println();

    api.displayYoungestDeveloper();

    System.out.println();
    System.out.println();

    api.displayTotalSalaries();
  }
}