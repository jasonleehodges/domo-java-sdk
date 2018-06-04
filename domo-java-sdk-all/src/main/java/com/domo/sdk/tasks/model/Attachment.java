package com.domo.sdk.tasks.model;

import java.util.Objects;

public class Attachment {

    private String created;
    private Long creator;
    private Long dataFileId;
    private Long id;
    private String name;
    private String previewImage;
    private Long taskId;
    private String type;

    public Attachment(String created, Long creator, Long dataFileId, Long id, String name, String previewImage, Long taskId, String type) {
        this.created = created;
        this.creator = creator;
        this.dataFileId = dataFileId;
        this.id = id;
        this.name = name;
        this.previewImage = previewImage;
        this.taskId = taskId;
        this.type = type;
    }

    public String getCreated() { return created; }

    public void setCreated(String created) { this.created = created; }

    public Long getCreator() { return creator; }

    public void setCreator(Long creator) { this.creator = creator; }

    public Long getDataFileId() { return dataFileId; }

    public void setDataFileId(Long dataFileId) { this.dataFileId = dataFileId; }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getPreviewImage() { return previewImage; }

    public void setPreviewImage(String previewImage) { this.previewImage = previewImage; }

    public Long getTaskId() { return taskId; }

    public void setTaskId(Long taskId) { this.taskId = taskId; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Attachment that = (Attachment) o;
        return Objects.equals(created, that.created) &&
                Objects.equals(creator, that.creator) &&
                Objects.equals(dataFileId, that.dataFileId) &&
                Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(previewImage, that.previewImage) &&
                Objects.equals(taskId, that.taskId) &&
                Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {

        return Objects.hash(created, creator, dataFileId, id, name, previewImage, taskId, type);
    }
}
