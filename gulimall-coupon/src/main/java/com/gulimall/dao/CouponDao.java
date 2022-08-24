package com.gulimall.dao;

import com.gulimall.domin.Coupon;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 优惠券信息 Mapper 接口
 * </p>
 *
 * @author moe
 * @since 2022-08-23
 */
@Mapper
public interface CouponDao extends BaseMapper<Coupon> {

}
