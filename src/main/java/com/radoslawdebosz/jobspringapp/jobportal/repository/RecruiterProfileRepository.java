package com.radoslawdebosz.jobspringapp.jobportal.repository;

import com.radoslawdebosz.jobspringapp.jobportal.entity.RecruiterProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecruiterProfileRepository extends JpaRepository<RecruiterProfile, Integer> {
}
