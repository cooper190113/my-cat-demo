package com.cat.service.impl;

import com.cat.service.CatService;
import com.dianping.cat.Cat;
import org.springframework.stereotype.Service;

/**
 * @Description: CatServiceImpl
 * @Author: wutuo
 * @Date: 2021-07-14
 * @Version:v1.0
 */
@Service
public class CatServiceImpl implements CatService {

    @Override
    public String getHello() {
        Cat.logEvent("catType1", "catName1");
        Cat.logError(new Exception("this is a cat error log"));
        return "hello world!";
    }
}
