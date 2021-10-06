public class Bai1 {}
;
// 1.1
class CheckPassFail {
  public static void main(String[] args) {
    int mark = 49;
    System.out.println("The mark is " + mark);

    if (mark >= 50) {
      System.out.println("PASS");
    } else {
      System.out.println("FAIL");
    }
    System.out.println("DONE");
  }
}
// 1.2
class CheckOddEven {
  public static void main(String[] args) {
    int number = 49;
    if (number % 2 == 0) {
      System.out.println("Even Number");
    } else {
      System.out.println("Odd Number");
    }
    System.out.println("Bye!");
  }
}
// 1.3
class PrintNumberInWord {
  public static void main(String[] args) {
    int number = 5;
    if (number == 1) {
      System.out.println("ONE");
    } else if (number == 2) {
      System.out.println("TWO");
    } else if (number == 3) {
      System.out.println("THREE");
    } else if (number == 4) {
      System.out.println("FOUR");
    } else if (number == 5) {
      System.out.println("FIVE");
    } else if (number == 6) {
      System.out.println("SIX");
    } else if (number == 7) {
      System.out.println("SEVEN");
    } else if (number == 8) {
      System.out.println("EIGHT");
    } else if (number == 9) {
      System.out.println("NINE");
    } else {
      System.out.println("OTHER");
    }
    //    Using switch-case
    switch (number) {
      case 1:
        System.out.println("ONE");
        break;
      case 2:
        System.out.println("TWO");
        break;
      case 3:
        System.out.println("THREE");
        break;
      case 4:
        System.out.println("FOUR");
        break;
      case 5:
        System.out.println("FIVE");
        break;
      case 6:
        System.out.println("SIX");
        break;
      case 7:
        System.out.println("SEVEN");
        break;
      case 8:
        System.out.println("EIGHT");
        break;
      case 9:
        System.out.println("NINE");
        break;
      default:
        System.out.println("OTHER");
    }
  }
}

class PrintDayInWord {
  public static void main(String[] args) {
    int dayNumber = 4;
    switch (dayNumber){
      case 0:
        System.out.println("Sunday");
        break;
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
      default:
        System.out.println("Not a valid day");
    }
  }
}
