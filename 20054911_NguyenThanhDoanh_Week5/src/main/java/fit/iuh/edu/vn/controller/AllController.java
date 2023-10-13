package fit.iuh.edu.vn.controller;

import fit.iuh.edu.vn.ServiceRest.*;
import fit.iuh.edu.vn.dataTo.AddressDto;
import fit.iuh.edu.vn.entities.*;
import fit.iuh.edu.vn.mapper.AddressMapper;
import fit.iuh.edu.vn.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1")
public class AllController {
    private AddressService addressService;
    private CandidateService candidateService;
    private CandidateSkillService candidateSkillService;
    private CompanyService companyService;
    private ExperienceService experienceService;
    private SkillService skillService;
    private JobService jobService;
    private JobSkillService jobSkillService;
    @Autowired
    public AllController(AddressService addressService, CandidateService candidateService, CandidateSkillService candidateSkillService, CompanyService companyService, ExperienceService experienceService, SkillService skillService, JobService jobService, JobSkillService jobSkillService) {
        this.addressService = addressService;
        this.candidateService = candidateService;
        this.candidateSkillService = candidateSkillService;
        this.companyService = companyService;
        this.experienceService = experienceService;
        this.skillService = skillService;
        this.jobService = jobService;
        this.jobSkillService = jobSkillService;
    }
    //    @GetMapping("/address")
//    public String getAddress(Model model){
//        List<AddressDto> addressDtos = addressService.getAllAddress();
//        model.addAttribute("addresss",addressDtos);
//        return "address-list";
//    }
    @GetMapping("/addresses/getall")
    public List<Address> findAlladdress() {
        return addressService.findAll();
    }
    @PostMapping("/addresses/saveall")
    public List<Address> saveAlladdress(@RequestBody List<Address> addresses) {
        return addressService.saveAll(addresses);
    }
    @PostMapping("/address/save")
    public Address saveaddress(@RequestBody Address entity) {
        return addressService.save(entity);
    }
    @GetMapping("/address/{id}")
    public Optional<Address> findByIdaddress(@PathVariable Long id) {
        return addressService.findById(id);
    }
    @DeleteMapping("/address/{id}/delete")
    public void deleteByIdaddress(@PathVariable Long id) {
        addressService.deleteById(id);
    }
    @DeleteMapping("/addresses/delete")
    public void deleteaddress(@RequestBody Address entity) {
        addressService.delete(entity);
    }
    //candidate
    @GetMapping("candidates/getall")
    public List<Candidate> findAllcandidate() {
        return candidateService.findAll();
    }

    @PostMapping("candidates/saveall")
    public List<Candidate> saveAllcandidate(@RequestBody List<Candidate> candidates) {
        return candidateService.saveAll(candidates);
    }

    @PostMapping("candidate/save")
    public Candidate savecandidate(@RequestBody Candidate candidate) {
        return candidateService.save(candidate);
    }

    @GetMapping("candidate/{id}")
    public Optional<Candidate> findByIdcandidate(@PathVariable Long id) {
        return candidateService.findById(id);
    }

    @DeleteMapping("candidate/{id}/delete")
    public void deleteByIdcandidate(@PathVariable Long id) {
        candidateService.deleteById(id);
    }

    @DeleteMapping("candidate/delete")
    public void deletecandidate(@RequestBody Candidate candidate) {
        candidateService.delete(candidate);
    }

    //candidateSkill
    @GetMapping("/candidateSkill/getall")
    public List<CandidateSkill> findAllcandidateSkill() {
        return candidateSkillService.findAll();
    }

    @PostMapping("/candidateSkill/saveall")
    public List<CandidateSkill> saveAllcandidateSkill(@RequestBody List<CandidateSkill> candidateSkills) {
        return candidateSkillService.saveAll(candidateSkills);
    }

    @PostMapping("/candidateSkill/save")
    public CandidateSkill savecandidateSkill(@RequestBody CandidateSkill candidateSkill) {
        return candidateSkillService.save(candidateSkill);
    }

    @DeleteMapping("/candidateSkill/delete")
    public void deletecandidateSkill(@RequestBody CandidateSkill candidateSkill) {
        candidateSkillService.delete(candidateSkill);
    }
//company
    @GetMapping("/company/getall")
    public List<Company> findAllCompany() {
        return companyService.findAll();
    }

