package Encapsulation.E05FootballTeamGenerator;

public class Player {

    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        setName(name);
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    private void setEndurance(int endurance) {
        ensureSkillValue(endurance, "Endurance");
        this.endurance = endurance;
    }

    private void setSprint(int sprint) {
        ensureSkillValue(sprint, "Sprint");
        this.sprint = sprint;
    }

    private void setDribble(int dribble) {
        ensureSkillValue(dribble, "Dribble");
        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        ensureSkillValue(passing, "Passing");
        this.passing = passing;
    }

    private void setShooting(int shooting) {
        ensureSkillValue(shooting, "Shooting");
        this.shooting = shooting;
    }

    private void ensureSkillValue(int value, String prefix) {
        if (value < 0 || value > 100) {
            throw new IllegalArgumentException(prefix + " should be between 0 and 100.");
        }
    }

    public String getName() {
        return name;
    }

    public double overallSkillLevel() {
        return (endurance + sprint + dribble + passing + shooting) / 5.00;
    }
}
