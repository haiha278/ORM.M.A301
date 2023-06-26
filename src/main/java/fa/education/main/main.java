package fa.education.main;

import fa.education.dao.CandidateDao;
import fa.education.entities.Candidate;
import fa.education.entities.CandidateDTO;
import fa.education.session.SessionFactory;
import org.hibernate.Session;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

public class main {
    public static void main(String[] args) throws ParseException {
        CandidateDao candidateDao = new CandidateDao();
        SessionFactory sessionFactory = new SessionFactory();
        org.hibernate.SessionFactory sessionFactory1 = sessionFactory.sessionFactory();
        Session session = sessionFactory1.openSession();
        session.beginTransaction();
//        List<CandidateDTO> candidateListBySkillAndLevel = candidateDao.getCandidateBySkillAndSkillLevel("Angluar", 2, session);
//        List<CandidateDTO> candidateListBySkillAndLanguage = candidateDao.getCandidateByLanguageAndSkill("Japanese", "Python/ML", session);
//        List<CandidateDTO> candidateListBySkillAndEntryTest = candidateDao.getCandidateBySkillAndTestResult("Java", "2020-10-1", "Pass", session);
        List<CandidateDTO> candidateListByInterviewResult = candidateDao.getCandidateByInterviewResult("2020-10-15", "Pass", session);

        session.getTransaction().commit();
        session.close();
    }
}
