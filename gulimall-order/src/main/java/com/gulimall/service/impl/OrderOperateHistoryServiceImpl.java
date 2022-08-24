package com.gulimall.service.impl;

import com.gulimall.domin.OrderOperateHistory;
import com.gulimall.dao.OrderOperateHistoryDao;
import com.gulimall.service.IOrderOperateHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单操作历史记录 服务实现类
 * </p>
 *
 * @author moe
 * @since 2022-08-23
 */
@Service
public class OrderOperateHistoryServiceImpl extends ServiceImpl<OrderOperateHistoryDao, OrderOperateHistory> implements IOrderOperateHistoryService {

}
