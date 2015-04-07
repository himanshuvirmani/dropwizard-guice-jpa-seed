package org.oregami.entities;

import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Audited
public class SubTask extends BaseEntityUUID {

    public SubTask() {};

    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
