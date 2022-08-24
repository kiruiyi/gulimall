package com.gulimall.service.impl;

import com.gulimall.domin.OrderItem;
import com.gulimall.dao.OrderItemDao;
import com.gulimall.service.IOrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单项信息 服务实现类
 * </p>
 *
 * @author moe
 * @since 2022-08-23
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemDao, OrderItem> implements IOrderItemService {

}
