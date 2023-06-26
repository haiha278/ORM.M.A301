package fa.education.entities;

import java.util.Date;

public class CandidateDTO {
    private int id;
    private String fullName;
    private String skill;
    private int level;
    private String foreignLanguage;

    private Date date;

    public CandidateDTO(int id, String fullName, String skill, Date date) {
        this.id = id;
        this.fullName = fullName;
        this.skill = skill;
        this.date = date;
    }

    public CandidateDTO(String fullName, String skill, int level) {
        this.fullName = fullName;
        this.skill = skill;
        this.level = level;
    }

    public CandidateDTO(String fullName, String skill, String foreignLanguage) {
        this.fullName = fullName;
        this.skill = skill;
        this.foreignLanguage = foreignLanguage;
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

    public String getForeignLanguage() {
        return foreignLanguage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setForeignLanguage(String foreignLanguage) {
        this.foreignLanguage = foreignLanguage;
    }
}
