package com;

import java.util.ArrayList;
import java.util.List;

public final class Student {
    private final int age;
    private final String name;
    private final Group group;

    private final List<String> subjects;

    public Student(int age, String name, Group group, List<String> subjects) throws CloneNotSupportedException {
        this.age = age;
        this.name = name;
        this.group = (Group) group.clone();
        this.subjects = new ArrayList<>(subjects);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Group getGroup() throws CloneNotSupportedException {
        return (Group) group.clone();
    }

    public ArrayList<String> getSubjects() {
        return new ArrayList<>(subjects);
    }
}
