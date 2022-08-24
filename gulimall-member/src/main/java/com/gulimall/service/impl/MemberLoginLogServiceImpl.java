package com.gulimall.service.impl;

import com.gulimall.domin.MemberLoginLog;
import com.gulimall.dao.MemberLoginLogDao;
import com.gulimall.service.IMemberLoginLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员登录记录 服务实现类
 * </p>
 *
 * @author moe
 * @since 2022-08-23
 */
@Service
public class MemberLoginLogServiceImpl extends ServiceImpl<MemberLoginLogDao, MemberLoginLog> implements IMemberLoginLogService {

}
