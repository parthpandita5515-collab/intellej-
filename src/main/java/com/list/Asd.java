package com.list;

import java.util.List;

public class Asd {
    public List<String> name;
    public List<Integer> age;

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        System.out.println(name);
        this.name = name;
    }

    public List<Integer> getAge() {
        return age;
    }

    public void setAge(List<Integer> age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Asd{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}
