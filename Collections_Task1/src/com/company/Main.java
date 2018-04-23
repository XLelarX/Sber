package com.company;

import java.util.Scanner;

public class Main {

    private static final String CHOOSE_TYPE_OF_COLLECTION = "Выберите тип коллекции : ";
    private static final String COLLECTION_LIST = "1. List\n2. Set\n3. Deque\n4. Map\n5. End";

    private static final Scanner input = new Scanner(System.in);

    private static final ListUiHandler listHandler = new ListUiHandler();
    private static final DequeUiHandler dequeHandler = new DequeUiHandler();
    private static final MapUiHandler mapHandler = new MapUiHandler();
    private static final SetUiHandler setHandler = new SetUiHandler();
    private static FinalUiHandler finalUiHandler = new FinalUiHandler();

    public static void main(String[] args) {
        chooseType();
    }

    private static void showMenu() {
        System.out.println(CHOOSE_TYPE_OF_COLLECTION + '\n' + COLLECTION_LIST);
    }

    private static void chooseType() {
        while (true) {
            showMenu();
            getHandler().call();
        }
    }

    private static UiHandler getHandler() {
        int numberOfCommand = input.nextInt();
        switch (numberOfCommand) {
            case 1:
                return listHandler;
            case 2:
                return setHandler;
            case 3:
                return dequeHandler;
            case 4:
                return mapHandler;
            default:
                return finalUiHandler;
        }
    }
}
