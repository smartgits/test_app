package cn.bevol.statics.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

/**
 * @author mysens
 * @date 17-12-26 下午4:04
 */
public class MongoBase implements Serializable{

    @Id
    @JsonIgnore
    private String _id;

    /**
     * 自增业务id
     */
    @Indexed(unique=true,name="id")
    @Field("id")
    private Long id;

    @Field
    private Integer hidden;
    @Field
    @JsonIgnore
    private Integer deleted;

    /**
     * 修改时间
     */
    @Field
    private Long updateStamp;
    /**
     * 数据的系统创建时间 统一用createTime
     */
    @Field
    private Long createStamp;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getHidden() {
        return hidden;
    }

    public void setHidden(Integer hidden) {
        this.hidden = hidden;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Long getUpdateStamp() {
        return updateStamp;
    }

    public void setUpdateStamp(Long updateStamp) {
        this.updateStamp = updateStamp;
    }

    public Long getCreateStamp() {
        return createStamp;
    }

    public void setCreateStamp(Long createStamp) {
        this.createStamp = createStamp;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }
}
