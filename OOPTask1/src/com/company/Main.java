package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();
        while (true) {
            menu();
            int a = in.nextInt();
            switch (a) {
                case 1:
                    fill(list);
                    break;
                case 2:
                    show(list);
                    break;
                case 3:
                    search(list);
                    break;
                case 4:
                    sort(list);
                    break;
            }
        }
    }

    static void menu() {
        System.out.println("Введите номер команды : \n1.Заполнение контейнера с клавиатуры\n2.Вывод информации о сотрудниках на экран\n3.Поиск сотрудников, состоящих на заданной должности\n4.Сортировка списка сотрудников по полю фамилия и по полю зарплата");
    }

    static void fill(ArrayList<Employee> list) {
        while (true) {
            Employee emp = new Employee();
            System.out.println("Введите имя сотрудника : ");
            emp.setName(in.next());
            System.out.println("Введите фамилию сотрудника : ");
            emp.setSurname(in.next());
            in.nextLine();
            System.out.println("Введите должность сотрудника : ");
            String a = in.nextLine();
            while(!Rank.isRankExits(a)) {
                System.out.println("Такой должности нет " + a);
                a = in.nextLine();
            }
            emp.setStatus(Rank.retRank(a));
            System.out.println("Введите зарплату сотрудника : ");
            emp.setProfit(in.nextInt());
            list.add(emp);
            System.out.println("Завершить заполнение ?");
            String str = in.next();
            while (str.charAt(0) != 'Д' && str.charAt(0) != 'Н') {
                System.out.println("Введите другую букву(Д/Н)");
                str = in.next();
            }
            if (str.charAt(0) == 'Д') break;
        }
    }

    static void show(ArrayList<Employee> list) {
        int i = 1;
        for (Employee element : list) {
            System.out.println("Данные " + (i++) + " работника :\n\t" + element.getName() + " " + element.getSurname() + " " + element.getStatus().getName() + " " + element.getProfit());
        }
    }

    static void search(ArrayList<Employee> list) {
        int i = 1;
        System.out.println("Введите название должности");
        in.nextLine();
        String a = in.nextLine();
        while(!Rank.isRankExits(a)) {
            System.out.println("Такой должности нет " + a);
            a = in.nextLine();
        }
        for (Employee element : list) {
            if (element.getStatus() == Rank.retRank(a))
                System.out.println("Данные " + (i++) + " работника, на данной сложности :\n\t" + element.getName() + " " + element.getSurname() + " " + element.getStatus().getName() + " " + element.getProfit());
        }
        if (i == 1) System.out.println("Сотрудников на данной должности нет");
    }

    static void sort(ArrayList<Employee> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++){
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    Employee buf = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i, buf);
                }
            }
        }
    }
}
