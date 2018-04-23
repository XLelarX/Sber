package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetUiHandler implements UiHandler {
    private static final String CHOOSE_COMMAND = "Выберите команду : ";
    private static final String COMMAND_LIST = "1. showItems\n2. isEmpty\n3. contains\n4. add\n5. remove\n6. goToMainMenu";
    private static final String ENTER_STRING_FOR_CHECK = "Введите строку для проверки : ";
    private static final String ENTER_STRING_FOR_ADD = "Введите строку для добавления : ";
    private static final String ENTER_STRING_FOR_REMOVE = "Введите строку для удаления : ";

    private final Scanner input = new Scanner(System.in);
    private final Set<String> set = new HashSet<>();

    public void call() {
        while (true) {
            showMenu();
            int numberOfChoose = input.nextInt();
            switch (numberOfChoose) {
                case 1:
                    System.out.println(set);
                    break;

                case 2:
                    System.out.println(String.format("Set.isEmpty() == %b", set.isEmpty()));
                    break;

                case 3: {
                    System.out.println(ENTER_STRING_FOR_CHECK);
                    String item = input.next();
                    System.out.println(String.format("Set.contains(%s) == %b", item, set.contains(item)));
                }
                break;

                case 4: {
                    System.out.println(ENTER_STRING_FOR_ADD);
                    String item = input.next();
                    set.add(item);
                    System.out.println(String.format("Set.add(%s)", item));
                }
                break;

                case 5: {
                    System.out.println(ENTER_STRING_FOR_REMOVE);
                    String item = input.next();
                    set.remove(item);
                    System.out.println(String.format("Set.remove(%s)", item));
                }
                break;

                case 6:
                    return;
            }
        }
    }

    private static void showMenu() {
        System.out.println(CHOOSE_COMMAND);
        System.out.println(COMMAND_LIST);
    }

}
