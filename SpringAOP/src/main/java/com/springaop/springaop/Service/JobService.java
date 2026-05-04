package com.springaop.springaop.Service;

import com.springaop.springaop.model.JobPost;
import com.springaop.springaop.repo.JobRepo;
import com.springaop.springaop.model.JobPost;
import com.springaop.springaop.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJob(JobPost job) throws InterruptedException {
        Thread.sleep(500);
        repo.addJob(job);   // ✅ FIXED
    }

    public List<JobPost> getAllJobs() {
        return repo.getAllJobs();   // ✅ FIXED
    }

    public JobPost getjob(int postid)
    {
        return repo.getjob(postid);
    }

    
}