package fit.iuh.edu.vn.ServiceRest;

import fit.iuh.edu.vn.entities.Address;
import fit.iuh.edu.vn.entities.Candidate;
import fit.iuh.edu.vn.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CandidateService {
    private  final CandidateRepository candidateRepository;
    @Autowired
    public CandidateService(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    public List<Candidate> findAll() {
        return candidateRepository.findAll();
    }

    public List<Candidate> saveAll(List<Candidate> Candidates) {
        return candidateRepository.saveAll(Candidates);
    }

    public Candidate save(Candidate entity) {
        return candidateRepository.save(entity);
    }

    public Optional findById(Long id) {
        return candidateRepository.findById(id);
    }

    public void deleteById(Long id) {
        candidateRepository.deleteById(id);
    }

    public void delete(Candidate entity) {
        candidateRepository.delete(entity);
    }

}
