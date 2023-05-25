package ru.fedornic.user;

import ru.fedornic.back.*;

public class Main {
    /**
     * Забавное задание из прошлых работ на мини игру
     */
    public static void main(String[] args) {

        Team.skills(Team.command_1);

        Team.skills(Team.command_2);

        System.out.println("\n Elf total score "
                + Competition.Race(Team.command_1, Barrier.challenge) + " points.\n");

        System.out.println("\n Orc total score "
                + Competition.Race(Team.command_2, Barrier.challenge) + " points.\n");
    }
}