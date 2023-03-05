package Encapsulation.E05FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        List<Team> teams = new ArrayList<>();

        while (!"END".equals(command)) {
            String[] dataArr = command.split(";");
            String teamName = dataArr[1];
            Team team = null;
            try {
                switch (dataArr[0]) {
                    case "Team":
                        team = new Team(teamName);
                        teams.add(team);
                        break;
                    case "Add":
                        team = teams.stream().filter(t -> t.getName().equals(teamName)).findFirst().orElse(null);
                        if (team == null) {
                            System.out.printf("Team %s does not exist.%n", teamName);
                        } else {
                            String playerName = dataArr[2];
                            int endurance = Integer.parseInt(dataArr[3]);
                            int sprint = Integer.parseInt(dataArr[4]);
                            int dribble = Integer.parseInt(dataArr[5]);
                            int passing = Integer.parseInt(dataArr[6]);
                            int shooting = Integer.parseInt(dataArr[7]);
                            Player player = new Player(playerName, endurance, sprint, dribble, passing, shooting);
                            team.addPlayer(player);
                        }
                        break;
                    case "Remove":
                        String playerName = dataArr[2];
                        team = teams.stream().filter(t -> t.getName().equals(teamName)).findFirst().orElse(null);
                        if (team != null) {
                            team.removePlayer(playerName);
                        }
                        break;
                    case "Rating":
                        team = teams.stream().filter(t -> t.getName().equals(teamName)).findFirst().orElse(null);
                        if (team == null) {
                            System.out.printf("Team %s does not exist.%n", teamName);
                        } else {
                            System.out.println(team.getName() + " - " + Math.round(team.getRating()));
                        }
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            command = scan.nextLine();
        }
    }
}
