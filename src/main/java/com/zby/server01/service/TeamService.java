package com.zby.server01.service;

import com.zby.server01.pojo.Team;
import com.zby.server01.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TeamService {
    int createTeam(String name,long uid);
    int deleteTeam(long teamId);
    int addTeamMembers(long teamId,long uid);
    List<User> getTeamMembers(long teamId);
    List<Team> getALlTeams(long uid);
    int modifyTeamName(long uid,long teamId,String re_name);

}
