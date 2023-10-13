package fit.iuh.edu.vn.ServiceRest;

import fit.iuh.edu.vn.entities.Candidate;
import fit.iuh.edu.vn.entities.CandidateSkill;
import fit.iuh.edu.vn.repository.CandidateRepository;
import fit.iuh.edu.vn.repository.CandidateSkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CandidateSkillService {
    private  final CandidateSkillRepository candidateSkillRepository;
    @Autowired
    public CandidateSkillService(CandidateSkillRepository candidateSkillRepository) {
        this.candidateSkillRepository = candidateSkillRepository;
    }

    public List<CandidateSkill> findAll() {
        return candidateSkillRepository.findAll();
    }

    public List<CandidateSkill> saveAll(List<CandidateSkill> Candidates) {
        return candidateSkillRepository.saveAll(Candidates);
    }

    public CandidateSkill save(CandidateSkill entity) {
        return candidateSkillRepository.save(entity);
    }


    public void delete(CandidateSkill entity) {
        candidateSkillRepository.delete(entity);
    }

}
