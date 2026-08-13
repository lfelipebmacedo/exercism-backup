import java.util.Arrays;

class BirdWatcher {
  private final int[] birdsPerDay;

  public BirdWatcher(int[] birdsPerDay) {
    this.birdsPerDay = birdsPerDay.clone();
  }

  public int[] getLastWeek() {
    return birdsPerDay;
  }

  public int getToday() {
    return birdsPerDay[birdsPerDay.length - 1];
  }

  public void incrementTodaysCount() {
    birdsPerDay[birdsPerDay.length - 1] = ++birdsPerDay[birdsPerDay.length - 1];
  }

  public boolean hasDayWithoutBirds() {
    return Arrays.stream(birdsPerDay).anyMatch(birds -> birds == 0);
  }

  public int getCountForFirstDays(int numberOfDays) {
    if (numberOfDays > birdsPerDay.length) {
      numberOfDays = birdsPerDay.length;
    }

    return Arrays.stream(birdsPerDay, 0, numberOfDays).reduce(0, Integer::sum);
  }

  public int getBusyDays() {
    return Arrays.stream(birdsPerDay).reduce(0, (acc, birds) -> {
      if (birds >= 5) {
        acc++;
      }
      return acc;
    });
  }
}
