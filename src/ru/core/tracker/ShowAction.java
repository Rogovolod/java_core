package ru.core.tracker;

public class ShowAction implements UserAction {
    private final Output out;

    public ShowAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "=== All items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] find = tracker.findAll();
        if (find.length > 0) {
            for (int i = 0; i < find.length; i++) {
                out.println(find[i]);
            }
        } else {
            out.println("Tracker don't have any items.");
        }
        return true;
    }
}

