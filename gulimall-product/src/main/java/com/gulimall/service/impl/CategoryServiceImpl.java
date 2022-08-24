package com.gulimall.service.impl;

import com.gulimall.domin.Category;
import com.gulimall.dao.CategoryDao;
import com.gulimall.service.ICategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品三级分类 服务实现类
 * </p>
 *
 * @author moe
 * @since 2022-08-23
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, Category> implements ICategoryService {

}
