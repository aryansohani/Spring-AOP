package com.springaop.springaop;

import com.springaop.springaop.model.JobPost;
import com.springaop.springaop.Service.JobService;
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
    public String addJob(@RequestBody JobPost job) throws InterruptedException {
        service.addJob(job);
        return "Job Added Successfully";
    }

    @GetMapping("/{postid}")
    public JobPost getjob(@PathVariable int postid)
    {
        return service.getjob(postid);
    }
}