package com.zby.server01.service.impl;

import com.zby.server01.dao.ProjectMapper;
import com.zby.server01.pojo.Project;
import com.zby.server01.pojo.ProjectExample;
import com.zby.server01.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Properties;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectMapper projectMapper;

    @Override
    public int createProject(Project project) {
        if (projectMapper.insertSelective(project)>0){
            return 1;
        }
        return 0;
    }

    @Override
    public int deleteProject(long uid, long projectId) {
        ProjectExample projectExample = new ProjectExample();
        ProjectExample.Criteria criteria = projectExample.createCriteria();
        criteria.andUidEqualTo(uid);
        criteria.andProject_idEqualTo(projectId);
        return projectMapper.deleteByExample(projectExample);
    }

    @Override
    public int modifyProject(long projectId, long uid, String name, String info, long teamId) {
        ProjectExample projectExample = new ProjectExample();
        ProjectExample.Criteria criteria =projectExample.createCriteria();
        criteria.andProject_idEqualTo(projectId);

        Project project = new Project();
        project.setUid(uid);
        project.setName(name);
        project.setInfo(info);
        project.setTeam_id(teamId);

        return projectMapper.updateByExampleSelective(project,projectExample);
    }

    @Override
    public Project findProjectById(long projectId) {
       ProjectExample projectExample = new ProjectExample();
       ProjectExample.Criteria criteria = projectExample.createCriteria();
       criteria.andProject_idEqualTo(projectId);
       List<Project> list = projectMapper.selectByExample(projectExample);
       if (list.isEmpty()){
           return null;
       }
       else
           return list.get(0);
    }

    @Override
    public List<Project> getProjectsByUid(long uid) {
        ProjectExample projectExample = new ProjectExample();
        ProjectExample.Criteria criteria = projectExample.createCriteria();
        criteria.andUidEqualTo(uid);
        List<Project> list = projectMapper.selectByExample(projectExample);
        if (list.isEmpty()){
            return null;
        }else
            return list;
    }
}
