package fa.education.entities;

import javax.persistence.*;
import org.hibernate.validator.constraints.Range;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Candidate")
public class Candidate {
    @Id
    @Column(name = "candidate_id", nullable = false)
    private int candidateID;
    @Column(name = "full_name", nullable = false)
    private String fullName;
    @Column(name = "date_of_birth", nullable = false)
    private Date dateOfBirth;
    @Column(name = "gender", nullable = false)
    @Range(min = 0, max = 1)
    private int gender;
    @Column(name = "graduation_year", nullable = false)
    private Date graduationYear;
    @Column(name = "phone", nullable = true, unique = true)
    private String phone;
    @Column(name = "email", nullable = true, unique = true)
    private String email;
    @Column(name = "skill", nullable = false)
    private String skill;
    @Column(name = "foreign_language", nullable = false)
    private String foreignLanguage;
    @Column(name = "level", nullable = false)
    @Range(min = 1, max = 7)
    private int level;
    @Column(name = "cv", nullable = true)
    private String cv;
    @Column(name = "allocation_status", nullable = false)
    private int allocationStatus;
    @Column(name = "remark", nullable = false)
    private String remark;
    @OneToMany(mappedBy = "candidate")
    private List<Interview> interviews;
    @OneToMany(mappedBy = "candidate")
    private List<EntryTest> entryTests;

    public int getCandidateID() {

        return candidateID;
    }

    public void setCandidateID(int candidateID) {

        this.candidateID = candidateID;
    }

    public String getFullName() {

        return fullName;
    }

    public void setFullName(String fullName) {

        this.fullName = fullName;
    }

    public Date getDateOfBirth() {

        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {

        this.dateOfBirth = dateOfBirth;
    }

    public int getGender() {

        return gender;
    }

    public void setGender(int gender) {

        this.gender = gender;
    }

    public Date getGraduationYear() {

        return graduationYear;
    }

    public void setGraduationYear(Date graduationYear) {

        this.graduationYear = graduationYear;
    }

    public String getPhone() {

        return phone;
    }

    public void setPhone(String phone) {

        this.phone = phone;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getSkill() {

        return skill;
    }

    public void setSkill(String skill) {

        this.skill = skill;
    }

    public String getForeignLanguage() {

        return foreignLanguage;
    }

    public void setForeignLanguage(String foreignLanguage) {

        this.foreignLanguage = foreignLanguage;
    }

    public int getLevel() {

        return level;
    }

    public void setLevel(int level) {

        this.level = level;
    }

    public String getCv() {

        return cv;
    }

    public void setCv(String cv) {

        this.cv = cv;
    }

    public int getAllocationStatus() {

        return allocationStatus;
    }

    public void setAllocationStatus(int allocationStatus) {

        this.allocationStatus = allocationStatus;
    }

    public String getRemark() {

        return remark;
    }

    public void setRemark(String remark) {

        this.remark = remark;
    }

    public List<Interview> getInterviews() {

        return interviews;
    }

    public void setInterviews(List<Interview> interviews) {

        this.interviews = interviews;
    }

    public List<EntryTest> getEntryTests() {

        return entryTests;
    }

    public void setEntryTests(List<EntryTest> entryTests) {

        this.entryTests = entryTests;
    }

    public Candidate() {
    }
}
