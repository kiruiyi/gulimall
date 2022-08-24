package com.gulimall.feign;

import io.renren.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("CouponServer")
public interface CouponFeignService {

    @RequestMapping("/coupon/member/list")
    public R membercoupons();

}
