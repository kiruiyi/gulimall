package com.gulimall.dao;

import com.gulimall.domin.Purchase;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 采购信息 Mapper 接口
 * </p>
 *
 * @author moe
 * @since 2022-08-23
 */
@Mapper
public interface PurchaseDao extends BaseMapper<Purchase> {

}
