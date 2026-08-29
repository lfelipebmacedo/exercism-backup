class Leap {

  boolean isLeapYear(int year) {
    return divisibleBy4(year) && divisibleBy100(year) ? divisibleBy400(year) : divisibleBy4(year);
  }

  private boolean divisibleBy4(int year) {
    return year % 4 == 0;
  }

  private boolean divisibleBy100(int year) {
    return year % 100 == 0;
  }

  private boolean divisibleBy400(int year) {
    return year % 400 == 0;
  }
}
