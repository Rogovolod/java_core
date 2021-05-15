package ru.core.stream;

import java.util.stream.Stream;

public class Card {

    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public static void main(String[] args) {
        Stream.of(Value.values())
                .flatMap(value1 -> Stream.of(Suit.values())
                        .map(suit1 -> value1 + " " + suit1))
                .forEach(System.out::println);
    }

}

