package com.springaop.springaop.repo;

import com.springaop.springaop.model.JobPost;
import com.springaop.springaop.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(

            new JobPost(
                    1,
                    "Java Developer",
                    "Develop backend services using Spring Boot",
                    2,
                    Arrays.asList("Java", "Spring Boot", "Hibernate", "MySQL")
            ),

            new JobPost(
                    2,
                    "Frontend Developer",
                    "Build responsive UI using React",
                    1,
                    Arrays.asList("React", "JavaScript", "HTML", "CSS")
            ),

            new JobPost(
                    3,
                    "Full Stack Developer",
                    "Work on both frontend and backend",
                    3,
                    Arrays.asList("Java", "React", "Node.js", "MongoDB")
            ),

            new JobPost(
                    4,
                    "DevOps Engineer",
                    "Manage CI/CD pipelines and deployments",
                    4,
                    Arrays.asList("Docker", "Kubernetes", "AWS", "Jenkins")
            )

    ));

    public List<JobPost> getAllJobs()
    {
        return jobs;
    }

    public void addJob(JobPost job)
    {
        jobs.add(job);
    }

    public JobPost getjob(int postid) {
        for (JobPost job : jobs) {
            if (job.getPostId() == postid) {
                return job;
            }
        }
        return null; // if not found
    }


}
