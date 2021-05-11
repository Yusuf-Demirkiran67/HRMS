package kodlamaio.HRMS.business.abstracts;

import kodlamaio.HRMS.entities.concretes.JobSeeker;

public interface JobSeekerCheckService {

	boolean CheckIfRealJobSeeker(JobSeeker jobSeeker);
	boolean CheckIfExistJobSeeker(int id);
	
}
