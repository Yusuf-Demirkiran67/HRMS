package kodlamaio.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.business.abstracts.JobSeekerService;
import kodlamaio.HRMS.entities.concretes.JobSeeker;

@RestController
@RequestMapping(name="/api/jobseekers")
public class JobSeekersController {

private JobSeekerService  jobSeekerService;
	
	@Autowired
	public JobSeekersController(JobSeekerService  jobSeekerService) {
		super();
		this.jobSeekerService = jobSeekerService;
	}

	@GetMapping("/getall")
	public List<JobSeeker> getAll(){
	
		return this.jobSeekerService.getAll();
	}
}
