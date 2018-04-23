package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class DequeUiHandler implements UiHandler {
    private static final String CHOOSE_COMMAND = "Выберите команду : ";
    private static final String COMMAND_LIST = "1. showItems\n2. isEmpty\n3. contains\n4. addFirst\n5. addLast\n6. getFirst\n7. getLast\n8. removeFirst\n9. removeLast\n10. pollFirst\n11. pollLast\n12. goToMainMenu";
    private static final String ENTER_STRING_FOR_CHECK = "Введите строку для проверки : ";
    private static final String ENTER_STRING_FOR_ADD = "Введите строку для добавления : ";

    private final Scanner input = new Scanner(System.in);
    private final Deque<String> deque = new ArrayDeque<>();

    public void call() {
        while (true) {
            showMenu();
            int numberOfChoose = input.nextInt();
            switch (numberOfChoose) {
                case 1:
                    System.out.println(deque);
                    break;

                case 2:
                    System.out.println(String.format("Deque.isEmpty() == %b", deque.isEmpty()));
                    break;

                case 3: {
                    System.out.println(ENTER_STRING_FOR_CHECK);
                    String item = input.next();
                    System.out.println(String.format("Deque.contains(%s) == %b", item, deque.contains(item)));
                }
                break;

                case 4: {
                    System.out.println(ENTER_STRING_FOR_ADD);
                    String item = input.next();

                    deque.addFirst(item);
                    System.out.println(String.format("Deque.addFirst(%s)", item));
                }
                break;

                case 5: {
                    System.out.println(ENTER_STRING_FOR_ADD);
                    String item = input.next();

                    deque.addLast(item);
                    System.out.println(String.format("Deque.addLast(%s)", item));
                }
                break;

                case 6:
                    try {
                        System.out.println(String.format("Deque.getFirst() == %s", deque.getFirst()));
                    } catch (NoSuchElementException e) {
                        System.out.println("Deque.getFirst() == " + e);
                    }
                    break;

                case 7:
                    try {
                        System.out.println(String.format("Deque.getLast() == %s", deque.getLast()));
                    } catch (NoSuchElementException e) {
                        System.out.println("Deque.getLast() == " + e);
                    }
                    break;

                case 8:
                    try {
                        System.out.println(String.format("Deque.removeFirst() == %s", deque.removeFirst()));
                    } catch (NoSuchElementException e) {
                        System.out.println("Deque.removeFirst() == " + e);
                    }
                    break;

                case 9:
                    try {
                        System.out.println(String.format("Deque.removeLast() == %s", deque.removeLast()));
                    } catch (NoSuchElementException e) {
                        System.out.println("Deque.removeLast() == " + e);
                    }
                    break;

                case 10:
                    System.out.println(String.format("Deque.pollFirst() == %s", deque.pollFirst()));
                    break;

                case 11:
                    System.out.println(String.format("Deque.pollLast() == %s", deque.pollLast()));
                    break;

                case 12:
                    return;
            }
        }
    }

    private static void showMenu() {
        System.out.println(CHOOSE_COMMAND);
        System.out.println(COMMAND_LIST);
    }

}
