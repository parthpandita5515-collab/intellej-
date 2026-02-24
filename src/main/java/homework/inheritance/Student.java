package homework.inheritance;

public class Student implements Collage {

    @Override
    public void university() {

    }

    @Override
    public void student() {
        System.out.println("Name");
    }

    @Override
    public void teacher() {
        System.out.println("Teacher Name");
    }

    @Override
    public void management() {
        System.out.println("Manager");
    }

    @Override
    public void country() {
        Collage.super.country();
    }

    @Override
    public void state() {
        Collage.super.state();
    }

    @Override
    public void city() {
        System.out.println("City Name");
    }

    @Override
    public void collage() {
        System.out.println("Collage Name");
    }
    public void parentName(){
        System.out.println("Parent Name");
    }
    public void roll(){
        System.out.println("aqwsedrf");
    }
}
