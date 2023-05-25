package ru.fedornic.back;

public class Team {
    String command_name;
    People[] players;

    public Team(String command_name, People[] players) {
        this.command_name = command_name;
        this.players = players;
    }

    static People[] players_1 = new People[]{People.people_1, People.people_2, People.people_3};
    static People[] players_2 = new People[]{People.people_4, People.people_5, People.people_6};

    public static Team command_1 = new Team("Elfs", players_1);
    public static Team command_2 = new Team("Orcs", players_2);

    public static void skills(Team command) {
        System.out.println("\nComand: " + command.command_name);
        System.out.println("-----------------");
        for (int i = 0; i < command.players.length; i++) {
            System.out.println("\nPlayer: " + command.players[i].name);
            System.out.println("\tSwimming skills: " + command.players[i].swim);
            System.out.println("\tRunning skills:\t" + command.players[i].run);
            System.out.println("\tJumping skills:\t" + command.players[i].jump);
            System.out.println("\tFighting skills: " + command.players[i].force);
        }
    }
}