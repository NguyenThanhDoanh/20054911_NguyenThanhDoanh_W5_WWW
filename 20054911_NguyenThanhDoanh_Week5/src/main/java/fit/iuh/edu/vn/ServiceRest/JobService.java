package fit.iuh.edu.vn.ServiceRest;

import fit.iuh.edu.vn.entities.Job;
import fit.iuh.edu.vn.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {
    private final JobRepository jobRepository;
    @Autowired
    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public List<Job> findAll() {
        return jobRepository.findAll();
    }
    public List<Job> saveAll(List<Job> Jobs) {
        return jobRepository.saveAll(Jobs);
    }
    public Job save(Job entity) {
        return jobRepository.save(entity);
    }
    public Optional findById(Long id) {
        return jobRepository.findById(id);
    }
    public void deleteById(Long id) {
        jobRepository.deleteById(id);
    }
    public void delete(Job entity) {
        jobRepository.delete(entity);
    }


}
