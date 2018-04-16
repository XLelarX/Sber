package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final String INPUT_EMPLOYEE_NAME = "Введите имя сотрудника : ";
    private static final String INPUT_EMPLOYEE_SURNAME = "Введите фамилию сотрудника : ";
    private static final String INPUT_EMPLOYEE_RANK = "Введите должность сотрудника : ";
    private static final String INPUT_EMPLOYEE_PROFIT = "Введите зарплату сотрудника : ";
    private static final String INPUT_ENDING_CHAR = "Завершить заполнение ?(Д/Н)";
    private static final String INPUT_NEW_ENDING_CHAR = "Введите другую букву(Д/Н)";
    private static final String NOT_RANK = "Такой должности нет ";
    private static final String COMMANDS_OF_MENU = "Введите номер команды : \n1.Заполнение контейнера с клавиатуры\n2.Вывод информации о сотрудниках на экран\n3.Поиск сотрудников, состоящих на заданной должности\n4.Сортировка списка сотрудников по полю фамилия и по полю зарплата";
    private static final String INFORMATION_ABOUT_EMPLOYEE = "Данные работника :\n\t";
    private static final String NO_EMPLOYEES_ON_THIS_RANK = "Сотрудников на данной должности нет";

    private static Scanner input = new Scanner(System.in);
    private static ArrayList<Employee> listOfEmployees = new ArrayList<>();
    private static boolean isNotStop = true;

    public static void main(String[] args) {
        while (isNotStop) {
            showMenu();
            doCommand();
        }
    }

    private static void doCommand() {
        int numberOfCommand = input.nextInt();
        switch (numberOfCommand) {
            case 1:
                fill();
                break;
            case 2:
                show();
                break;
            case 3:
                checkIfEmployeeExists();
                break;
            case 4:
                sort();
                break;
            case 5:
                isNotStop = false;
                break;
        }
    }

    private static void showMenu() {
        System.out.println(COMMANDS_OF_MENU);
    }

    private static void fill() {
        do {
            Employee employee = new Employee();
            System.out.println(INPUT_EMPLOYEE_NAME);
            employee.setName(input.next());

            System.out.println(INPUT_EMPLOYEE_SURNAME);
            employee.setSurname(input.next());
            input.nextLine();

            System.out.println(INPUT_EMPLOYEE_RANK);
            String nameOfRank = getExistingNameOfRank();
            employee.setStatus(Rank.retRank(nameOfRank));

            System.out.println(INPUT_EMPLOYEE_PROFIT);
            employee.setProfit(input.nextInt());

            listOfEmployees.add(employee);

            System.out.println(INPUT_ENDING_CHAR);
        } while (isNotEnding());
    }

    private static boolean isNotEnding() {
        String charOfEnding = input.next();
        while (charOfEnding.charAt(0) != 'Д' && charOfEnding.charAt(0) != 'Н') {
            System.out.println(INPUT_NEW_ENDING_CHAR);
            charOfEnding = input.next();
        }
        return charOfEnding.charAt(0) != 'Д';
    }

    private static void show() {
        for (Employee element : listOfEmployees) {
            System.out.println(INFORMATION_ABOUT_EMPLOYEE + element.toString());
        }
    }

    private static void checkIfEmployeeExists() {
        int i = 1;
        System.out.println(INPUT_EMPLOYEE_RANK);

        String nameOfRank = getExistingNameOfRank();

        for (Employee element : listOfEmployees)
            if (element.getStatus() == Rank.retRank(nameOfRank)) {
                System.out.println(INFORMATION_ABOUT_EMPLOYEE + element.toString());
                i++;
            }
        if (i == 1) System.out.println(NO_EMPLOYEES_ON_THIS_RANK);
    }

    private static String getExistingNameOfRank() {
        String nameOfRank = input.nextLine();
        while (Rank.isNotRankExits(nameOfRank)) {
            System.out.println(NOT_RANK + nameOfRank);
            nameOfRank = input.nextLine();
        }
        return nameOfRank;
    }

    private static void sort() {
        for (int i = 0; i < listOfEmployees.size() - 1; i++)
            for (int j = i + 1; j < listOfEmployees.size(); j++)
                if (listOfEmployees.get(i).compareTo(listOfEmployees.get(j)) > 0) {
                    swapEmployees(i, j);
                }
    }

    private static void swapEmployees(int i, int j) {
        Employee buffer = listOfEmployees.get(j);
        listOfEmployees.set(j, listOfEmployees.get(i));
        listOfEmployees.set(i, buffer);
    }
}
