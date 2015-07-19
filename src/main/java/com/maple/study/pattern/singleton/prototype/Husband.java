package com.maple.study.pattern.singleton.prototype;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by aurogon-mac on 15/7/18.
 */
public class Husband implements Cloneable, Serializable {

    public static int COUNT = 0;

    private String name = "aurogon";

    private int age = 22;

    private Wife wife;

    protected ArrayList<String> arrayList = new ArrayList<>();

    public Husband() {
        System.out.println("构造函数被执行了" + (++COUNT) + "次");
    }

    public Husband(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

    public void setValue(String value) {
        this.arrayList.add(value);
    }

    public ArrayList<String> getValue() {
        return this.arrayList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Husband clone() {
        Husband husband = null;
        try {
            husband = (Husband) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return husband;
    }

    public Husband deepClone() throws IOException, ClassNotFoundException {
        //将对象写到流里
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        //从流里读回来
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (Husband) ois.readObject();
    }

    @Override
    public String toString() {
        return "Husband{" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                ", arrayList=" + this.getValue() +
                ", Wife=" + this.getWife() +
                '}';
    }
}
