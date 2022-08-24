package com.gulimall.dao;

import com.gulimall.domin.PaymentInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 支付信息表 Mapper 接口
 * </p>
 *
 * @author moe
 * @since 2022-08-23
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfo> {

}
