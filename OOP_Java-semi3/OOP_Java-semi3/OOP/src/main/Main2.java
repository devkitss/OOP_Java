package main;

import main.clients.Animal;
import main.clients.Cat;
import main.clients.Dog;
import main.clients.Goable;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        List<Goable> list = new ArrayList<>();
        Cat cat = new Cat();
        Dog dog = new Dog();
        list.add(cat);
        list.add(dog);
        System.out.println(list);

        Animal animal = new Animal() { // Анонимный класс
            @Override
            public void eat() {

            }
        };
//    Абстрактный класс хранит в себе и состояния и поведения, а интерфейс только поведения
//    Когда нам нужно множественное наследование мы будем использовать интерфейсы
//        List<Animal> listAnimal = new List<Animal>() {
//            @Override
//            public int size() {
//                return 0;
//            }
//
//            @Override
//            public boolean isEmpty() {
//                return false;
//            }
//
//            @Override
//            public boolean contains(Object o) {
//                return false;
//            }
//
//            @Override
//            public Iterator<Animal> iterator() {
//                return null;
//            }
//
//            @Override
//            public Object[] toArray() {
//                return new Object[0];
//            }
//
//            @Override
//            public <T> T[] toArray(T[] a) {
//                return null;
//            }
//
//            @Override
//            public boolean add(Animal animal) {
//                return false;
//            }
//
//            @Override
//            public boolean remove(Object o) {
//                return false;
//            }
//
//            @Override
//            public boolean containsAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public boolean addAll(Collection<? extends Animal> c) {
//                return false;
//            }
//
//            @Override
//            public boolean addAll(int index, Collection<? extends Animal> c) {
//                return false;
//            }
//
//            @Override
//            public boolean removeAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public boolean retainAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public void clear() {
//
//            }
//
//            @Override
//            public Animal get(int index) {
//                return null;
//            }
//
//            @Override
//            public Animal set(int index, Animal element) {
//                return null;
//            }
//
//            @Override
//            public void add(int index, Animal element) {
//
//            }
//
//            @Override
//            public Animal remove(int index) {
//                return null;
//            }
//
//            @Override
//            public int indexOf(Object o) {
//                return 0;
//            }
//
//            @Override
//            public int lastIndexOf(Object o) {
//                return 0;
//            }
//
//            @Override
//            public ListIterator<Animal> listIterator() {
//                return null;
//            }
//
//            @Override
//            public ListIterator<Animal> listIterator(int index) {
//                return null;
//            }
//
//            @Override
//            public List<Animal> subList(int fromIndex, int toIndex) {
//                return null;
//            }
//        };
    }
}
