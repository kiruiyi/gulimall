package com.gulimall.service.impl;

import com.gulimall.domin.HomeSubject;
import com.gulimall.dao.HomeSubjectDao;
import com.gulimall.service.IHomeSubjectService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】 服务实现类
 * </p>
 *
 * @author moe
 * @since 2022-08-23
 */
@Service
public class HomeSubjectServiceImpl extends ServiceImpl<HomeSubjectDao, HomeSubject> implements IHomeSubjectService {

}
