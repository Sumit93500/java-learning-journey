public class SwitchStatements {
  public static void main(String[] args) {

    //old syntax
    int day = 4;
    switch(day){
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
        default:
        System.out.println("Invalid day");
    }

    //new syntax

    String day1 = "Monday";
    switch(day1){
      case "Monday" -> System.out.println("1st day of the week");
      case "Tuesday" -> System.out.println("2nd day of the week");
      default -> System.out.println("Invalid day");
    }
  }
}
