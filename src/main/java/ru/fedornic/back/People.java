package ru.fedornic.back;

public class People {

    String name;
    int number;
    int swim;
    int run;
    int jump;
    int force;

    public People(String name, int number, int swim, int run, int jump, int force) {
        this.name = name;
        this.number = number;
        this.swim = swim;
        this.run = run;
        this.jump = jump;
        this.force = force;
    }
    // Первая команда
    static People people_1 = new People("Legalas", 1, 6, 7, 9, 5);
    static People people_2 = new People("Galadriele", 2, 7, 6, 7, 3);
    static People people_3 = new People("Feanore", 3, 8, 7, 6, 7);
    // Вторая команда
    static People people_4 = new People("Azog", 4, 4, 6, 6, 9);
    static People people_5 = new People("Mauhur", 5, 5, 5, 5, 8);
    static People people_6 = new People("Grishnak", 6, 6, 5, 7, 7);
}