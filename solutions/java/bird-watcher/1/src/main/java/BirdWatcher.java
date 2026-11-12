import java.util.Arrays;
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        int[] lastWeek = {0,2,5,3,7,8,4};
        return lastWeek;
    }

    public int getToday() {
        int day = birdsPerDay.length - 1;
        return birdsPerDay[day];
    }

    public void incrementTodaysCount() {
        int day = birdsPerDay.length - 1;
        birdsPerDay[day] += 1;
    }

    public boolean hasDayWithoutBirds() {
        return Arrays.stream(birdsPerDay).anyMatch(num -> num == 0);
    }

    public int getCountForFirstDays(int numberOfDays) {
        int soma = 0;

        if(numberOfDays > birdsPerDay.length)
            numberOfDays = birdsPerDay.length;
        
        for(int i = 0; i < numberOfDays; i++){
            soma += birdsPerDay[i];
        }
        return soma;
    }

    public int getBusyDays() {
        int busyDays = 0;
        int contagem = birdsPerDay.length;
        for(int i = 0; i < contagem; i++){
            if(birdsPerDay[i] >= 5)
                busyDays++;
        }
        return busyDays;
    }
}
