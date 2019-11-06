package com.qiancang.qcshop.msg.config.dao;

import com.qiancang.qcshop.msg.config.model.MsgTemplate;

public interface MsgTemplateMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MsgTemplate record);

    int insertSelective(MsgTemplate record);

    MsgTemplate selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MsgTemplate record);

    int updateByPrimaryKeyWithBLOBs(MsgTemplate record);

    int updateByPrimaryKey(MsgTemplate record);
}