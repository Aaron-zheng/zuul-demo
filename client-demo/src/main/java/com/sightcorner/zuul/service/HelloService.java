package com.sightcorner.zuul.service;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("Server")
public interface HelloService {


    @RequestMapping("/hello/{fallback}")
    public String hello(@PathVariable("fallback") String fallback);


}
