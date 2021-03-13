package com.zby.server01.dao;

import com.zby.server01.pojo.GroupTask;
import com.zby.server01.pojo.GroupTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupTaskMapper {
    long countByExample(GroupTaskExample example);

    int deleteByExample(GroupTaskExample example);

    int deleteByPrimaryKey(Long group_task_id);

    int insert(GroupTask record);

    int insertSelective(GroupTask record);

    List<GroupTask> selectByExample(GroupTaskExample example);

    GroupTask selectByPrimaryKey(Long group_task_id);

    int updateByExampleSelective(@Param("record") GroupTask record, @Param("example") GroupTaskExample example);

    int updateByExample(@Param("record") GroupTask record, @Param("example") GroupTaskExample example);

    int updateByPrimaryKeySelective(GroupTask record);

    int updateByPrimaryKey(GroupTask record);
}