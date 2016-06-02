package hh.portal.service;



import org.apache.commons.lang.Validate;

import hh.portal.dao.DAOProvider;

public abstract class BaseService {
    
    protected DAOProvider daoProvider;

    /**
     * Set the {@link DAOProvider} for this service
     *
     * @param daoProvider the {@link DAOProvider} to set
     */
    public void setDaoProvider(DAOProvider daoProvider) {
        this.daoProvider = daoProvider;
    }

    /**
     * Performs validation and other tasks necessary after dependency injection is complete
     */
    public void afterPropertiesSet() {
        Validate.notNull(daoProvider);
    }
}
