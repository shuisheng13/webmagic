package com.yhh.practice.springboot.dao.csdnblog;

import com.yhh.practice.springboot.model.Csdnblog;

public interface CsdnblogMapper {
    int deleteByPrimaryKey(Integer key);

    int insert(Csdnblog record);

    int insertSelective(Csdnblog record);

    Csdnblog selectByPrimaryKey(Integer key);

    int updateByPrimaryKeySelective(Csdnblog record);

    int updateByPrimaryKey(Csdnblog record);
}