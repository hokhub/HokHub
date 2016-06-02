package hh.portal.service;

import org.springframework.beans.factory.InitializingBean;

import hh.portal.dao.JobDAO;
import hh.portal.model.Job_demo;

public class JobServiceImpl extends BaseService implements JobService, InitializingBean {

	@Override
	public Job_demo getJob() {
		 return daoProvider.getJobDAO().getJob();
	}
	

}
