package cn.e3mall;

import java.io.Serializable;
import java.util.Date;

/**
 * (TbItemDesc)实体类
 *
 * @author makejava
 * @since 2020-12-07 18:34:45
 */
public class TbItemDesc implements Serializable {
    private static final long serialVersionUID = 653346590344774093L;

    private Integer itemId;

    private Date created;

    private Date updated;

    private String itemDesc;


    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

}
