package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book book1 = new Book("name1", 203);
        Book book2 = new Book("name2", 321);
        Book book3 = new Book("name3", 213);
        Book book4 = new Book("Clean code", 666);

        Book[] bks = new Book[4];

        bks[0] = book1;
        bks[1] = book2;
        bks[2] = book3;
        bks[3] = book4;

        for (int index = 0; index < bks.length; index++) {
            Book bk = bks[index];
            System.out.println(bk.getName() + " - " + bk.getPage());
        }
        System.out.println("Replace book1 to book4.");
            Book temp = bks[0];
            bks[0] = bks[3];
            bks[3] = temp;

            for (int index = 0; index < bks.length; index++) {
                Book bk = bks[index];
                System.out.println(bk.getName() + " - " + bk.getPage());
        }
            System.out.println("Find book named Clean code:");
        for (int index = 0; index < bks.length; index++) {
            Book bk = bks[index];
            if (bk.getName() == "Clean code") {
                System.out.println(bk.getName());
            }
        }
    }
}
