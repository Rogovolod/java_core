package tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenCreateItem() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[] {"0", item.getId(), replacedName, "1"}
        );
        UserAction[] actions = {
                new EditAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        Input in = new StubInput(
                new String[] {"0", item.getId(), "1"}
        );
        UserAction[] actions = {
                new DeleteAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }
    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Exit Program" + System.lineSeparator()
                        + "===Exit Program===" + System.lineSeparator()
        ));
    }
    @Test
    public void whenShow() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Input in = new StubInput(
                new String[] {"0", "1"}
        );
        UserAction[] actions = {
                new ShowAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. === All items ====" + System.lineSeparator()
                        + "1. Exit Program" + System.lineSeparator()
                        + "Tracker don't have any items." + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0. === All items ====" + System.lineSeparator()
                        + "1. Exit Program" + System.lineSeparator()
                        + "===Exit Program===" + System.lineSeparator()
        ));
    }
    @Test
    public void whenFindByID() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = new Item("test name");
        tracker.add(item);
        Input in = new StubInput(
                new String[] {"0", item.getId(), "1"}
        );
        UserAction[] actions = {
                new FindIByIdAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. === Find item by Id ====" + System.lineSeparator()
                        + "1. Exit Program" + System.lineSeparator()
                        + item.toString() + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0. === Find item by Id ====" + System.lineSeparator()
                        + "1. Exit Program" + System.lineSeparator()
                        + "===Exit Program===" + System.lineSeparator()
        ));
    }
    @Test
    public void whenFindByName() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = new Item("test name");
        tracker.add(item);
        Input in = new StubInput(
                new String[] {"0", item.getName(), "1"}
        );
        UserAction[] actions = {
                new FindByNameAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. === Find items by name ====" + System.lineSeparator()
                        + "1. Exit Program" + System.lineSeparator()
                        + item.toString() + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0. === Find items by name ====" + System.lineSeparator()
                        + "1. Exit Program" + System.lineSeparator()
                        + "===Exit Program===" + System.lineSeparator()
        ));
    }
    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"9", "0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                String.format(
                        "Menu.%n"
                                + "0. Exit Program%n"
                                + "Wrong input, you can select: 0 .. 0%n"
                                + "Menu.%n"
                                + "0. Exit Program%n"
                                + "===Exit Program===%n"
                )
        ));
    }
}
