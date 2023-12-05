package Students;

import java.util.ArrayList;
import java.util.Scanner;

public class Task implements MainTask{

    public static void main(String[] args) {
        ArrayList <String> toDoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nВыберите действие: ");
            System.out.println("1 - Добавить задачу: ");
            System.out.println("2 - Отменить задачу как выполненую и удалить ");
            System.out.println("3 - Отобразить текущий список дел ");
            System.out.println("0 - Выйти из программы");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Введите новую задачу: ");
                    String task = scanner.nextLine();
                    toDoList.add(task);
                    System.out.println("Задача добавлена! ");
                    break;
                case 2:
                    if (!
                    toDoList.isEmpty()) {
                        System.out.println("Выберите номер задачи для отметки выполненной: ");
                        for (int i = 0; i < toDoList.size(); i++) {
                            System.out.println((i + 1) + ". " + toDoList.get(i));
                        }
                        int taskIndex = scanner.nextInt();
                        if (taskIndex > 0 && taskIndex <= toDoList.size()) {
                            toDoList.remove(taskIndex - 1);
                            System.out.println("Задача выполнена и удалена! ");
                        }
                        else {
                            System.out.println("Некоректный номер задачи! ");
                        }
                    } else {
                        System.out.println("Список дел пуст. ");
                    }
                    break;
                case 3:
                    if (!
                    toDoList.isEmpty()) {
                        System.out.println("Текущий список дел: ");
                        for (int i = 0; i < toDoList.size(); i++) {
                            System.out.println((i + 1) + ". " + toDoList.get(i));
                        }
                    } else {
                        System.out.println("Список дел пуст.");
                    }
                    break;
                case 0:
                    System.out.println("Программа завершена. ");
                    System.exit(0);
                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
        }
        }



    }

    @Override
    public void completedTask() {

    }

    @Override
    public void deleteTask() {

    }
}
