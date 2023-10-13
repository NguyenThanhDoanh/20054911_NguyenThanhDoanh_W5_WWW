package fit.iuh.edu.vn.ServiceRest;

import fit.iuh.edu.vn.entities.Company;
import fit.iuh.edu.vn.repository.CandidateRepository;
import fit.iuh.edu.vn.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {
    private final CompanyRepository companyRepository;
    @Autowired
    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public List<Company> findAll() {
        return companyRepository.findAll();
    }
    public List<Company> saveAll(List<Company> Companies) {
        return companyRepository.saveAll(Companies);
    }
    public Company save(Company entity) {
        return companyRepository.save(entity);
    }
    public Optional findById(Long id) {
        return companyRepository.findById(id);
    }
    public void deleteById(Long id) {
        companyRepository.deleteById(id);
    }
    public void delete(Company entity) {
        companyRepository.delete(entity);
    }
}
