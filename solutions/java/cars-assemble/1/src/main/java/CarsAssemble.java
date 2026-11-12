public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int carHour = 221;

        if (speed >= 1 && speed <=4)
            return speed * carHour;
        else if (speed <= 8)
            return (speed * carHour) * 0.90;
        else if (speed == 9)
            return (speed * 221) * 0.80;
        else
            return (speed * 221) * 0.77;
    }

    public int workingItemsPerMinute(int speed) {
        double carHour = productionRatePerHour(speed);
        int carMinute = (int) (carHour / 60);
        return carMinute;
    }
}