    @PostMapping("/company/saveall")
    public List<Company> saveAllCompany(@RequestBody List<Company> companies) {
        return companyService.saveAll(companies);
    }

    @PostMapping("/company/save")
    public Company saveCompany(@RequestBody Company company) {
        return companyService.save(company);
    }

    @GetMapping("/company/{id}")
    public Optional<Company> findByIdCompany(@PathVariable Long id) {
        return companyService.findById(id);
    }

    @DeleteMapping("/company/{id}/delete")
    public void deleteByIdCompany(@PathVariable Long id) {
        companyService.deleteById(id);
    }

    @DeleteMapping("/company/delete")
    public void deleteCompany(@RequestBody Company company) {
        companyService.delete(company);
    }
    //experience
    @GetMapping("/experience/getall")
    public List<Experience> findAllexperience() {
        return experienceService.findAll();
    }

    @PostMapping("/experience/saveall")
    public List<Experience> saveAllexperience(@RequestBody List<Experience> experiences) {
        return experienceService.saveAll(experiences);
    }

    @PostMapping("/experience/save")
    public Experience saveexperience(@RequestBody Experience experience) {
        return experienceService.save(experience);
    }

    @GetMapping("/experience/{id}")
    public Optional<Experience> findByIdexperience(@PathVariable Long id) {
        return experienceService.findById(id);
    }

    @DeleteMapping("/experience/{id}/delete")
    public void deleteByIdexperience(@PathVariable Long id) {
        experienceService.deleteById(id);
    }

    @DeleteMapping("/experience/delete")
    public void deleteexperience(@RequestBody Experience experience) {
        experienceService.delete(experience);
    }
    //job
    @GetMapping("/job/getall")
    public List<Skill> findAlljob() {
        return skillService.findAll();
    }

    @PostMapping("/job/saveall")
    public List<Skill> saveAlljob(@RequestBody List<Skill> skills) {
        return skillService.saveAll(skills);
    }

    @PostMapping("/job/save")
    public Skill savejob(@RequestBody Skill skill) {
        return skillService.save(skill);
    }

    @GetMapping("/job/{id}")
    public Optional<Skill> findjobById(@PathVariable Long id) {
        return skillService.findById(id);
    }

    @DeleteMapping("/job/{id}/delete")
    public void deletejobById(@PathVariable Long id) {
        skillService.deleteById(id);
    }

    @DeleteMapping("/job/delete")
    public void deletejob(@RequestBody Skill skill) {
        skillService.delete(skill);
    }
    //jobSkill
    @GetMapping("/jobSkill/getall")
    public List<JobSkill> findAllJobSkills() {
        return jobSkillService.findAll();
    }

    @PostMapping("/jobSkill/saveall")
    public List<JobSkill> saveAllJobSkills(@RequestBody List<JobSkill> jobSkills) {
        return jobSkillService.saveAll(jobSkills);
    }

    @PostMapping("/jobSkill/save")
    public JobSkill saveJobSkill(@RequestBody JobSkill jobSkill) {
        return jobSkillService.save(jobSkill);
    }
    @DeleteMapping("/jobSkill/delete")
    public void deleteJobSkill(@RequestBody JobSkill jobSkill) {
        jobSkillService.delete(jobSkill);
    }
    //skill
    @GetMapping("/skill/getall")
    public List<Skill> findAllSkills() {
        return skillService.findAll();
    }

    @PostMapping("/skill/saveall")
    public List<Skill> saveAllSkills(@RequestBody List<Skill> skills) {
        return skillService.saveAll(skills);
    }

    @PostMapping("/skill/save")
    public Skill saveSkill(@RequestBody Skill skill) {
        return skillService.save(skill);
    }

    @GetMapping("/skill/{id}")
    public Optional<Skill> findSkillById(@PathVariable Long id) {
        return skillService.findById(id);
    }

    @DeleteMapping("/skill/{id}/delete")
    public void deleteSkillById(@PathVariable Long id) {
        skillService.deleteById(id);
    }

    @DeleteMapping("/skill/delete")
    public void deleteSkill(@RequestBody Skill skill) {
        skillService.delete(skill);
    }
}
