import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("Хинкалы-аварские.txt");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Рецепт хинкалов аварских");
        System.out.println("ДЛЯ БУЛЬОНА");
        System.out.println("Говядина (мякоть) гр: ");
        int govyadina = scanner.nextInt();
        System.out.println("Вода литров: ");
        int voda = scanner.nextInt();
        System.out.println("Лук репчатый (нарезанный) шт: ");
        int luk = scanner.nextInt();
        System.out.println("Чеснок (нарезанный) гр:");
        int chesnok1 = scanner.nextInt();
        System.out.println("Лавровый лист шт:");
        int list = scanner.nextInt();
        System.out.println("Перец горошком (черный) гр:");
        int perec = scanner.nextInt();
        System.out.println("Соль гр:");
        int sol1 = scanner.nextInt();

        System.out.println("ДЛЯ ТЕСТА");
        System.out.println("Кефир гр:");
        int kefir = scanner.nextInt();
        System.out.println("Пшеничная мука гр:");
        int muka = scanner.nextInt();
        System.out.println("Сода чайных ложек::");
        int soda = scanner.nextInt();
        System.out.println("Соль гр:");
        int sol2 = scanner.nextInt();

        System.out.println("ДЛЯ СОУСА");
        System.out.println("Сметана гр:");
        int smetana = scanner.nextInt();
        System.out.println("Чеснок шт:");
        int chesnol2 = scanner.nextInt();
        System.out.println("Петрушка шт:");
        int petrushka = scanner.nextInt();
        System.out.println("Соль гр:");
        int sol3 = scanner.nextInt();

        System.out.println("Напишите пошаговую инструцию для приготовления хинкалы");
        scanner.nextLine();

        System.out.println("ВАШИ ИНГРИДИЕНТЫ В СТУДИЮ:");

        pw.println("Рецепт хинкалов:\n1. Говядина(мякоть): " + govyadina + " грамм\n2. Вода: " + voda +
                " грамм\n3. Лук (нарезанный): " + luk + " штук\n4. Чеснок: " + chesnok1 + " штук\n5. Лавровый лист: " +
                list + " штук\n6. Перец горошком (черный): " + perec + " штук\n7. Соль: " + sol1 + " грамм\n");
        pw.println("Для теста:\n1. Кефир: " + kefir + " мл\n2. Пшеничная мука: " + muka +
                " грамм\n3. Сода 1 чайная ложка: " + soda + " грамм\n4. Соль: " + sol2 + " грамм\n");
        pw.println("Для соуса:\n1. Сметана: " + smetana + " грамм\n2. Чеснок: " + chesnol2 +
                " штук\n3. Петрушка: " + petrushka + " грамм\n4. Соль: " + sol3 + " грамм\n");

        String hinkali = scanner.nextLine();
        pw.println("Инструкция по приготовлению хинкалов: " + hinkali);
        pw.close();

        Scanner scanner2 = new Scanner(new File("Хинкалы-аварские.txt"));
        while (scanner2.hasNextLine()) {
            System.out.println(scanner2.nextLine());
        }
        scanner2.close();
    }
}
