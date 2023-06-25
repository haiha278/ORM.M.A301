package fa.education.model;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.Range;

import java.util.Date;

@Entity
@Table(name = "EntryTest")
public class EntryTest {
    @Id
    @Column(name = "test_id", nullable = false)
    private int testID;

    @Column(name = "time", nullable = false)
    private String time;
    @Column(name = "date", nullable = false)
    private Date date;
    @Column(name = "language_valuator", nullable = false)
    private String languageValuator;
    @Column(name = "language_result", nullable = false)
    @Range(min = 0, max = 10)
    private double languageResult;
    @Column(name = "technical_valuator", nullable = false)
    private String technicalValuator;
    @Column(name = "technical_result", nullable = false)
    @Range(min = 0, max = 10)
    private double technicalResult;
    @Column(name = "result", nullable = false)
    private String result;
    @Column(name = "remark", nullable = false)
    private String remark;
    @Column(name = "entry_test_skill", nullable = false)
    private String entryTestSkill;
    @ManyToOne
    @JoinColumn(name = "candidate_id", nullable = false)
    private Candidate candidate;
}
