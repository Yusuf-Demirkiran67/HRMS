package kodlamaio.HRMS.business.Validation;


import kodlamaio.HRMS.dataAccess.abstracts.JobSeekerDao;

public class ValidationManager implements ValidationService {

	JobSeekerDao jobSeekerDao;
	
	public ValidationManager(JobSeekerDao jobSeekerDao) {
		super();
		this.jobSeekerDao = jobSeekerDao;
	}

	@Override
	public boolean CheckIfExistJobSeeker(int id) {
	
		return this.jobSeekerDao.existsById(id);
	}



}
