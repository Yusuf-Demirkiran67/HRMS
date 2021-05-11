package kodlamaio.HRMS.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.business.Validation.EmailValidatorService;
import kodlamaio.HRMS.business.Validation.ValidationService;
import kodlamaio.HRMS.business.abstracts.JobSeekerCheckService;
import kodlamaio.HRMS.business.abstracts.JobSeekerService;
import kodlamaio.HRMS.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.HRMS.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService {

	JobSeekerDao jobSeekerDao;
	JobSeekerCheckService jobSeekerCheckService;
	EmailValidatorService emailValidatorService;
	ValidationService validationService;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao,
			JobSeekerCheckService jobSeekerCheckService
			,EmailValidatorService emailValidatorService
			,ValidationService validationService)
	{
		super();
		this.jobSeekerDao = jobSeekerDao;
		this.jobSeekerCheckService = jobSeekerCheckService;
		this.emailValidatorService = emailValidatorService;
		this.validationService=validationService;
	}


	@Override
	public void add(JobSeeker jobSeeker) {
		
		Validate(jobSeeker);
		this.jobSeekerCheckService.CheckIfRealJobSeeker(jobSeeker);
		this.jobSeekerDao.save(jobSeeker);
		
	}


	private void Validate(JobSeeker jobSeeker) {
		if(this.emailValidatorService.validate(jobSeeker.getEmail())==false)
		{
			System.out.println("Email hatalıdır !!!");
			return;
		}
		if(this.validationService.CheckIfExistJobSeeker(jobSeeker.getId())==true)
		{
			System.out.println("Bu kişi zaten kayıtlıdır.");
			return;
		}
	}

	@Override
	public void delete(int id) {

	 this.jobSeekerDao.deleteById(id);
		
	}


	@Override
	public List<JobSeeker> getAll() {
		
		return this.jobSeekerDao.findAll();
	}

	
}
