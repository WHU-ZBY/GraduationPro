package com.zby.server01.dao;

import com.zby.server01.pojo.TeamMember;
import com.zby.server01.pojo.TeamMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamMemberMapper {
    long countByExample(TeamMemberExample example);

    int deleteByExample(TeamMemberExample example);

    int deleteByPrimaryKey(Long team_member_id);

    int insert(TeamMember record);

    int insertSelective(TeamMember record);

    List<TeamMember> selectByExample(TeamMemberExample example);

    TeamMember selectByPrimaryKey(Long team_member_id);

    int updateByExampleSelective(@Param("record") TeamMember record, @Param("example") TeamMemberExample example);

    int updateByExample(@Param("record") TeamMember record, @Param("example") TeamMemberExample example);

    int updateByPrimaryKeySelective(TeamMember record);

    int updateByPrimaryKey(TeamMember record);
}