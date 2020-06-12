package ru.job4j.tracker;

public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== All items ====");
                Item[] find = tracker.findAll();
                if (find.length > 0) {
                    for (int i = 0; i < find.length; i++) {
                        System.out.println(find[i]);
                    }
                } else {
                    System.out.println("Tracker don't have any items.");
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ====");
                String id = input.askStr("Enter item id you want edit: ");
                System.out.println("Try to found: " + id);
                String name = input.askStr("Type new item: ");
                Item newItem = new Item(name);
                tracker.replace(id, newItem);
                if (tracker.replace(id, newItem)) {
                    System.out.println("Done.");
                } else {
                    System.out.println("Error.");
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ====");
                String name = input.askStr("Enter item name you want delete: ");
                tracker.delete(name);
                if (tracker.delete(name)) {
                    System.out.println("Done.");
                } else {
                    System.out.println("Error.");
                }
            } else if (select == 4) {
                System.out.println("=== Find item by Id ====");
                String id = input.askStr("Enter item id you want find: ");
                Item itemId = tracker.findById(id);
                if (itemId != null) {
                    System.out.println(itemId);
                } else {
                    System.out.println("Tracker don't have this ID.");
                }
            } else if (select == 5) {
                System.out.println("=== Find items by name ====");
                String name = input.askStr("Enter item name you want find: ");
                Item[] findN =  tracker.findByName(name);
                if (findN.length > 0) {
                    for (int i = 0; i < findN.length; i++) {
                        System.out.println(findN[i]);
                    }
                } else {
                    System.out.println("Tracker don't have this name.");
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }


    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}