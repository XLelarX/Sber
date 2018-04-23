package com.company;

import java.util.*;

public class MapUiHandler implements UiHandler {
    private static final String COMMAND_LIST = "1. showItems\n2. isEmpty\n3. get\n4. put\n5. remove\n6. goToMainMenu";
    private static final String ENTER_STRING_FOR_ADD = "Введите строку для добавления : ";
    private static final String ENTER_KEY_OF_ELEMENT = "Введите ключ элемента : ";

    private final Scanner input = new Scanner(System.in);
    private final Map<Integer, String> map = new HashMap<>();

    public void call() {
        while (true) {
            showMenu();
            int numberOfChoose = input.nextInt();
            switch (numberOfChoose) {
                case 1:
                    System.out.println(map);
                    break;

                case 2:
                    System.out.println(String.format("Map.isEmpty() == %b", map.isEmpty()));
                    break;

                case 3: {
                    System.out.println(ENTER_KEY_OF_ELEMENT);
                    int key = input.nextInt();

                    System.out.println(String.format("Map.get(%d) == %s", key, map.get(key)));
                }
                break;

                case 4: {
                    System.out.println(ENTER_STRING_FOR_ADD);
                    String item = input.next();
                    System.out.println(ENTER_KEY_OF_ELEMENT);
                    int key = input.nextInt();

                    map.put(key, item);
                    System.out.println(String.format("Map.put(%d, %s)", key, item));
                }
                break;

                case 5: {
                    System.out.println(ENTER_KEY_OF_ELEMENT);
                    int key = input.nextInt();

                    System.out.println(String.format("Map.remove(%d) == %s", key, map.remove(key)));
                }
                break;

                default:
                    return;
            }
        }
    }

    private static void showMenu() {
        System.out.println("Выберите команду : ");
        System.out.println(COMMAND_LIST);
    }

}
