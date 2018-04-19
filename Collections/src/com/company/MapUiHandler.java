package com.company;

import java.util.*;

public class MapUiHandler {
    private static final String CHOOSE_COMMAND = "Выберите команду : ";
    private static final String COMMAND_LIST = "1. isEmpty\n2. contains\n3. add\n4. clear\n5. remove\n6. removeByIndex\n7. showItems\n8. goToMainMenu";
    private static final String ENTER_STRING_FOR_CHECK = "Введите строку для проверки : ";
    private static final String ENTER_STRING_FOR_ADD = "Введите строку для добавления : ";
    private static final String ENTER_NUMBER_OF_STRING = "Введите номер места строки : ";
    private static final String ENTER_KEY_OF_STRING = "Введите ключ элемента : ";
    private static final String ENTER_STRING_FOR_REMOVE = "Введите строку для удаления : ";

    private final Scanner input = new Scanner(System.in);
    private final Map<Integer, String> map = new HashMap<>();

    public void call() {
        while (true) {
            showMenu();
            int numberOfChoose = input.nextInt();
            switch (numberOfChoose) {
                case 1:
                    System.out.println(String.format("Map.isEmpty == %b", map.isEmpty()));
                    break;
                case 2:
                    System.out.println(ENTER_STRING_FOR_CHECK);
                    String item = input.next();
                    System.out.println(String.format("Map.contains(%s) == %b", item, map.contains(item)));
                    break;
                case 3:
                    System.out.println(ENTER_STRING_FOR_ADD);
                    item = input.next();
                    System.out.println(ENTER_NUMBER_OF_STRING);
                    int key = input.nextInt();
                    map.put(key, item);
                    System.out.println(String.format("Map.key(%s)", item));
                    break;
                case 4:
                    map.clear();
                    break;
                case 5:
                    System.out.println(ENTER_STRING_FOR_REMOVE);
                    key = input.nextInt();
                    map.remove(key);
                    System.out.println(String.format("Map.remove(%s)", key));
                    break;
                case 6:
                    System.out.println(ENTER_STRING_FOR_REMOVE);
                    item = input.next();
                    System.out.println(ENTER_NUMBER_OF_STRING);
                    key = input.nextInt();
                    System.out.println(String.format("List.removeByIndex(%d, %s)", key, item));
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
        for (String element : map) {
            System.out.println(element);
        }
    }
}
