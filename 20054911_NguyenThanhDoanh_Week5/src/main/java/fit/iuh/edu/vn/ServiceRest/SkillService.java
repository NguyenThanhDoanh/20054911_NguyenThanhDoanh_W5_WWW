package fit.iuh.edu.vn.ServiceRest;

import fit.iuh.edu.vn.entities.Skill;
import fit.iuh.edu.vn.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkillService {
    private final SkillRepository skillRepository;
    @Autowired
    public SkillService(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }
    // viet ham all public findAll(),saveAll,save,findById,deleteById,delete
    public List<Skill> findAll() {
        return skillRepository.findAll();
    }
    public List<Skill> saveAll(List<Skill> Skills) {
        return skillRepository.saveAll(Skills);
    }
    public Skill save(Skill entity) {
        return skillRepository.save(entity);
    }
    public void delete(Skill entity) {
        skillRepository.delete(entity);
    }
    public void deleteById(Long id) {
        skillRepository.deleteById(id);
    }
    public Optional findById(Long id) {
        return skillRepository.findById(id);
    }

}
