package core.inheritance;

public class JSONReport extends TextReport {

    @Override
    public String generate(String name, String body) {
        return "name : " + name + ", body : " + body;
    }
}
