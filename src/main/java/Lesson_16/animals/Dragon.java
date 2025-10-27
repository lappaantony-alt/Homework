package Lesson_16.animals;

public class Dragon {

    private String name;
    private int age;
    private double weight;
    private String colour;
    private int length;

    public Dragon() {
        System.out.println("Викликаємо Візеріона🐉");
    }

    public Dragon(String name, int age, double weight, String colour, int length) {
        System.out.println("Викликаємо Дрогона🐲");

        this.name = name;
        this.age = age;
        this.weight = weight;
        this.colour = colour;
        this.length = length;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}