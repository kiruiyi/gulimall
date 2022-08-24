package com.gulimall.service.impl;

import com.gulimall.domin.PaymentInfo;
import com.gulimall.dao.PaymentInfoDao;
import com.gulimall.service.IPaymentInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 支付信息表 服务实现类
 * </p>
 *
 * @author moe
 * @since 2022-08-23
 */
@Service
public class PaymentInfoServiceImpl extends ServiceImpl<PaymentInfoDao, PaymentInfo> implements IPaymentInfoService {

}
