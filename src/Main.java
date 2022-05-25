public class Main {
    public static void main(String[] args) {
        int ballance = 200;
        int topUpAmmount = 1500;
        int bonus = 0;

        if (topUpAmmount > 1000) {
            bonus = topUpAmmount / 100;
        }
        System.out.println(
                "Ваш начальный балланс " + ballance +
                        "\nВы пополнили счет на " + topUpAmmount +
                        "\nБонус за пополнение " + bonus +
                        "\nВаш итоговый счет " + (topUpAmmount + bonus + ballance));
    }
}
