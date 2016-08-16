package com.allatori;

public class Watermark extends Configurable {

    private static void method1279() {
        System.out.println(Info.name() + " " + Info.version());
        System.out.println("Usage:");
        System.out.println("com.allatori.Watermark -add <config file>");
        System.out.println("or");
        System.out.println("com.allatori.Watermark -extract <config file>");
    }

    public static void main(String[] args) {
        System.out.println(Configurable.printSplash());
        if (args.length != 2) {
            method1279();
            System.exit(0);
        }

        if ("-add".equals(args[0])) {
            Class167.method1661(false);
        } else if ("-extract".equals(args[0])) {
            Class167.method1661(true);
        } else {
            method1279();
            System.exit(0);
        }

        Configurable.parseConfigFile(args[1]);

        try {
            ClassStorage var1 = Obfuscate.method1269();
            if (Class167.method1659()) {
                if (Class167.method1660() == null) {
                    Logger.printError("Configuration error. Watermark key is not set.");
                    System.exit(0);
                }

                System.out.println("Extracted watermark: \"" + Configurable.method1274(var1) + "\"");
            } else {
                if (Class167.method1660() == null) {
                    Logger.printError("Configuration error. Watermark key is not set.");
                    System.exit(0);
                }

                if (Class167.method1656() == null) {
                    Logger.printError("Configuration error. Watermark value is not set.");
                    System.exit(0);
                }

                Configurable.method1266(var1);
                Configurable.method1275(var1);
            }
        } catch (Exception var2) {
            Logger.printError(var2.getMessage());
        }

    }
}
