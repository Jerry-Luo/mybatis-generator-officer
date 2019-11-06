package com.qiancang.qcshop.msg.config.dao;

import com.qiancang.qcshop.msg.config.model.MsgTemplateVariable;

public interface MsgTemplateVariableMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MsgTemplateVariable record);

    int insertSelective(MsgTemplateVariable record);

    MsgTemplateVariable selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MsgTemplateVariable record);

    int updateByPrimaryKey(MsgTemplateVariable record);
}