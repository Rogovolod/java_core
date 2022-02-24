package core.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Savin Pavel");
        student.setGroup((byte) 1);
        student.setStart("01.04.2020");

        System.out.println("Student " + student.getFio() + ". Group № " + student.getGroup() + ". Date: " + student.getStart());

    }
}
