package fa.education.dao;

import fa.education.entities.Candidate;
import fa.education.entities.CandidateDTO;
import org.hibernate.Query;
import org.hibernate.Session;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CandidateDao implements DAO<Candidate> {
    @Override
    public Candidate getById(int id) {
        return null;
    }

    @Override
    public ArrayList<Candidate> getAll() {
        return null;
    }

    @Override
    public boolean updateById(Candidate object) {
        return false;
    }

    @Override
    public boolean deleteById(Candidate object) {
        return false;
    }

    @Override
    public boolean insert(Candidate object) {
        return false;
    }

    public List<CandidateDTO> getCandidateBySkillAndSkillLevel(String skill, int level, Session session) {
        String hql = "Select new fa.education.entities.CandidateDTO(c.fullName, c.skill, c.level) from Candidate c where c.skill = :skill and c.level = :level";
        Query query = session.createQuery(hql);
        query.setParameter("skill", skill);
        query.setParameter("level", level);
        List<CandidateDTO> candidates = query.list();
        for (CandidateDTO candidateDTO : candidates) {
            System.out.println(candidateDTO.getFullName() + "         " + candidateDTO.getSkill() + "         " + candidateDTO.getLevel());
        }
        return candidates;
    }

    public List<CandidateDTO> getCandidateByLanguageAndSkill(String language, String skill, Session session) {
        String hql = "Select new fa.education.entities.CandidateDTO(c.fullName, c.skill, c.foreignLanguage) from Candidate c where c.skill = :skill and c.foreignLanguage = :foreignLanguage";
        Query query = session.createQuery(hql);
        query.setParameter("skill", skill);
        query.setParameter("foreignLanguage", language);
        List<CandidateDTO> candidates = query.list();
        for (CandidateDTO candidateDTO : candidates) {
            System.out.println(candidateDTO.getFullName() + "         " + candidateDTO.getSkill() + "         " + candidateDTO.getForeignLanguage());
        }
        return candidates;
    }

    public List<CandidateDTO> getCandidateBySkillAndTestResult(String skill, String testDate, String result, Session session) throws ParseException {
        String hql = "select new fa.education.entities.CandidateDTO(c.candidateID,c.fullName,c.skill, e.date) from Candidate c join c.entryTests e where e.date =:testDate and c.skill =:skill and e.result =:result";
        Query query = session.createQuery(hql);
        String sDate1 = testDate;
        Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(sDate1);
        query.setParameter("testDate", date1);
        query.setParameter("skill", skill);
        query.setParameter("result", result);
        List<CandidateDTO> candidates = query.list();
        for (CandidateDTO candidateDTO : candidates) {
            System.out.println(candidateDTO.getId() + "       " + candidateDTO.getFullName() + "          " + candidateDTO.getSkill() + "     " + candidateDTO.getDate());
        }
        return candidates;
    }

    public List<CandidateDTO> getCandidateByInterviewResult(String testDate, String interviewResult, Session session) throws ParseException {
        String hql = "select new fa.education.entities.CandidateDTO(c.candidateID,c.fullName,c.skill, i.date) from Candidate c join c.interviews i where i.date =:date and i.interviewResult=:interviewResult";
        Query query = session.createQuery(hql);
        String sDate1 = testDate;
        Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(sDate1);
        query.setParameter("date", date1);
        query.setParameter("interviewResult", interviewResult);
        List<CandidateDTO> candidates = query.list();
        for (CandidateDTO candidateDTO : candidates) {
            System.out.println(candidateDTO.getId() + "       " + candidateDTO.getFullName() + "          " + candidateDTO.getSkill() + "     " + candidateDTO.getDate());
        }
        return null;
    }
}
