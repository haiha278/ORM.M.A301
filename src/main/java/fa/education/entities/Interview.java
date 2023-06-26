package fa.education.entities;

import javax.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Interview")
public class Interview {
    @Id
    @Column(name = "interview_id", nullable = false)
    private int interviewId;
    @Column(name = "time", nullable = false)
    private String time;
    @Column(name = "date", nullable = false)
    private Date date;
    @Column(name = "interviewer", nullable = false)
    private String interviewer;
    @Column(name = "comments", nullable = false)
    private String comments;
    @Column(name = "interviewResult", nullable = false)
    private String interviewResult;
    @Column(name = "remark", nullable = false)
    private String remark;
    @ManyToOne
    @JoinColumn(name = "candidate_id", nullable = false)
    private Candidate candidate;
}
