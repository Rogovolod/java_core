package calculator;

public class WeeklySalary {

    public static int calculate(int[] hours) {
        int wage = 0;
        for (int i = 0; i < hours.length - 2; i++) {
            wage += hours[i] <= 8 ? hours[i] * 10 : 80 + (hours[i] - 8) * 15;
        }
        for (int i = 5; i <= 6; i++) {
            wage += hours[i] <= 8 ? hours[i] * 20 : 160 + (hours[i] - 8) * 30;
        }
        return wage;
    }

}


