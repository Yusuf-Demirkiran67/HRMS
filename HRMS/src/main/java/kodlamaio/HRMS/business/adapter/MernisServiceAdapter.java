package kodlamaio.HRMS.business.adapter;


import kodlamaio.HRMS.business.abstracts.JobSeekerCheckService;
import kodlamaio.HRMS.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.HRMS.entities.concretes.JobSeeker;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements JobSeekerCheckService{

	JobSeekerDao jobSeekerDao;
	
	public MernisServiceAdapter(JobSeekerDao jobSeekerDao) {
		super();
		this.jobSeekerDao = jobSeekerDao;
	}

	KPSPublicSoapProxy kps =new KPSPublicSoapProxy();

	@Override
	public boolean CheckIfRealJobSeeker(JobSeeker jobSeeker) {
		try {
		return kps.TCKimlikNoDogrula(Long.parseLong(jobSeeker.getNationalityId())
				,jobSeeker.getFirstName().toUpperCase(),jobSeeker.getLastName().toUpperCase()
				,jobSeeker.getDateOfBirth().getYear());
		}
		catch (Exception error) {
			System.out.println(error.getMessage());
			return false;
		}
	}

}
