public class Main {
    public static void main(String[] args) {
        int score = 50; // счет клиента
        int added = 1100; // депозит / пополнение

        int bonus; // объявление переменной для количества бонусов
        if (added > 1000) {
            bonus = added / 100;
        } else {
            bonus = 0;
        }
        int balance = score + added + bonus;
        System.out.println("Ваш итоговый счет: " + balance + " руб.");
        System.out.println("Ваш бонус: " + bonus + " руб.");
    }
}
