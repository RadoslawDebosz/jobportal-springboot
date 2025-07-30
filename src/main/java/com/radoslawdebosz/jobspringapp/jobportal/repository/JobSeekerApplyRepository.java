package com.radoslawdebosz.jobspringapp.jobportal.repository;

import com.radoslawdebosz.jobspringapp.jobportal.entity.JobPostActivity;
import com.radoslawdebosz.jobspringapp.jobportal.entity.JobSeekerApply;
import com.radoslawdebosz.jobspringapp.jobportal.entity.JobSeekerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerApplyRepository extends JpaRepository<JobSeekerApply, Integer> {

    List<JobSeekerApply> findByUserId(JobSeekerProfile userId);

    List<JobSeekerApply> findByJob(JobPostActivity job);

}
