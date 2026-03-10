package homework;

public class Asdd {
    public String name;
    public String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Asdd(String name, String age) {
        this.name = name;
        this.age = age;
        System.out.println(name);
        System.out.println(age);
    }
}
