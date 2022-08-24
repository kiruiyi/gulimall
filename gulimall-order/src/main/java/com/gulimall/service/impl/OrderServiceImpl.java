package com.gulimall.service.impl;

import com.gulimall.domin.Order;
import com.gulimall.dao.OrderDao;
import com.gulimall.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单 服务实现类
 * </p>
 *
 * @author moe
 * @since 2022-08-23
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderDao, Order> implements IOrderService {

}
