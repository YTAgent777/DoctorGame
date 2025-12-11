// Пакеты
package doctorgameone;

// Импорт библиотек
import java.util.Scanner;

public class Program {

    // Главный метод класса
    public static void main(String[] args ) throws InterruptedException {

        // Scanner для String
        Scanner stringsnanner = new Scanner(System.in);

        // Scanner для byte
        Scanner bytesnanner = new Scanner(System.in);

        // Переменные для игры
        byte year;
        byte cofee;
        byte sleephour;
        byte activehour;

        // Thread.sleep(2000) - задержка

        // Вывод приведствия
        System.out.println("Добро пожаловать в 1 игру из серии игр DoctorGame.");
        Thread.sleep(2000);
        // Вывод предложения начать и выхода
        System.out.println("Напишите 'Начать' чтобы начать игру.");
        Thread.sleep(2000);
        System.out.println("Напишите 'Выйти' чтобы выйти из игры.");

        // Условия для начала игры
        String game = stringsnanner.nextLine();
        if (game == "Начать" | game == "'Начать'") {

            System.out.println(1);

        }

        // Условия для выхода из игры
        if (game == "Выйти" | game == "'Выйти'") {

            System.out.println("Осуществляется выход из игры");
            System.exit(0);

        }

    }

}
