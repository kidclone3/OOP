package hw5.part1.animal;

public class Animal {
  private final String name;

  public Animal(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return String.format("Animal[name=\"%s\"]", name);
  }
}
