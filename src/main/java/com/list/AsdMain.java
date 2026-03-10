package com.list;

import java.util.ArrayList;
import java.util.List;

public class AsdMain {
    public static void main(String[] args) {
        Asd asd = new Asd();
        List<String>name=new ArrayList<>();
        name.add("asdf");
        name.add("adadsf");
        asd.setName(name);
        System.out.println(asd);
    }
}
