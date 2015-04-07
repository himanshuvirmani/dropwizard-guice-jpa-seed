package org.oregami.service;

import com.google.inject.Inject;

import org.oregami.entities.GenericDAOUUID;
import org.oregami.entities.SubTask;
import org.oregami.entities.SubTaskDao;
import org.oregami.entities.Task;
import org.oregami.entities.TaskDao;
import org.oregami.validation.IEntityValidator;
import org.oregami.validation.SubTaskValidator;
import org.oregami.validation.TaskValidator;

public class SubTaskService extends TopLevelEntityService<SubTask> {

    @Inject
    SubTaskDao dao;

    @Override
    public GenericDAOUUID<SubTask, String> getDao() {
        return dao;
    }

    @Override
    public IEntityValidator buildEntityValidator(SubTask entity) {
        return new SubTaskValidator(entity);
    }
}
