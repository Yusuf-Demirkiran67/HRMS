package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.EmailValidation.EmailValidatorService;
import kodlamaio.HRMS.business.abstracts.JobSeekerCheckService;
import kodlamaio.HRMS.business.abstracts.JobSeekerService;
import kodlamaio.HRMS.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.HRMS.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService {

	JobSeekerDao jobSeekerDao;
	JobSeekerCheckService jobSeekerCheckService;
	
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao,
			JobSeekerCheckService jobSeekerCheckService)
	{
		super();
		this.jobSeekerDao = jobSeekerDao;
		this.jobSeekerCheckService = jobSeekerCheckService;

	}

	@Override
	public List<JobSeeker> getAll() {
		
		return this.jobSeekerDao.findAll();
	}

	@Override
	public void add(JobSeeker jobSeeker) {
		if(this.jobSeekerCheckService.CheckIfExistJobSeeker(jobSeeker.getId())){
		  System.out.println("Bu kullanıcı sistemde zaten mevcut");
		  return;
		 
		}
		
		this.jobSeekerCheckService.CheckIfRealJobSeeker(jobSeeker);
		this.jobSeekerDao.save(jobSeeker);
	}

	@Override
	public void delete(int id) {

	 this.jobSeekerDao.deleteById(id);
		
	}

	
}
