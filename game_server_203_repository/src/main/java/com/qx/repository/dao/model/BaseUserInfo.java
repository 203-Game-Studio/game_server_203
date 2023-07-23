package com.qx.repository.dao.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author haoqiang
 * @email 3277427547@qq.com
 * @date 2023/7/22 1:04
 */
@TableName("base_user_info")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BaseUserInfo {
    /**
     * 指定主键名、主键生产策略
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("nick_name")
    private String nickName;
    @TableField("passWord")
    private String passWord;
    @TableField("gender")
    private Integer gender;
    @TableField("status")
    private Integer status;
    @TableField("device_id")
    private Long deviceId;
}
