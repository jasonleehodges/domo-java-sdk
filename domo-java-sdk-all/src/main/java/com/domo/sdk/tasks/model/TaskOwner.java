package com.domo.sdk.tasks.model;

import java.io.Serializable;
import java.util.Date;

public class TaskOwner implements Serializable {

    private Long id;
    private Long taskId;
    private Long assignedTo;
    private Long assignedBy;
    private Date created;

    public TaskOwner() {
    }

    public TaskOwner(Long assignedTo, Long assignedBy) {
        this.assignedTo = assignedTo;
        this.assignedBy = assignedBy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(Long assignedTo) {
        this.assignedTo = assignedTo;
    }

    public Long getAssignedBy() {
        return assignedBy;
    }

    public void setAssignedBy(Long assignedBy) {
        this.assignedBy = assignedBy;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Long getTaskId() { return taskId; }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaskOwner owner = (TaskOwner) o;

        if (assignedTo != null ? !assignedTo.equals(owner.assignedTo) : owner.assignedTo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return assignedTo != null ? assignedTo.hashCode() : 0;
    }
}
