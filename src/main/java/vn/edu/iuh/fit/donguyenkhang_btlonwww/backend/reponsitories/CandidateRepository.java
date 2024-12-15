package vn.edu.iuh.fit.donguyenkhang_btlonwww.backend.reponsitories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.donguyenkhang_btlonwww.backend.models.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}