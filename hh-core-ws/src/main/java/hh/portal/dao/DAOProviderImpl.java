package hh.portal.dao;

import org.springframework.beans.factory.InitializingBean;


public class DAOProviderImpl implements DAOProvider, InitializingBean {

	private JobDAO jobDAO;


	public JobDAO getJobDAO() {
		return jobDAO;
	}
	
	public void setJobDAO(JobDAO jobDAO) {
		this.jobDAO = jobDAO;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	
}
