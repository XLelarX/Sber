package com.company;

import java.util.ArrayList;
import java.util.Scanner;


class Employee implements Comparable {
    private String name;
    private String surname;
    private String status;
    private int profit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    @Override
    public int compareTo(Object o) {

        if (o instanceof Employee) {
            Employee second = (Employee) o;
            if ((second.getSurname().compareToIgnoreCase(this.surname) > 0) && (second.getProfit() > this.profit))
                return -1;
            if ((second.getSurname().compareToIgnoreCase(this.surname) < 0) && (second.getProfit() < this.profit))
                return 1;
            if ((second.getSurname().compareToIgnoreCase(this.surname) > 0) && (second.getProfit() > this.profit))
                return -1;
            if ((second.getSurname().compareToIgnoreCase(this.surname) < 0) && (second.getProfit() < this.profit))
                return 1;

            if (second.getProfit() == this.profit) {
                if (second.getSurname().compareToIgnoreCase(this.surname) > 0)
                    return -1;
                if (second.getSurname().compareToIgnoreCase(this.surname) < 0)
                    return 1;
            }

            if (second.getSurname().compareToIgnoreCase(this.surname) == 0) {
                if (second.getProfit() > this.profit)
                    return -1;
                if (second.getProfit() < this.profit)
                    return 1;
            }
        }
        return 0;
    }
}

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
        boolean end = true;
        while (end) {
            Employee emp = new Employee();
            System.out.println("Введите имя сотрудника : ");
            emp.setName(in.next());
            System.out.println("Введите фамилию сотрудника : ");
            emp.setSurname(in.next());
            System.out.println("Введите должность сотрудника : ");
            emp.setStatus(in.next());
            System.out.println("Введите зарплату сотрудника : ");
            emp.setProfit(in.nextInt());
            list.add(emp);
            System.out.println("Завершить заполнение ?");
            String str = in.next();
            if (str.charAt(0) == 'Д') end = !end;
        }
    }

    static void show(ArrayList<Employee> list) {
        int i = 1;
        for (Employee element : list) {
            System.out.println("Данные " + (i++) + " работника :\n\t" + element.getName() + " " + element.getSurname() + " " + element.getStatus() + " " + element.getProfit());
        }
    }

    static void search(ArrayList<Employee> list) {
        int i = 1;
        System.out.println("Введите название должности");
        String str = in.next();
        for (Employee element : list) {
            if (element.getStatus().equals(str))
                System.out.println("Данные " + (i++) + " работника, на данной сложности :\n\t" + element.getName() + " " + element.getSurname() + " " + element.getStatus() + " " + element.getProfit());
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
