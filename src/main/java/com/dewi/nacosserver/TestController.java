package com.dewi.nacosserver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: guoyuting
 * @Date: Created at 2020/6/2 3:49 PM
 */
@Slf4j
@RestController
public class TestController {
    @GetMapping(value = "/hello")
    public String hello(@RequestParam String name) {
        log.info("invoked name = " + name);
        return "hello, " + name;
    }
}
