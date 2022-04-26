public class Main {
    public static void main(String[] args) {

        int startingScore = 100; // начальный счет
        int replenishmentAmount = 2000; // сумма пополнения
        int sumForBonus = 100; // сумма для начисления бонуса


        int bonusRuble;
        if (replenishmentAmount <= 1000) {
            bonusRuble = replenishmentAmount;

        } else {
            bonusRuble = (replenishmentAmount / sumForBonus) + replenishmentAmount + startingScore;

        }
        System.out.println("Вам начислено:" + bonusRuble);

        int grandTotal = 2120;
    }
}