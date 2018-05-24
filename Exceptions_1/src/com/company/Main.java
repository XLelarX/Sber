package com.company;

public class Main {
    private static Server server = new Server();
    private static Client client = new Client(server);

    public static void main(String[] args) {
        client.start();
    }
}
