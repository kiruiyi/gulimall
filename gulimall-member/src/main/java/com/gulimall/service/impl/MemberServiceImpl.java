package com.gulimall.service.impl;

import com.gulimall.domin.Member;
import com.gulimall.dao.MemberDao;
import com.gulimall.service.IMemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员 服务实现类
 * </p>
 *
 * @author moe
 * @since 2022-08-23
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberDao, Member> implements IMemberService {

}
