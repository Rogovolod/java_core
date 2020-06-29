package ru.job4j.tracker;

public class FindIByIdAction implements UserAction {
    private final Output out;

    public FindIByIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Find item by Id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter item id you want find: ");
        Item itemId = tracker.findById(id);
        if (itemId != null) {
            System.out.println(itemId);
        } else {
            System.out.println("Tracker don't have this ID.");
        }
        return true;
    }
}
