package com.gulimall.service.impl;

import com.gulimall.domin.OrderSetting;
import com.gulimall.dao.OrderSettingDao;
import com.gulimall.service.IOrderSettingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单配置信息 服务实现类
 * </p>
 *
 * @author moe
 * @since 2022-08-23
 */
@Service
public class OrderSettingServiceImpl extends ServiceImpl<OrderSettingDao, OrderSetting> implements IOrderSettingService {

}
