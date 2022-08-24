package com.gulimall.dao;

import com.gulimall.domin.OrderItem;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 订单项信息 Mapper 接口
 * </p>
 *
 * @author moe
 * @since 2022-08-23
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItem> {

}
