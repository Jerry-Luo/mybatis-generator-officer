package com.qiancang.qcshop.msg.config.dao;

import com.qiancang.qcshop.msg.config.model.MsgMassSend;

public interface MsgMassSendMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MsgMassSend record);

    int insertSelective(MsgMassSend record);

    MsgMassSend selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MsgMassSend record);

    int updateByPrimaryKeyWithBLOBs(MsgMassSend record);

    int updateByPrimaryKey(MsgMassSend record);
}