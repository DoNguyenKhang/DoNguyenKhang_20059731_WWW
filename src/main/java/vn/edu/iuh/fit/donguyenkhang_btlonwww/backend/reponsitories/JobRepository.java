package vn.edu.iuh.fit.donguyenkhang_btlonwww.backend.reponsitories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.donguyenkhang_btlonwww.backend.models.Job;

public interface JobRepository extends JpaRepository<Job, Long> {
}