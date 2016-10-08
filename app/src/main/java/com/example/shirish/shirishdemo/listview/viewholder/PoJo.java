package com.example.shirish.shirishdemo.listview.viewholder;

/**
 * Created by shirish on 8/10/16.
 */

public class PoJo {
    String name, age, address;

    public PoJo(){}

    public PoJo(String name, String age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
