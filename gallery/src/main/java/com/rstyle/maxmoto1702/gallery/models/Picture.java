package com.rstyle.maxmoto1702.gallery.models;

import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

/**
 * Created by m on 19.04.2015.
 */
public class Picture {

    private Long id;
    @Size(min=3, max=60, message="Name must be between 3 and 60 characters long.")
    private String name;
    @Size(min=3, max=160, message="Description must be between 3 and 160 characters long.")
    private String description;
    private Date createDate;
    private Date editDate;
    private String thumbPath;
    private String filePath;
    private List<Comment> comments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getEditDate() {
        return editDate;
    }

    public void setEditDate(Date editDate) {
        this.editDate = editDate;
    }

    public String getThumbPath() {
        return thumbPath;
    }

    public void setThumbPath(String thumbPath) {
        this.thumbPath = thumbPath;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createDate=" + createDate +
                ", editDate=" + editDate +
                ", thumbPath='" + thumbPath + '\'' +
                ", filePath='" + filePath + '\'' +
                ", comments=" + comments +
                '}';
    }
}
