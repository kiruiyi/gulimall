package com.gulimall.dao;

import com.gulimall.domin.CouponHistory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 优惠券领取历史记录 Mapper 接口
 * </p>
 *
 * @author moe
 * @since 2022-08-23
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistory> {

}
