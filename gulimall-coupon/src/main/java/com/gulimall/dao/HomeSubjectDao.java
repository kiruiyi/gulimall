package com.gulimall.dao;

import com.gulimall.domin.HomeSubject;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】 Mapper 接口
 * </p>
 *
 * @author moe
 * @since 2022-08-23
 */
@Mapper
public interface HomeSubjectDao extends BaseMapper<HomeSubject> {

}
