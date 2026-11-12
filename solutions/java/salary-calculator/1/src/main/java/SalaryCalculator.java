public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        double multiplier = (daysSkipped >= 5) ? 0.85 : 1.0;
        return multiplier;
    }

    public int bonusMultiplier(int productsSold) {
        int bonus = (productsSold >= 20) ? 13 : 10;
        return bonus;
    }

    public double bonusForProductsSold(int productsSold) {
        double bonus = bonusMultiplier(productsSold);
        return bonus * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double multiplier = salaryMultiplier(daysSkipped);
        double bonus = bonusForProductsSold(productsSold);
        double total = (1000 * multiplier) + bonus;
        double salary = (total >= 2000) ? 2000 : total;

        return salary;
    } 
}
