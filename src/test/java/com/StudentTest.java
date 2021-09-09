package com;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {
    private static Group group;
    private static ArrayList<String> subjects;
    private static Student student;

    @BeforeClass
    public static void initialization() throws CloneNotSupportedException {
        group = new Group();
        group.setName("name1");

        subjects = new ArrayList<>();
        subjects.add("Subject1");

        student = new Student(17, "StudentName", group, subjects);
    }

    @Test
    public void testSetMutableObjects() throws CloneNotSupportedException {
        Assert.assertNotSame(student.getGroup(), group);
        Assert.assertNotSame(student.getSubjects(), subjects);
    }

    @Test
    public void testGetMutableObjects() throws CloneNotSupportedException {
        Assert.assertNotSame(student.getGroup(), student.getGroup());
        Assert.assertNotSame(student.getSubjects(), student.getSubjects());
    }
}
