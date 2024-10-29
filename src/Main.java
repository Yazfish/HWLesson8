// Домашняя работа 8, массивы, урок 2.
// Кузьмин Сергей
// Java-разработчик IND 36.0
//
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1 \n");
        int[] weeklySalary = {11, 20, 30, 20, 53};
        double sum = 0d;
        for (double element : weeklySalary) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
        System.out.println("\n Задача 2 \n");
        int maxWeeklySalary = weeklySalary[0];
        int minWeeklySalary = weeklySalary[0];
        for (int i = 1; i < weeklySalary.length; i++) {
            if (weeklySalary[i] > maxWeeklySalary) {
                maxWeeklySalary = weeklySalary[i];
            }
            if (weeklySalary[i] < minWeeklySalary) {
                minWeeklySalary = weeklySalary[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю " +
                "составила " + minWeeklySalary + " рублей. " +
                "\nМаксимальная сумма трат за неделю составила " + maxWeeklySalary + " рублей.");
        System.out.println("\n Задача 3 \n");
        int weeklySalarySize = weeklySalary.length;
        double sum1;
        sum1 = sum / weeklySalarySize;
        System.out.println("Средняя сумма трат за месяц составила " + sum1 + " рублей.");
        System.out.println("\n Задача 4 \n");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}


