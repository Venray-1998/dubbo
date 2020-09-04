package com.fuwenrui.provider.service.impl;

import com.fuwenrui.common.service.Service;
import org.springframework.stereotype.Component;

/**
 * r
 *
 * @author fwr
 * @date 2020-09-04
 */
public class ServiceImpl implements Service {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
