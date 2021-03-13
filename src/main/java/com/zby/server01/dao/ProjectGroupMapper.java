package com.zby.server01.dao;

import com.zby.server01.pojo.ProjectGroup;
import com.zby.server01.pojo.ProjectGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectGroupMapper {
    long countByExample(ProjectGroupExample example);

    int deleteByExample(ProjectGroupExample example);

    int deleteByPrimaryKey(Long project_group_id);

    int insert(ProjectGroup record);

    int insertSelective(ProjectGroup record);

    List<ProjectGroup> selectByExample(ProjectGroupExample example);

    ProjectGroup selectByPrimaryKey(Long project_group_id);

    int updateByExampleSelective(@Param("record") ProjectGroup record, @Param("example") ProjectGroupExample example);

    int updateByExample(@Param("record") ProjectGroup record, @Param("example") ProjectGroupExample example);

    int updateByPrimaryKeySelective(ProjectGroup record);

    int updateByPrimaryKey(ProjectGroup record);
}