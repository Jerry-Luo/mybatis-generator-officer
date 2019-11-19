package com.qiancang.qcshop.credits.dao;

import com.qiancang.qcshop.credits.model.DuibaVirtualConsume;

public interface DuibaVirtualConsumeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DuibaVirtualConsume record);

    int insertSelective(DuibaVirtualConsume record);

    DuibaVirtualConsume selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DuibaVirtualConsume record);

    int updateByPrimaryKey(DuibaVirtualConsume record);
}