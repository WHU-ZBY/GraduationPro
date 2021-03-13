package com.zby.server01.service.impl;

import com.zby.server01.dao.TeamMapper;
import com.zby.server01.dao.TeamMemberMapper;
import com.zby.server01.dao.UserMapper;
import com.zby.server01.pojo.*;
import com.zby.server01.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    private TeamMapper teamMapper;
    @Autowired
    private TeamMemberMapper teamMemberMapper;
    @Autowired
    private UserMapper userMapper;
    @Override
    public int createTeam(String name, long uid) {
        Team team = new Team();
        team.setName(name);
        team.setNum(1);
        team.setCreator(uid);
        return teamMapper.insertSelective(team);
    }

    @Override
    public int deleteTeam(long teamId) {
        return teamMapper.deleteByPrimaryKey(teamId);
    }

    @Override
    public int addTeamMembers(long teamId,long uid) {
        TeamExample teamExample = new TeamExample();
        TeamExample.Criteria criteria = teamExample.createCriteria();
        criteria.andTeam_idEqualTo(teamId);

        Team team = teamMapper.selectByPrimaryKey(teamId);
        int num = team.getNum()+1;
        team.setNum(num);
        return teamMapper.updateByExampleSelective(team,teamExample);

    }

    @Override
    public List<User> getTeamMembers(long teamId) {
        TeamMemberExample teamMemberExample = new TeamMemberExample();
        TeamMemberExample.Criteria criteria = teamMemberExample.createCriteria();
        criteria.andTeam_idEqualTo(teamId);
        List<TeamMember> teamMemberList =teamMemberMapper.selectByExample(teamMemberExample);
        if (teamMemberList.isEmpty()){
            return null;
        }
        List<User> users = new ArrayList<>();
        for(TeamMember item : teamMemberList)
        {
            User user = userMapper.selectByPrimaryKey(item.getUid());
            users.add(user);
        }
        return users;


    }

    @Override
    public List<Team> getALlTeams(long uid) {
        TeamMemberExample teamMemberExample = new TeamMemberExample();
        TeamMemberExample.Criteria criteria = teamMemberExample.createCriteria();
        criteria.andUidEqualTo(uid);
        List<TeamMember> list = teamMemberMapper.selectByExample(teamMemberExample);
        if (list.isEmpty())
            return null;

        List<Team> teams = new ArrayList<>();
        for(TeamMember item:list){
            teams.add(teamMapper.selectByPrimaryKey(item.getTeam_id()));
        }
        return teams;

    }

    @Override
    public int modifyTeamName(long uid, long teamId, String re_name) {
        TeamExample teamExample = new TeamExample();
        TeamExample.Criteria criteria = teamExample.createCriteria();
        criteria.andTeam_idEqualTo(teamId);

        Team team = teamMapper.selectByPrimaryKey(teamId);
        if (uid!=team.getCreator())
            return 0;
        Team re_team = new Team();
        team.setName(re_name);
        return teamMapper.updateByExampleSelective(re_team,teamExample);

    }
}
