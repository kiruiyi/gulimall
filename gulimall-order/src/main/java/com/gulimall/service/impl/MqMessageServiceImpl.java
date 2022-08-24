package com.gulimall.service.impl;

import com.gulimall.domin.MqMessage;
import com.gulimall.dao.MqMessageDao;
import com.gulimall.service.IMqMessageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author moe
 * @since 2022-08-23
 */
@Service
public class MqMessageServiceImpl extends ServiceImpl<MqMessageDao, MqMessage> implements IMqMessageService {

}
