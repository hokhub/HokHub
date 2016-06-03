package hh.portal.dao;

import java.util.Date;

import hh.portal.model.Job_demo;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

public class JobDAOHibernate  extends HibernateDaoSupport implements JobDAO{

	@Override
	public Job_demo getJob() {
		Criteria criteria =currentSession().createCriteria(Job_demo.class);
        criteria.add(Restrictions.eq("job_id", 1));
        Job_demo foundJob = (Job_demo) criteria.uniqueResult();
               
        return foundJob;
	}
	
}
