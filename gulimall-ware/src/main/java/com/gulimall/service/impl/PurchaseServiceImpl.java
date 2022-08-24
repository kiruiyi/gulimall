package com.gulimall.service.impl;

import com.gulimall.domin.Purchase;
import com.gulimall.dao.PurchaseDao;
import com.gulimall.service.IPurchaseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 采购信息 服务实现类
 * </p>
 *
 * @author moe
 * @since 2022-08-23
 */
@Service
public class PurchaseServiceImpl extends ServiceImpl<PurchaseDao, Purchase> implements IPurchaseService {

}
