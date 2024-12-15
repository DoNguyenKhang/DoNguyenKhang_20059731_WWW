package vn.edu.iuh.fit.donguyenkhang_btlonwww.backend.reponsitories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.donguyenkhang_btlonwww.backend.models.JobSkill;
import vn.edu.iuh.fit.donguyenkhang_btlonwww.backend.models.JobSkillId;

public interface JobSkillRepository extends JpaRepository<JobSkill, JobSkillId> {
}