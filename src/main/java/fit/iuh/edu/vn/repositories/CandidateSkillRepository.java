package fit.iuh.edu.vn.repositories;

import fit.iuh.edu.vn.entities.CandidateSkill;
import fit.iuh.edu.vn.ids.CandidateSkillID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateSkillRepository extends JpaRepository<CandidateSkill, CandidateSkillID> {
}