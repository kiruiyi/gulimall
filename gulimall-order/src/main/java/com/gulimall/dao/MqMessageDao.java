package com.gulimall.dao;

import com.gulimall.domin.MqMessage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author moe
 * @since 2022-08-23
 */
@Mapper
public interface MqMessageDao extends BaseMapper<MqMessage> {

}
