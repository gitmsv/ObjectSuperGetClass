package ua.jvdevpro.smlnk;

import java.util.Scanner;

public class Main {

    /** пример использования метода getClass() */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(check(sc, Scanner.class) + "\n"); // true, так как sc действительно принадлежит классу Scanner;

        System.out.println(check(sc, Integer.class)); // false, так как sc не принадлежит классу Scanner;

    }

    private static boolean check(Object obj, Class<?> classOne) {
        Class<?> classTwo = obj.getClass(); // получение переменной типа Class для объекта;
        if (classOne == classTwo) {
            return true;
        } else return false;
    }
}
