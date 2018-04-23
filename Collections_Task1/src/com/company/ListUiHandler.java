package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListUiHandler implements UiHandler {
    private static final String CHOOSE_COMMAND = "Выберите команду : ";
    private static final String COMMAND_LIST = "1. isEmpty\n2. contains\n3. add\n4. addByIndex\n5. remove\n6. removeByIndex\n7. showItems\n8. goToMainMenu";
    private static final String ENTER_STRING_FOR_CHECK = "Введите строку для проверки : ";
    private static final String ENTER_STRING_FOR_ADD = "Введите строку для добавления : ";
    private static final String ENTER_NUMBER_OF_STRING = "Введите номер места строки : ";
    private static final String ENTER_STRING_FOR_REMOVE = "Введите строку для удаления : ";

    private final Scanner input = new Scanner(System.in);
    private final List<String> list = new ArrayList<>();

    public void call() {
        while (true) {
            showMenu();
            int numberOfChoose = input.nextInt();
            switch (numberOfChoose) {
                case 1:
                    System.out.println(String.format("List.isEmpty == %b", list.isEmpty()));
                    break;

                case 2:
                    System.out.println(ENTER_STRING_FOR_CHECK);
                    String item = input.next();

                    System.out.println(String.format("List.contains(%s) == %b", item, list.contains(item)));
                    break;

                case 3:
                    System.out.println(ENTER_STRING_FOR_ADD);
                    item = input.next();

                    list.add(item);

                    System.out.println(String.format("List.add(%s)", item));
                    break;

                case 4:
                    System.out.println(ENTER_STRING_FOR_ADD);
                    item = input.next();
                    System.out.println(ENTER_NUMBER_OF_STRING);
                    int position = input.nextInt();

                    list.add(position, item);

                    System.out.println(String.format("List.addByIndex(%d, %s)", position, item));
                    break;

                case 5:
                    System.out.println(ENTER_STRING_FOR_REMOVE);
                    item = input.next();

                    list.remove(item);

                    System.out.println(String.format("List.remove(%s)", item));
                    break;

                case 6:
                    System.out.println(ENTER_NUMBER_OF_STRING);
                    position = input.nextInt();

                    try {
                        System.out.println(String.format("List.removeByIndex(%d) == %s", position, list.remove(position)));
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println(String.format("List.removeByIndex(%d) == %s", position, e));
                    }
                    break;

                case 7:
                    System.out.println(list);
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
}
