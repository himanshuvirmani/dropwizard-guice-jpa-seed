package org.oregami.entities;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.persist.Transactional;

import org.joda.time.LocalDateTime;

import javax.persistence.EntityManager;

public class SubTaskDao extends GenericDAOUUIDImpl<SubTask, String>{

	@Inject
	public SubTaskDao(Provider<EntityManager> emf) {
		super(emf);
		entityClass=SubTask.class;
	}

	public SubTask findByExactName(String name) {
        SubTask t = (SubTask) getEntityManager()
        		.createNativeQuery("SELECT * FROM SubTask t where lower(r.name) = :value ", SubTask.class).setParameter("value", name.toLowerCase()).getSingleResult();
        return t;
    }


    @Override
    @Transactional
    public void update(SubTask entity) {
        super.update(entity);
    }

    @Override
    @Transactional
    public String save(SubTask entity) {
        return super.save(entity);
    }

}
