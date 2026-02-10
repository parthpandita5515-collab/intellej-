package Logicbuilding;

public class Yesno {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void yesno() {
        System.out.println(name);
        if (name.equals("parth")) {
            System.out.println("male");
        } else {
            System.out.println("female");
        }
    }
}
