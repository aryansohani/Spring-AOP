package com.springaop.springaops;

import com.springaop.springaops.Service.JobService;
import com.springaop.springaops.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController   // 🔥 CHANGE: Controller → RestController
@RequestMapping("/jobs")  // base URL
public class jobController {

    @Autowired
    private JobService service;

    // ✅ GET all jobs
    @GetMapping
    public List<JobPost> getAllJobs() {
        return service.getAllJobs();
    }

    // ✅ POST add job
    @PostMapping
    public String addJob(@RequestBody JobPost job) {
        service.addJob(job);
        return "Job Added Successfully";
    }
}