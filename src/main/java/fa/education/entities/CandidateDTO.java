package fa.education.entities;

public class CandidateDTO {
    private String fullName;
    private String skill;
    private int level;

    public CandidateDTO(String fullName, String skill, int level) {
        this.fullName = fullName;
        this.skill = skill;
        this.level = level;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
