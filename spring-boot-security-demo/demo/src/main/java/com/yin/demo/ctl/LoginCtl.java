package com.yin.demo.ctl;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yin.
 * Date:2019/10/27
 * Time: 10:09
 */
@RestController
@Slf4j
public class LoginCtl {

    @RequestMapping("/security-login")
    public String processLogin() {

        log.info("come in");
        return "ok";

    }

    @RequestMapping("/processlogin-")
    public String test() {

        log.info("process");
        return "process";

    }
}
