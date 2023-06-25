package fa.education.dao;

import fa.education.entities.Candidate;

import java.util.ArrayList;

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
}
