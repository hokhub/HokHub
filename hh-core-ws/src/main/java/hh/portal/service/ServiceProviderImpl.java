package hh.portal.service;

public class ServiceProviderImpl implements ServiceProvider {
	private JobService jobService;
	
	@Override
	public JobService getJobService() {
		// TODO Auto-generated method stub
		return jobService;
	}
	
	public void setJobService(JobService jobService){
		
		this.jobService=jobService;
	}
}
