package fit.iuh.edu.vn.ServiceRest;

import fit.iuh.edu.vn.entities.Experience;
import fit.iuh.edu.vn.repository.CompanyRepository;
import fit.iuh.edu.vn.repository.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExperienceService {
    private final ExperienceRepository experienceRepository;
    @Autowired
    public ExperienceService(ExperienceRepository experienceRepository) {
        this.experienceRepository = experienceRepository;
    }
    public List<Experience> findAll() {
        return experienceRepository.findAll();
    }
    public List<Experience> saveAll(List<Experience> Experiences) {
        return experienceRepository.saveAll(Experiences);
    }
    public Experience save(Experience entity) {
        return experienceRepository.save(entity);
    }
    public Optional findById(Long id) {
        return experienceRepository.findById(id);
    }
    public void deleteById(Long id) {
        experienceRepository.deleteById(id);
    }
    public void delete(Experience entity) {
        experienceRepository.delete(entity);
    }
}
