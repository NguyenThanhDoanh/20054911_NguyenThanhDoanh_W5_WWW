package fit.iuh.edu.vn.ServiceRest;

import fit.iuh.edu.vn.entities.JobSkill;
import fit.iuh.edu.vn.repository.JobSkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobSkillService {
    private final JobSkillRepository jobSkillRepository;
    @Autowired
    public JobSkillService(JobSkillRepository jobSkillRepository) {
        this.jobSkillRepository = jobSkillRepository;
    }
    // viet ham all public findAll(),saveAll,save,findById,deleteById,delete
    public List<JobSkill> findAll() {
        return jobSkillRepository.findAll();
    }
    public List<JobSkill> saveAll(List<JobSkill> JobSkills) {
        return jobSkillRepository.saveAll(JobSkills);
    }
    public JobSkill save(JobSkill entity) {
        return jobSkillRepository.save(entity);
    }
    public void delete(JobSkill entity) {
        jobSkillRepository.delete(entity);
    }
}
