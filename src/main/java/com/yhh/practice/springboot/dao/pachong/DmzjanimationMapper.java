package com.yhh.practice.springboot.dao.pachong;

import com.yhh.practice.springboot.model.Dmzjanimation;

public interface DmzjanimationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Dmzjanimation record);

    int insertSelective(Dmzjanimation record);

    Dmzjanimation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dmzjanimation record);

    int updateByPrimaryKey(Dmzjanimation record);
}