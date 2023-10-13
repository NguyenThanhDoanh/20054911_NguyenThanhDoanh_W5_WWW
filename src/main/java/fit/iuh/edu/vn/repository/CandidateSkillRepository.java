package fit.iuh.edu.vn.repository;

import fit.iuh.edu.vn.entities.Candidate;
import fit.iuh.edu.vn.entities.CandidateSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateSkillRepository extends JpaRepository<CandidateSkill, Candidate> {
}