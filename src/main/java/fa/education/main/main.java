package fa.education.main;

import fa.education.dao.CandidateDao;
import fa.education.entities.Candidate;
import fa.education.entities.CandidateDTO;
import fa.education.session.SessionFactory;
import org.hibernate.Session;

import java.util.List;

public class main {
    public static void main(String[] args) {
        CandidateDao candidateDao = new CandidateDao();
        SessionFactory sessionFactory = new SessionFactory();
        org.hibernate.SessionFactory sessionFactory1 = sessionFactory.sessionFactory();
        Session session = sessionFactory1.openSession();
        session.beginTransaction();
        List<CandidateDTO> candidateList = candidateDao.getCandidateBySkillAndSkillLevel("Angluar", 2, session);

        session.getTransaction().commit();
        session.close();
    }
}
