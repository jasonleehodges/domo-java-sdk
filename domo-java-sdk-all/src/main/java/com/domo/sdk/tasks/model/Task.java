package com.domo.sdk.tasks.model;

import java.util.*;

public class Task {

    private String id;
    private String projectId;
    private String projectListId;
    private String taskName;
    private String created;
    private Long priority;
    private Long creator;
    private String status;
    private Set<TaskOwner> owners;
    private Collection<Attachment> attachments;
    private List<String> tags;
    private Boolean archived;
    private Long primaryTaskOwner;
    private String description;
    private String comment;
    private Date dueDate;
    private Date updated;
    private Long logCount;
    private String resourceId;

    public Task(String id, String projectId, String projectListId, String taskName, String created, Long priority,
                Long creator, String status, Set<TaskOwner> owners, Collection<Attachment> attachments,
                List<String> tags, Boolean archived, Long primaryTaskOwner, String description, String comment,
                Date dueDate, Date updated, Long logCount, String resourceId) {
        this.id = id;
        this.projectId = projectId;
        this.projectListId = projectListId;
        this.taskName = taskName;
        this.created = created;
        this.priority = priority;
        this.creator = creator;
        this.status = status;
        this.owners = owners;
        this.attachments = attachments;
        this.tags = tags;
        this.archived = archived;
        this.primaryTaskOwner = primaryTaskOwner;
        this.description = description;
        this.comment = comment;
        this.dueDate = dueDate;
        this.updated = updated;
        this.logCount = logCount;
        this.resourceId = resourceId;
    }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getProjectId() { return projectId; }

    public void setProjectId(String projectId) { this.projectId = projectId; }

    public String getProjectListId() { return projectListId; }

    public void setProjectListId(String projectListId) { this.projectListId = projectListId; }

    public String getTaskName() { return taskName; }

    public void setTaskName(String taskName) { this.taskName = taskName; }

    public String getCreated() { return created; }

    public void setCreated(String created) { this.created = created; }

    public Long getPriority() { return priority; }

    public void setPriority(Long priority) { this.priority = priority; }

    public Long getCreator() { return creator; }

    public void setCreator(Long creator) { this.creator = creator; }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }

    public Set<TaskOwner> getOwners() { return owners; }

    public void setOwners(Set<TaskOwner> owners) { this.owners = owners; }

    public Collection<Attachment> getAttachments() { return attachments; }

    public void setAttachments(Collection<Attachment> attachments) { this.attachments = attachments; }

    public List<String> getTags() { return tags; }

    public void setTags(List<String> tags) { this.tags = tags; }

    public Boolean getArchived() { return archived; }

    public void setArchived(Boolean archived) { this.archived = archived; }

    public Long getPrimaryTaskOwner() { return primaryTaskOwner; }

    public void setPrimaryTaskOwner(Long primaryTaskOwner) { this.primaryTaskOwner = primaryTaskOwner; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public String getComment() { return comment; }

    public void setComment(String comment) { this.comment = comment; }

    public Date getDueDate() { return dueDate; }

    public void setDueDate(Date dueDate) { this.dueDate = dueDate; }

    public Date getUpdated() { return updated; }

    public void setUpdated(Date updated) { this.updated = updated; }

    public Long getLogCount() { return logCount; }

    public void setLogCount(Long logCount) { this.logCount = logCount; }

    public String getResourceId() { return resourceId; }

    public void setResourceId(String resourceId) { this.resourceId = resourceId; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id) &&
                Objects.equals(projectId, task.projectId) &&
                Objects.equals(projectListId, task.projectListId) &&
                Objects.equals(taskName, task.taskName) &&
                Objects.equals(created, task.created) &&
                Objects.equals(priority, task.priority) &&
                Objects.equals(creator, task.creator) &&
                Objects.equals(status, task.status) &&
                Objects.equals(owners, task.owners) &&
                Objects.equals(attachments, task.attachments) &&
                Objects.equals(tags, task.tags) &&
                Objects.equals(archived, task.archived) &&
                Objects.equals(primaryTaskOwner, task.primaryTaskOwner) &&
                Objects.equals(description, task.description) &&
                Objects.equals(comment, task.comment) &&
                Objects.equals(dueDate, task.dueDate) &&
                Objects.equals(updated, task.updated) &&
                Objects.equals(logCount, task.logCount) &&
                Objects.equals(resourceId, task.resourceId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, projectId, projectListId, taskName, created, priority, creator, status, owners,
                attachments, tags, archived, primaryTaskOwner, description, comment, dueDate, updated, logCount,
                resourceId);
    }
}
