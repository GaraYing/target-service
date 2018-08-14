package com.gara.lock_demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 模拟仓库发货类
 * @author: GaraYing
 * @create: 2018-08-14 09:53
 **/

@RestController
@RequestMapping("/bank")
public class BankController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/handleOrder")
    public String handleOrder(@RequestParam(required = false) String orderid){

        logger.info("收到订单号：" + orderid + "，正在出货处理中……");
        try {
            Thread.currentThread().sleep(10000);
        }catch (Exception e){
            logger.error("出现错误了"+e.getMessage());
            e.printStackTrace();
            return "-1";
        }
        return "0";
    }
}
