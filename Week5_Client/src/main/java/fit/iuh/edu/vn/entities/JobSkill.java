package fit.iuh.edu.vn.entities;

import fit.iuh.edu.vn.emums.SkillLevel;
import fit.iuh.edu.vn.ids.JobSkillID;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="job_skill")
@IdClass(value = JobSkillID.class)
@NoArgsConstructor
@AllArgsConstructor
@Data

public class JobSkill {

    @Id
    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;



    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;


    @Column(name = "skill_level")
    private SkillLevel SkllLevel;

    @Column(name = "more_infos")
    private String moreInfor;




}