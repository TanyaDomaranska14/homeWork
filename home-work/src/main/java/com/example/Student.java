package com.example;

import java.util.List;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;
import java.util.Map;


public class Student {

    private String name;
    private int age;
    private Teacher teacher;
    private Map<String, Object> marksMap;
    private List<Subject> subjects;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public void study() {
        System.out.println("\n Student Ivan \n");
        marksMap.entrySet().stream().forEach(e -> System.out.println("Key: " + e.getKey() + "Value: " + e.getValue()));

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    public void setMarksMap(Map<String, Object> marksMap) {
        this.marksMap = marksMap;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public static void main(String... args) {

        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:app-context-student-one.xml");
        ctx.refresh();

        Student student1 = (Student) ctx.getBean("student1");
        System.out.println(student1);
        Student student = (Student) ctx.getBean("student");
        student.study();
        ctx.close();
    }
}
