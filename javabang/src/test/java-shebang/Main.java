#!/usr/bin/env ../../../java.bash

        import shebang_package.Package;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main method. Args length: " + args.length);
        for ( String arg : args ) {
            System.out.println("Arg: " + arg);
        }
        Package.p();
    }
}
