package com.gulimall.domin;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author moe
 * @since 2022-08-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class MqMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "message_id", type = IdType.ASSIGN_ID)
    private String messageId;

    /**
     * JSON
     */
    private String content;

    private String toExchange;

    private String classType;

    /**
     * 0-新建 1-已发送 2-错误抵达 3-已抵达
     */
    private Integer messageStatus;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}
