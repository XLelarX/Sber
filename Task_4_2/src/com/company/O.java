package com.company;

import java.io.File;

public class O {
    private static void Init() {
        Text.Reset();
        if (!Text.ok)
            Error.Message(Text.message);
        Scan.init();
    }

    private static void Done() {
        Text.Close();
    }

    public static void main(String[] args) {

//        System.out.println("ы".matches("(\\w|[а-яА-Я])"));

        System.out.println(Integer.MAX_VALUE + "     " + Long.MAX_VALUE);
        System.out.println("Компилятор языка Java");
        showoutFiles(convertHumanReadableFormatToRegex(args[0]));

//        if (args.length == 0)
//            Location.path = null;
//        else
//            Location.path = convertHumanReadableFormatToRegex(args[0]);
//        System.out.println(Location.path);
//        O.Init();
//        Pars.Compile();
//        O.Done();
    }

    private static String convertHumanReadableFormatToRegex(String arg) {
        return arg.replaceAll("\\.", "\\*")
                .replaceAll("^\\*", "\\.");
    }

    private static void showoutFiles(String fileMask) {
        File dir = new File(".");
        // System.out.println(dir.getAbsolutePath());
        File[] files = dir.listFiles((dir1, name) -> name.matches(fileMask));
        //System.out.println(files.length);
        int i = 0;
        assert files != null;
        for (File file : files) {
            i++;
            System.out.println(file.getName());
            Location.path = file.getName();
            O.Init();
            Pars.Compile();
            O.Done();
        }
    }
}
