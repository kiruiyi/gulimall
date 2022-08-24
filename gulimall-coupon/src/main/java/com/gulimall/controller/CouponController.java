package com.gulimall.controller;


import com.gulimall.domin.Coupon;
import io.renren.utils.R;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * <p>
 * 优惠券信息 前端控制器
 * </p>
 *
 * @author moe
 * @since 2022-08-23
 */
@RefreshScope
@RestController
@RequestMapping("/coupon")
public class CouponController {
    @Value("${coupon.user.name}")
    private String name;


    @Value("${coupon.user.age}")
    private Integer age;

    @RequestMapping("/member/list")
    public R membercoupons() {
        Coupon coupon = new Coupon();
        coupon.setCouponName("满100减10");
        return R.ok().put("coupons", Arrays.asList(coupon));
    }

    @RequestMapping("/test")
    public R test() {
          return R.ok().put("name",name).put("age",age);
    }

}

