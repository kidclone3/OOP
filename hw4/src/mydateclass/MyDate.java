package mydateclass;

// 1.5

public class MyDate {
  private int year;
  private int month;
  private int day;
  static final String[] MONTHS = {
    "Zero", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
  };
  static final String[] DAYS = {
    "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
  };
  static final int[] DAY_IN_MONTHS = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

  public MyDate() {}

  public MyDate(int year, int month, int day) {
    this.day = day;
    this.month = month;
    this.year = year;
    if (isLeapYear(year)) DAY_IN_MONTHS[2] = 29;
  }

  public boolean isLeapYear(int year) {
    return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
  }

  public boolean isValidDate(int year, int month, int day) {
    if (month < 1 || month > 12) return false;
    if (year < 1 || year > 9999) return false;

    if (day < 1 || day > DAY_IN_MONTHS[month]) return false;
    return true;
  }

  public int getDayOfWeek(int y, int m, int d) {
    int DayOfWeek;
    y -= (14 - m) / 12;
    m += 12 * ((14 - m) / 12) - 2;
    DayOfWeek = (d + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
    return DayOfWeek;
  }

  public void setDate(int year, int month, int day) {
    if (!isValidDate(year, month, day))
      throw new IllegalArgumentException("Invalid year, month, or day!");
    else {
      setYear(year);
      setMonth(month);
      setDay(day);
    }
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    if (year >= 1 && year <= 9999) this.year = year;
    else throw new IllegalArgumentException("Invalid year!");
  }

  public int getMonth() {
    return month;
  }

  public void setMonth(int month) {
    if (month >= 1 && month <= 12) this.month = month;
    else throw new IllegalArgumentException("Invalid month!");
  }

  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    if (day >= 1 && day <= DAY_IN_MONTHS[month]) this.day = day;
    else throw new IllegalArgumentException("Invalid day!");
  }

  public String toString() {
    int weekDay = getDayOfWeek(year, month, day);
    return String.format("%1$s %2$d %3$s %4$d", DAYS[weekDay], day, MONTHS[month], year);
  }

  public MyDate nextDay() {
    if (1 <= day && day < DAY_IN_MONTHS[month]) day++;
    else if (day == DAY_IN_MONTHS[month]) {
      day = 1;
      if (month < 12) month++;
      else if (month == 12) {
        month = 1;
        year++;
      }
    }
    setDate(year, month, day);
    return this;
  }

  public MyDate nextMonth() {
    if (1 <= month && month < 12) {
      if (day == DAY_IN_MONTHS[month]) day = DAY_IN_MONTHS[month + 1];
      month++;
    } else if (month == 12) {
      if (day == DAY_IN_MONTHS[month]) day = DAY_IN_MONTHS[1];
      month = 1;
      year++;
    }
    setDate(year, month, day);
    return this;
  }

  public MyDate nextYear() {
    if (year > 9999) System.out.println("Year out of range!");
    if (month == 2 && day == DAY_IN_MONTHS[month]) {
      year++;
      if (isLeapYear(year)) DAY_IN_MONTHS[2] = 29;
      else DAY_IN_MONTHS[2] = 28;
      day = DAY_IN_MONTHS[month];
    } else year++;
    setDate(year, month, day);
    return this;
  }

  public MyDate previousDay() {
    if (1 < day && day <= DAY_IN_MONTHS[month]) day--;
    else if (day == 1) {
      if (month > 1) month--;
      else if (month == 1) {
        month = 12;
        year--;
      }
      day = DAY_IN_MONTHS[month];
    }
    setDate(year, month, day);
    return this;
  }

  public MyDate previousMonth() {
    if (1 < month && month <= 12) {
      if (day == DAY_IN_MONTHS[month]) day = DAY_IN_MONTHS[month - 1];
      month--;
    } else if (month == 1) {
      if (day == DAY_IN_MONTHS[month]) day = DAY_IN_MONTHS[12];
      month = 12;
      year--;
    }
    setDate(year, month, day);
    return this;
  }

  public MyDate previousYear() {
    if (year > 9999) System.out.println("Year out of range!");
    if (month == 2 && day == DAY_IN_MONTHS[month]) {
      year--;
      if (isLeapYear(year)) DAY_IN_MONTHS[2] = 29;
      else DAY_IN_MONTHS[2] = 28;
      day = DAY_IN_MONTHS[month];
    } else year--;
    setDate(year, month, day);
    return this;
  }
}
