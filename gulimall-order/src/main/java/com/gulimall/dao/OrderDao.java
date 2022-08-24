package com.gulimall.dao;

import com.gulimall.domin.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 订单 Mapper 接口
 * </p>
 *
 * @author moe
 * @since 2022-08-23
 */
@Mapper
public interface OrderDao extends BaseMapper<Order> {

}
