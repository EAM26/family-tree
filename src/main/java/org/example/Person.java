package org.example;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String middleName;
    private String lastName;
    private String sex;
    private int age;
    private Person mother;
    private Person father;
    private List<Person> siblings;
    private List<Person> children;

    public Person(String name, String lastName, String sex, int age) {
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public Person(String name, String middleName, String lastName, String sex, int age) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    public void setSiblings(List<Person> siblings) {
        this.siblings = siblings;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    private List<Pet> pets;

    // Test person for sex and set to father/mother
    public void addParents(Person p1, Person p2) {
        if(p1.getSex().toLowerCase().equals("male")) {
            this.father = p1;
            this.mother = p2;
        } else {
            this.mother = p1;
            this.father = p2;
        }
    }

    public void addChild(Person p1) {
        this.children.add(p1);
    }

    public void addPet(Pet pet) {
        this.pets.add(pet);
    }

    public void addSibling(Person p1) {
        this.siblings.add(p1);
    }

    public List<Person> getGrandChildren(Person p1) {
        List<Person> grandChildren = new ArrayList<>();
        for (Person child: p1.getChildren()
             ) {
            for (Person grandChild: child.getChildren()
                 ) {
                grandChildren.add(grandChild);
            }
        }
        return grandChildren;
    }

}

