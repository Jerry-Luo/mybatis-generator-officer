package com.qiancang.qcshop.credits.dao;

import com.qiancang.qcshop.credits.model.DuibaVirtualConsume;
import com.qiancang.qcshop.credits.model.DuibaVirtualConsumeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DuibaVirtualConsumeMapper {
    int countByExample(DuibaVirtualConsumeExample example);

    int deleteByExample(DuibaVirtualConsumeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DuibaVirtualConsume record);

    int insertSelective(DuibaVirtualConsume record);

    List<DuibaVirtualConsume> selectByExample(DuibaVirtualConsumeExample example);

    DuibaVirtualConsume selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DuibaVirtualConsume record, @Param("example") DuibaVirtualConsumeExample example);

    int updateByExample(@Param("record") DuibaVirtualConsume record, @Param("example") DuibaVirtualConsumeExample example);

    int updateByPrimaryKeySelective(DuibaVirtualConsume record);

    int updateByPrimaryKey(DuibaVirtualConsume record);
}