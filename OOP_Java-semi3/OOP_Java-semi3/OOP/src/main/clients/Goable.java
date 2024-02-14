package main.clients;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface Goable {
//    public static final double pi = 3.14; // Все переменные, объявленные в интерфейсе всегда паблик, статик и файнал
    double pi = 3.14; // Константа
    List<Integer> list = new ArrayList<>(); // А это уже не константа, т.к. внутри листа можно изменять переменные

//    public abstract void toGo(); // по умолчанию в джаве компилятор понимает, что все методы публичные и абстрактные,
    // т.е. любой нереализованный метод публичный и абстрактный
//    todo В интерфейсе все методы публичные и абстрактные
    void toGo();
    default double getRunSpeed() {
        return 10D;
    }

//    Serializable
}
