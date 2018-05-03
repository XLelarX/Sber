package com.company;

public class O {
    static void Init() {
        Text.Reset();
        if (!Text.Ok)
            Error.Message(Text.Message);
        Scan.init();
    }

    static void Done() {
        Text.Close();
    }

    public static void main(String[] args) {
        System.out.println("\nКомпилятор языка");
        System.out.println(args.length);
        if (args.length == 0)
            Location.Path = null;
        else
            Location.Path = args[0];
        O.Init();
        Pars.Compile();
        O.Done();
    }
}
