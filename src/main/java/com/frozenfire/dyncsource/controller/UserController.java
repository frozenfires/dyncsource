package com.frozenfire.dyncsource.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.frozenfire.dyncsource.config.DataSource;
import com.frozenfire.dyncsource.entity.User;
import com.frozenfire.dyncsource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @DataSource(value="master")
    @RequestMapping(value="/findAllMaster")
    @ResponseBody
    public String findAllMaster() {
        List<User> user = userService.findAll();
        String json = JSONObject.toJSONString(user);
        return json;
    }

    @DataSource(value = "slave")
    @RequestMapping(value = "/findAllSlave")
    @ResponseBody
    public String findAllSlave() {
        List<User> user = userService.findAll();
        String json = JSONObject.toJSONString(user);
        return json;
    }


}
