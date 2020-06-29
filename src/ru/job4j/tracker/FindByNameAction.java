package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Find items by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter item name you want find: ");
        Item[] findN =  tracker.findByName(name);
        if (findN.length > 0) {
            for (int i = 0; i < findN.length; i++) {
                System.out.println(findN[i]);
            }
        } else {
            System.out.println("Tracker don't have this name.");
        }
        return true;
    }
}