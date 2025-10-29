package Lesson_16.animals;

public class Dragon {

    private String name;
    private int age;
    private double weight;
    private String colour;
    private int length;
    private Breed breed;

    public Dragon() {
        System.out.println("Cтворюємо дракона🐉");
    }

    public Dragon(String name, int age, double weight, Breed breed, String colour, int length) {
        System.out.println("Викликаємо Дрогона🐲");

        this.name = name;
        this.age = age;
        this.weight = weight;
        this.colour = colour;
        this.length = length;
        this.breed = breed;
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

    public Breed getBreed() {
        return this.breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return  "Ім’я: " + name + "\n" +
                "Вік: " + age + " років\n" +
                "Вага: " + weight + "кг\n" +
                "Колір: " + colour + "\n" +
                "Довжина: " + length + "м\n" +
                "Порода: " + breed + "\n";



    }

    public void voice() {
        System.out.println("Дракарис");
    }

    public void voice(String word) {
        System.out.println("Дракарис" + word);
    }
}