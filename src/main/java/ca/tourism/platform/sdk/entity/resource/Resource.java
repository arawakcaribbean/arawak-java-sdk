package ca.tourism.platform.sdk.entity.resource;

import java.util.Date;

/**
 * Created by ups on 27/03/19.
 */

public class Resource {

    private String id;
    private String name ;
    private boolean active ;
    private boolean bookeable;
    private Object data ;

    private boolean deleted ;
    private Date deletedAt ;

    public Resource() {
    }

    public Resource(String id, String name, boolean active, boolean bookeable, Object data) {
        this.id = id;
        this.name = name;
        this.data = data;
        this.data = active;
        this.deleted=false;
        this.bookeable = bookeable ;
        this.deletedAt = new Date() ;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    public boolean isBookeable() {
        return bookeable;
    }

    public void setBookeable(boolean bookeable) {
        this.bookeable = bookeable;
    }

    @Override
    public String toString() {
        return "ResourceProvider{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", data=" + data +
                '}';
    }
}
