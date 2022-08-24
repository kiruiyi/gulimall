package com.gulimall.controller;


import com.gulimall.domin.Member;
import com.gulimall.feign.CouponFeignService;
import io.renren.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 会员 前端控制器
 * </p>
 *
 * @author moe
 * @since 2022-08-23
 */
@RestController
@RequestMapping("/member")
public class MemberController {
    @Autowired
    private CouponFeignService couponFeignService;

    @RequestMapping("/coupons")
    public R test() {
        Member member = new Member();
        member.setNickname("张三");
        R membercoupons = couponFeignService.membercoupons();
        return R.ok().put("member", member).put("coupons", membercoupons.get("coupons"));
    }

}

