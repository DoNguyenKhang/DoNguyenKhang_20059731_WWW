package vn.edu.iuh.fit.donguyenkhang_btlonwww.backend.reponsitories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.donguyenkhang_btlonwww.backend.models.CandidateSkill;
import vn.edu.iuh.fit.donguyenkhang_btlonwww.backend.models.CandidateSkillId;

public interface CandidateSkillRepository extends JpaRepository<CandidateSkill, CandidateSkillId> {
}