package com.qcshop.user.mapper;

import com.qcshop.user.entity.UserFeatureOperLog;

public interface UserFeatureOperLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserFeatureOperLog record);

    int insertSelective(UserFeatureOperLog record);

    UserFeatureOperLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserFeatureOperLog record);

    int updateByPrimaryKey(UserFeatureOperLog record);
}