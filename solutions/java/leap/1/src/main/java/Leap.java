class Leap {

  boolean isLeapYear(int year) {
    if (divisibleBy4(year)) {
      if (divisibleBy100(year)) {
        return divisibleBy400(year);
      }
      return true;
    }

    return false;
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
