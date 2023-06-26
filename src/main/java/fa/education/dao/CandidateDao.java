package fa.education.dao;

import fa.education.entities.Candidate;
import fa.education.entities.CandidateDTO;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.ArrayList;
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
}
