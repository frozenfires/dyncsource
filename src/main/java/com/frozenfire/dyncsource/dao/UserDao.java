package com.frozenfire.dyncsource.dao;

import com.frozenfire.dyncsource.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    List<User> findAll();
}
