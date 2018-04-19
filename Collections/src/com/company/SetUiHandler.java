package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetUiHandler {
    private static final String CHOOSE_COMMAND = "Выберите команду : ";
    private static final String COMMAND_LIST = "1. isEmpty\n2. contains\n3. add\n4. clear\n5. remove\n6. removeByIndex\n7. showItems\n8. goToMainMenu";
    private static final String ENTER_STRING_FOR_CHECK = "Введите строку для проверки : ";
    private static final String ENTER_STRING_FOR_ADD = "Введите строку для добавления : ";
    private static final String ENTER_NUMBER_OF_STRING = "Введите номер места строки : ";
    private static final String ENTER_STRING_FOR_REMOVE = "Введите строку для удаления : ";

    private final Scanner input = new Scanner(System.in);
    private final Set<String> set = new HashSet<>();

    public void call() {
        while (true) {
            showMenu();
            int numberOfChoose = input.nextInt();
            switch (numberOfChoose) {
                case 1:
                    System.out.println(String.format("Set.isEmpty() == %b", set.isEmpty()));
                    break;

                case 2: {
                    System.out.println(ENTER_STRING_FOR_CHECK);
                    String item = input.next();
                    System.out.println(String.format("Set.contains(%s) == %b", item, set.contains(item)));
                }
                break;

                case 3: {
                    System.out.println(ENTER_STRING_FOR_ADD);
                    String item = input.next();
                    set.add(item);
                    System.out.println(String.format("Set.add(%s)", item));
                }
                break;

                case 4:
                    set.clear();
                    break;

                case 5: {
                    System.out.println(ENTER_STRING_FOR_REMOVE);
                    String item = input.next();
                    set.remove(item);
                    System.out.println(String.format("Set.remove(%s)", item));
                }
                break;

                case 6: {
                    System.out.println(ENTER_STRING_FOR_REMOVE);
                    String item = input.next();
                    System.out.println(ENTER_NUMBER_OF_STRING);
                    int position = input.nextInt();
                    System.out.println(String.format("Set.removeByIndex(%d, %s)", position, item));
                }
                break;

                case 7:
                    show();
                    break;

                case 8:
                    return;
            }
        }
    }

    private static void showMenu() {
        System.out.println(CHOOSE_COMMAND);
        System.out.println(COMMAND_LIST);
    }

    private void show() {
        for (String element : set) {
            System.out.println(element);
        }
    }
}
