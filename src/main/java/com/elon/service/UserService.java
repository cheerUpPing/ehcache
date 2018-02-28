package com.elon.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 2017/7/19 17:42.
 * <p>
 * Email: cheerUpPing@163.com
 */
@Service
public class UserService {

    @Cacheable(value = "mycache", key = "#param")
    public String getTime(String param) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currTime = sdf.format(new Date());
        System.out.println("add service---------------------:" + currTime);
        return currTime;
    }

    @CacheEvict(value = "mycache", key = "#param")
    public void removeTime(String param) {
        System.out.println(param + "已经删除");
    }

    @CachePut(value = "mycache", key = "#param")
    public String updateTime(String param) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currTime = sdf.format(new Date());
        System.out.println("update service---------------------:" + currTime);
        return currTime;
    }

}
