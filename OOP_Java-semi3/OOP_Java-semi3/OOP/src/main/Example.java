package main;

import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        Mathematics m = (a, b) -> a + b; // Лямбда-функция (лямбда-функция является анонимным классом)
        Mathematics x = Double::sum; // Тоже лямбда-функция
//        todo Лямбда-функция будет работать только если интерфейс функциональный
        System.out.println(x.add(15, 24));
    }
}

interface Mathematics {
    double add (double a, double b);
}

class Calculator {
    static Map<Character, Calculable> map = new HashMap<>();
    static { // Статический блок кода. Создается прежде чем стартанет приложение, до его запуска
        map.put('+', arr -> arr[0] + arr[1]);
        map.put('-', arr -> arr[0] - arr[1]);
        map.put('*', arr -> arr[0] * arr[1]);
        map.put('f', arr -> Math.sqrt(arr[0]));
    }
//    public static void main(String[] args)
    public static void main(String ... args) {
        System.out.println(calculate1('f', 4, 12));
    }

    public static double calculate(char op, double a, double b) {
        if (op == '+') return a + b;
        if (op == '-') return a - b;
        if (op == '*') return a * b;
        else throw new UnsupportedOperationException("Не реализуется");
    }

//    public static double calculate1(char op, double a, double b) {
//        return map.get(op).calc(a, b);
//    }

    public static double calculate1(char op, double ... arr) {
        return map.get(op).calc(arr);
    }
}

interface Calculable {
    double calc(double ... arr);
}