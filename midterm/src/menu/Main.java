package menu;

public class Main implements iScanner{
  public static void main(String[] args) {
    while (true) {
      System.out.println("1. Homework 1");
      System.out.println("2. Homework 2");
      System.out.println("3. Homework 3");
      System.out.println("4. Homework 4");
      System.out.println("5. Homework 5");
      System.out.println("6. Homework 6");
      System.out.println("7. Lab 1");
      System.out.println("8. Lab 2");
      System.out.println("0. Exit");
      System.out.println("Choose file to exec: ");
      int select = scanner.nextInt();
      switch (select) {
        case 1:
          HomeWork1.main(null);
          break;
        case 2:
          HomeWork2.main(null);
          break;
        case 3:
          HomeWork3.main(null);
          break;
        case 4:
          HomeWork4.main(null);
          break;//      Scanner scanner = new Scanner(System.in);
        case 5:
          HomeWork5.main(null);
          break;
        case 6:
          HomeWork6.main(null);
          break;
        case 7:
          Lab1.main(null);
          break;
        case 8:
          Lab2.main(null);
          break;
        case 0:
          System.out.println("Bye");
          return;
        default:
          System.out.println("Please choose number in [1-8]");
          break;
      }
    }
  }
}
