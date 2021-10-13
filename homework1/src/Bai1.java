import java.util.Scanner;

public class Bai1 {
}
// 1.1
class SquarePattern {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int size;
    System.out.print("Enter the size: ");
    size = in.nextInt();
    for (int row = 1; row <= size; row++) {
      for (int col = 1; col <= size; col++) {
        System.out.print("#");
      }
      System.out.println();
    }
    System.out.println();
    try1(size);
  }
  public static void try1(int size) {
    int row, col;
    row = 1;
    while (row <= size) {
      col = 1;
      while(col <= size) {
        System.out.print("#");
        col += 1;
      }
      System.out.println();
      row += 1;
    }
  }
}

// 1.2
class CheckerPattern {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int size;
    System.out.print("Enter the size: ");
    size = in.nextInt();
    for (int row = 1; row <= size; row++) {
      if (row % 2 == 0) {
        System.out.print(" ");
      }
      for (int col = 1; col <= size; col++) {
        System.out.print("# ");
      }
      System.out.println();
    }
    System.out.println();
  }
}

// 1.3
class TimeTable {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int size;
    System.out.print("Enter the size: ");
    size = in.nextInt();
    for (int col = 1; col  <= size; ++ col) {
      if (col == 1) {
        System.out.printf("%2c |", '*');
      }
      System.out.printf("%4d", col);
    }
    System.out.println();
    for(int seperator = 1; seperator <= 4* size + 4; ++seperator) {
      System.out.print("-");
    }
    System.out.println();
    for (int row = 1; row <= size; row++) {
      for (int col = 1; col <= size ; col++) {
        if (col == 1) {
          System.out.printf("%2d |", row);
        }
        System.out.printf("%4d", row * col);
      }
      System.out.println();
    }
  }
}

// 1.4
class TriangularPattern {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the size: ");
    int size = in.nextInt();

    System.out.println("Type A");
    TriangularPatternA(size);

    System.out.println("Type B");
    TriangularPatternB(size);

    System.out.println("Type C");
    TriangularPatternC(size);

    System.out.println("Type D");
    TriangularPatternD(size);
  }
  public static void TriangularPatternA(int size) {
    for (int row = 1; row <= size; row++) {
      for (int col = 1; col <= row; col++) {
        System.out.print("#");
      }
      System.out.println();
    }
    System.out.println();
  }
  public static void TriangularPatternB(int size) {
    for (int row = 1; row <= size; row++) {
      for (int col = 1; col <= size - row + 1; col++) {
        System.out.print("#");
      }
      System.out.println();
    }
    System.out.println();
  }
  public static void TriangularPatternC(int size) {
    for (int row = 1; row <= size; row++) {
      for (int col = 1; col <= size; col++) {
        if (col < row) {
          System.out.print(" ");
        }
        else {
          System.out.print("#");
        }
      }
      System.out.println();
    }
    System.out.println();
  }
  public static void TriangularPatternD(int size) {
    for (int row = 1; row <= size; row++) {
      for (int col = 1; col <= size; col++) {
        if (col < size - row + 1) {
          System.out.print(" ");
        }
        else {
          System.out.print("#");
        }
      }
      System.out.println();
    }
  }
}

// 1.5
class BoxPattern {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the size: ");
    int size = in.nextInt();

    System.out.println("Box A: ");
    BoxPatternA(size);

    System.out.println("Box B: ");
    BoxPatternB(size);

    System.out.println("Box C: ");
    BoxPatternC(size);

    System.out.println("Box D: ");
    BoxPatternD(size);

  }
  public static void BoxPatternA(int size) {
    for (int row = 1; row <= size; row++) {
      for(int col = 1; col <= size; col++) {
        char printingChar = ' ';
        if (row == 1 || row == size || col == 1 || col == size) {
          printingChar = '#';
        }
        System.out.print(printingChar);
      }
      System.out.println();
    }
    System.out.println();
  }
  public static void BoxPatternB(int size) {
    for (int row = 1; row <= size; row++) {
      for(int col = 1; col <= size; col++) {
        char printingChar = ' ';
        if (row == 1 || row == size || row == col) {
          printingChar = '#';
        }
        System.out.print(printingChar);
      }
      System.out.println();
    }
    System.out.println();
  }
  public static void BoxPatternC(int size) {
    for (int row = 1; row <= size; row++) {
      for(int col = 1; col <= size; col++) {
        char printingChar = ' ';
        if (row == 1 || row == size || col == size - row + 1) {
          printingChar = '#';
        }
        System.out.print(printingChar);
      }
      System.out.println();
    }
    System.out.println();
  }
  public static void BoxPatternD(int size) {
    for (int row = 1; row <= size; row++) {
      for(int col = 1; col <= size; col++) {
        char printingChar = ' ';
        if (row == 1 || row == size || col == row || col == size - row + 1) {
          printingChar = '#';
        }
        System.out.print(printingChar);
      }
      System.out.println();
    }
    System.out.println();
  }
}

// 1.6
class HillPattern {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the rows: ");
    int numberRows = in.nextInt();

    System.out.println("Hill A");
    HillPatternA(numberRows);

    System.out.println("Hill B");
    HillPatternB(numberRows);

    System.out.println("Hill C");
    HillPatternC(numberRows);

    System.out.println("Hill D");
    HillPatternD(numberRows);
  }
  public static void HillPatternA (int numberRows) {
    for (int row = 1; row <= numberRows; row++) {
      String pattern = "#";
      pattern = pattern.repeat(2*row - 1);
      String space = " ";
      space = space.repeat(numberRows - row);
      System.out.println(space + pattern + space);
    }
    System.out.println();
  }
  public static void HillPatternB (int numberRows) {
    for (int row = numberRows; row > 0; row--) {
      String pattern = "#";
      pattern = pattern.repeat(2*row - 1);
      String space = " ";
      space = space.repeat(numberRows - row);
      System.out.println(space + pattern + space);
    }
    System.out.println();
  }
  public static void HillPatternC (int numberRows) {
//    Upper part
    for (int row = 1; row <= numberRows; row++) {
      String pattern = "#";
      pattern = pattern.repeat(2*row - 1);
      String space = " ";
      space = space.repeat(numberRows - row);
      System.out.println(space + pattern + space);
    }
//    Lower part
    for (int row = numberRows-1; row > 0; row--) {
      String pattern = "#";
      pattern = pattern.repeat(2*row - 1);
      String space = " ";
      space = space.repeat(numberRows - row);
      System.out.println(space + pattern + space);
    }
    System.out.println();
  }
  public static void HillPatternD (int numberRows) {
    //    Upper part
    for (int row = 0; row <= numberRows-1; row++) {
      String space = " ", pattern = "#";
      if (row == 0) {
        pattern = pattern.repeat(2*numberRows - 1);
        System.out.println(pattern);
      } else {
        space = space.repeat(2 * row - 1);
        pattern = pattern.repeat(numberRows - row);
        System.out.println(pattern + space + pattern);
      }
    }
//    Lower part
    for (int row = numberRows-2; row >= 0; row--) {
      String space = " ", pattern = "#";
      if (row == 0) {
        pattern = pattern.repeat(2*numberRows - 1);
        System.out.println(pattern);
      } else {
        space = space.repeat(2 * row - 1);
        pattern = pattern.repeat(numberRows - row);
        System.out.println(pattern + space + pattern);
      }
    }
    System.out.println();
  }
}