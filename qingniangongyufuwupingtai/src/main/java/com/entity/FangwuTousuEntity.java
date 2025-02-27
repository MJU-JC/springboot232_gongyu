package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 房屋投诉
 *
 * @author 
 * @email
 */
@TableName("fangwu_tousu")
public class FangwuTousuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public FangwuTousuEntity() {

	}

	public FangwuTousuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 房屋
     */
    @TableField(value = "fangwu_id")

    private Integer fangwuId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 房屋投诉编号
     */
    @TableField(value = "fangwu_tousu_uuid_number")

    private String fangwuTousuUuidNumber;


    /**
     * 投诉标题
     */
    @TableField(value = "fangwu_tousu_name")

    private String fangwuTousuName;


    /**
     * 投诉类型
     */
    @TableField(value = "fangwu_tousu_types")

    private Integer fangwuTousuTypes;


    /**
     * 投诉详情
     */
    @TableField(value = "fangwu_tousu_content")

    private String fangwuTousuContent;


    /**
     * 投诉时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 是否处理
     */
    @TableField(value = "fangwu_tousu_chuli_types")

    private Integer fangwuTousuChuliTypes;


    /**
     * 处理结果
     */
    @TableField(value = "fangwu_tousu_chuli_content")

    private String fangwuTousuChuliContent;


    /**
     * 逻辑删除
     */
    @TableField(value = "fangwu_tousu_delete")

    private Integer fangwuTousuDelete;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：房屋
	 */
    public Integer getFangwuId() {
        return fangwuId;
    }
    /**
	 * 获取：房屋
	 */

    public void setFangwuId(Integer fangwuId) {
        this.fangwuId = fangwuId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：房屋投诉编号
	 */
    public String getFangwuTousuUuidNumber() {
        return fangwuTousuUuidNumber;
    }
    /**
	 * 获取：房屋投诉编号
	 */

    public void setFangwuTousuUuidNumber(String fangwuTousuUuidNumber) {
        this.fangwuTousuUuidNumber = fangwuTousuUuidNumber;
    }
    /**
	 * 设置：投诉标题
	 */
    public String getFangwuTousuName() {
        return fangwuTousuName;
    }
    /**
	 * 获取：投诉标题
	 */

    public void setFangwuTousuName(String fangwuTousuName) {
        this.fangwuTousuName = fangwuTousuName;
    }
    /**
	 * 设置：投诉类型
	 */
    public Integer getFangwuTousuTypes() {
        return fangwuTousuTypes;
    }
    /**
	 * 获取：投诉类型
	 */

    public void setFangwuTousuTypes(Integer fangwuTousuTypes) {
        this.fangwuTousuTypes = fangwuTousuTypes;
    }
    /**
	 * 设置：投诉详情
	 */
    public String getFangwuTousuContent() {
        return fangwuTousuContent;
    }
    /**
	 * 获取：投诉详情
	 */

    public void setFangwuTousuContent(String fangwuTousuContent) {
        this.fangwuTousuContent = fangwuTousuContent;
    }
    /**
	 * 设置：投诉时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：投诉时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：是否处理
	 */
    public Integer getFangwuTousuChuliTypes() {
        return fangwuTousuChuliTypes;
    }
    /**
	 * 获取：是否处理
	 */

    public void setFangwuTousuChuliTypes(Integer fangwuTousuChuliTypes) {
        this.fangwuTousuChuliTypes = fangwuTousuChuliTypes;
    }
    /**
	 * 设置：处理结果
	 */
    public String getFangwuTousuChuliContent() {
        return fangwuTousuChuliContent;
    }
    /**
	 * 获取：处理结果
	 */

    public void setFangwuTousuChuliContent(String fangwuTousuChuliContent) {
        this.fangwuTousuChuliContent = fangwuTousuChuliContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getFangwuTousuDelete() {
        return fangwuTousuDelete;
    }
    /**
	 * 获取：逻辑删除
	 */

    public void setFangwuTousuDelete(Integer fangwuTousuDelete) {
        this.fangwuTousuDelete = fangwuTousuDelete;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "FangwuTousu{" +
            "id=" + id +
            ", fangwuId=" + fangwuId +
            ", yonghuId=" + yonghuId +
            ", fangwuTousuUuidNumber=" + fangwuTousuUuidNumber +
            ", fangwuTousuName=" + fangwuTousuName +
            ", fangwuTousuTypes=" + fangwuTousuTypes +
            ", fangwuTousuContent=" + fangwuTousuContent +
            ", insertTime=" + insertTime +
            ", fangwuTousuChuliTypes=" + fangwuTousuChuliTypes +
            ", fangwuTousuChuliContent=" + fangwuTousuChuliContent +
            ", fangwuTousuDelete=" + fangwuTousuDelete +
            ", createTime=" + createTime +
        "}";
    }
}
