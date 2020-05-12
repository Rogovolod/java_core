package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        return eng;
    }
    public static void main(String[] args) {
        DummyDic rus = new DummyDic();
        String translate = rus.engToRus("blablabla");
        System.out.println("Неизвестное слово. " + translate);
    }
}
